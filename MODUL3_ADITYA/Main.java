package MODUL3_ADITYA;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  private static boolean repeat = true;
  private static boolean report = false;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculation calculation = new Calculation();
    Thread th = new Thread(calculation);
    th.start();

    
    do {
      try {
        System.out.println("Menu:");
        System.out.println("1. Calculate area of square");
        System.out.println("2. Calculate area of circle");
        System.out.println("3. Calculate area of trapezoid");
        System.out.println("0. Exit");
        System.out.print("Enter option: ");
        
        int option = sc.nextInt();
        switch (option) {
          case 1:
            System.out.print("Enter side of square: ");
            double side = sc.nextDouble();
            calculation.setSquare(side);
            report = true;
            break;
          case 2:
            System.out.print("Enter radius of circle: ");
            double radius = sc.nextDouble();
            calculation.setCircle(radius);
            report = true;
            break;
          case 3:
            System.out.print("Enter side A of trapezoid: ");
            double a = sc.nextDouble();
            System.out.print("Enter side B of trapezoid: ");
            double b = sc.nextDouble();
            System.out.print("Enter height of trapezoid: ");
            double t = sc.nextDouble();
            calculation.setTrapezoid(a, b, t);
            report = true;
            break;
          case 0:
            System.out.println("Program finished.");
            repeat = false;
            break;
          default:
            System.out.println("Option not available.");
            continue;
        }
      } catch (InputMismatchException e) {
        System.out.println("Error: Input must be a number.");
      } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    //   } catch (InterruptedException e) {
    //     System.out.println("Error: " + e.getMessage());
      }
    } while (repeat);
    sc.close();
  }
}