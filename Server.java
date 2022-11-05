package MODUL1;
import java.util.Scanner;
public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database;

        // TODO Create Menu
        Menu m1 = new Menu();
        m1.setName(name:"Bakso (Food): Rp 10.000");
        m1.setName(name:"Mie (Food): Rp 5.000");
        m1.setName(name:"Apple Juice (Drinks): Rp 5.000");

        Menu m2 = new Menu();
        m2.setName(name:"Ceker (Food): Rp 10.000");
        m2.setName(name:"Brownies (Dessert): Rp 25.000");
        m2.setName(name:"Chocolate (Drinks): Rp 10.000");

        Menu m3 = new Menu();
        m3.setName(name:"Sapi Bakar (Food): Rp 100.000");
        m3.setName(name:"Kangkung (Food): Rp 8.000");
        m3.setName(name:"Ekstra Jos (Drinks): Rp 3.000");

        // TODO Insert Menu to Database
        db.insertMenu (m1);
        db.insertMenu (m2);
        db.insertMenu (m3);
        
        // TODO Display Main Menu
        System.out.println("Selamat Datang di Restaurant EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("====================================");

        Scanner sc = 
        
        // TODO Create User.

        // Display Menu
    
