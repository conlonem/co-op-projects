/*
        Depot.java - Assignment 1
        *Author: Emily Conlon
        *Student No: 3331128
        *Date: 19/04/2019
        *Description:
         Depot class for Assignment 1 Program
*/
import java.util.*;
public class Depot
{
    private String name; //Depot name
    private Product product1, product2, product3;
    private double value;

    Scanner scanner = new Scanner(System.in);

    //Constructor
    public Depot () {
        name = "empty";
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
    }

    //Set depot name
    public void setDName(String depotName) {
        name = depotName;
        name = scanner.nextLine();
        name.toLowerCase();

    }
    
    //Get depot name
    public String getDName(){
        return name;
    }

    //Add new product to depot
    public void addProductD(Product object) {
        object.addProduct();

    }

    //Delete product in depot
    public void deleteProductD(Product object) {
        Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int productChoice = 10;
        String response;

        do {
                System.out.println("Please enter your chosen product slot to delete: "); 
                System.out.println("");

                System.out.println("1       [ Product 1 ]");
                System.out.println("2       [ Product 2 ]");
                System.out.println("3       [ Product 3 ]");

                try {

                        productChoice = in.nextInt();

                        System.out.println("");

        
                        switch (productChoice) {
                            case 1:
                                do {
                                    System.out.println("Deleting [ Product 1 ]...");
                                    product1 = null;
                                    System.out.println("Confirm? [y/n]: ");
                                    response = scanner.nextLine();
                                } while (response == "n");    
                                break;
                            case 2:
                                do {
                                    System.out.println("Deleting [ Product 2 ]...");
                                    product2 = null;
                                    System.out.println("Confirm? [y/n]: ");
                                    response = scanner.nextLine();
                                } while (response == "n");
                                break;
                            case 3:
                                do {
                                    System.out.println("Deleting [ Product 3 ]...");
                                    product3 = null;
                                    System.out.println("Confirm? [y/n]: ");
                                    response = scanner.nextLine();
                                } while (response == "n");
                                break;
                        } 

                    } catch (InputMismatchException a) {
                        System.out.println("Invalid input. Please try again.");
                        in.next();
                        }

            } while (productChoice <= 0);                  
    }

    //Display all products in a depot
    public void displayProducts() {

            System.out.println("Product 1 Information: ");
            System.out.println("");
            product1.showProductInfo();

            System.out.println("");
            System.out.println("Product 2 Information: ");
            System.out.println("");
            product2.showProductInfo();    
        
            System.out.println("");
            System.out.println("Product 3 Information: ");
            System.out.println("");
            product3.showProductInfo(); 
    }

    public double calculateValue() {
        value = product1.getPrice()+product2.getPrice()+product3.getPrice();
        return value;
    }

}