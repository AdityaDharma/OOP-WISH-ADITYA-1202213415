package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database menudb = new Database();
        // TODO Create Menu
        Menu menu = new Menu();
        menu.setNama("Fried Chicken");
        menu.setCategory("makanan");
        menu.setPrice(12000);

        Menu menu2 = new Menu();
        menu.setNama("Bakso");
        menu.setCategory("makanan");
        menu.setPrice(12000);
        
        Menu menu3 = new Menu();
        menu.setNama("Nasi");
        menu.setCategory("makanan");
        menu.setPrice(3000);
        // TODO Insert Menu to Database


        // TODO Display Main Menu

        // TODO Create User
        User menuuser = new User();
        
        // Display Menu
    }
}