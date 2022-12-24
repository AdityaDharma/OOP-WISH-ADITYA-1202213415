package TPMODUL3_ADITYA;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Restaurant restoran = new Restaurant();
        int customerID, orderQty;
        try {
            System.out.println("Enter Customer ID: ");
            customerID = sc.nextInt();

            System.out.println("Enter how much food to made: ");
            orderQty = sc.nextInt();

            Thread t1 = new Thread(restoran);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread t2 = new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        }
        catch (Exception e) {
            System.out.println("Input must Integer");
        }
    sc.close();
    }
}