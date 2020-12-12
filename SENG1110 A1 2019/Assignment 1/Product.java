/*
        Product.java - Assignment 1
        *Author: Emily Conlon
        *Student No: 3331128
        *Date: 04/05/19
        *Description:
         Product class for Assignment 1 Program
*/
import java.util.*;
public class Product {

    /*
    Instance variables
    Each Product will have a name, price, weight and quantity.
    */

    private String name;  //Product name
    private double price;  //Product price
    private double weight;  //Product weight (kg)
    private int quantity;  //Product quantity

    Scanner scanner = new Scanner(System.in);


    //Constructor
    public Product () {
        name = "empty";
        price = 0;
        weight = 0;
        quantity = 0;
    }

    //Set Product name
    public void setName(String productName) {
        name = productName;
        name = scanner.nextLine();
        name.toLowerCase();
    }

    //Get Product name
    public String getName() {
        return name;
    }

    //Set Product price
    public void setPrice(double productPrice) {
        do {
            price = productPrice;
            price = scanner.nextDouble();
            
            if (price <= 0) 
                System.out.println("Incorrect input. Price cannot be negative. Please try again.");
        } while (price <= 0);    
        
    }

    //Get Product price
    public double getPrice() {
        return price;
    }

    //Set Product weight (kg)
    public void setWeight(double productWeight) {
        do {
            weight = productWeight;
            weight = scanner.nextDouble();
            
            if (weight <= 0)
                System.out.println("Incorrect input. Weight cannot be negative. Please try again.");
        } while (weight <=0);    
    }

    //Get Product weight (kg)
    public double getWeight() {
        return weight;
    }

    //Set Product quantity
    public void setQuantity(int productQuantity) {
        do {
            quantity = productQuantity;
            quantity = scanner.nextInt();
            
            if (quantity <= 0)
                System.out.println("Incorrect input. Quantity cannot be negative. PLease try again.");
        } while (quantity <=0);    
        
    }

    //Get Product quantity
    public int getQuantity() {
        return quantity;
    }


    public void showProductInfo () {
        System.out.println("~Product details~"); 
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Quantity: " + quantity);
    }

    public void addProduct () {
            
            Scanner in = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            int productChoice = 10;
            String response;

            //Display product slots 
            do {
                System.out.println("Please enter your chosen product slot: "); 
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
                                    System.out.println("[ Product 1 ]");
                                    Product product1 = new Product();
                                    product1.addProductValues(product1);
                                    System.out.println("Confirm? [y/n]: ");
                                    response = scanner.nextLine();
                                } while (response == "n");    
                                break;
                            case 2:
                                do {
                                    System.out.println("[ Product 2 ]");
                                    Product product2 = new Product();
                                    product2.addProductValues(product2);
                                    System.out.println("Confirm? [y/n]: ");
                                    response = scanner.nextLine();
                                } while (response == "n");
                                break;
                            case 3:
                                do {
                                    System.out.println("[ Product 3 ]");
                                    Product product3 = new Product();
                                    product3.addProductValues(product3);
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

    public void addProductValues (Product object) {
        System.out.println("");
        System.out.println("Please enter name of new product: ");
        object.setName(object.getName());
        System.out.println(object.getName());
                            
        System.out.println("");
        System.out.println("Please enter price of product: ");
        object.setPrice(object.getPrice());
        System.out.println(object.getPrice());

        System.out.println("");
        System.out.println("Please enter weight of new product: ");
        object.setWeight(object.getWeight());
        System.out.println(object.getWeight());

        System.out.println("");
        System.out.println("Please enter quantity of new product: ");
        object.setQuantity(object.getQuantity());
        System.out.println(object.getQuantity());

        System.out.println("");
        object.showProductInfo();
        System.out.println("");

    }

  
    
}