/*
        Interface.java - Assignment 1
        *Author: Emily Conlon
        *Student No: 3331128
        *Date: 04/05/19
        *Description:
         Interface class for Assignment 1 Program
*/ 

import java.util.*;
public class Interface {
    private Depot depot1, depot2;
    private Product product1, product2, product3;
	
    public static void main (String[]args) {

        Interface intFace = new Interface();
        do {
            intFace.run();
        } while (true);


    }

    public void run() {

      
        
        Scanner in = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        int choice = 10;
        int depotChoice = 10;
        int productChoice = 10;
        int depotDelete = 10;
        int depotProductChoice = 10;
        int depotDeleteProduct = 10;
        int depotCalculate = 10;
        double cumulativeValue = 1;
        String searchQuery;

        //Display menu
        System.out.println("");

        System.out.println("Main Menu: ");

        System.out.println("");
        System.out.println("1       Add a new depot");
        System.out.println("2       Remove a depot");
        System.out.println("3       Add a new product to an existing depot");
        System.out.println("4       Remove an existing product");
        System.out.println("5       Show existing depots");
        System.out.println("6       Show existing products");
        System.out.println("7       Search for a product");
        System.out.println("8       Calculate depot value");
        System.out.println("9       Exit program");

        System.out.println("");

        //Input validation loop
        do {
            System.out.println("Please enter your choice: ");

            try {

                choice = in.nextInt();

                System.out.println("");

                //Display chosen function
                switch (choice) {
                    case 1:
                        System.out.println("~Adding a new depot~");
                        break;
                    case 2:
                        System.out.println("~Removing an existing depot~");
                        break;
                    case 3:
                        System.out.println("~Adding a new product~");
                        break;
                    case 4:
                        System.out.println("~Removing an existing product~");
                        break;
                    case 5:
                        System.out.println("~Existing depots~");
                        break;
                    case 6:
                        System.out.println("~Existing products~");
                        break;
                    case 7:
                        System.out.println("~Searching for product~");
                        break;
                    case 8:
                        System.out.println("~Calculating total depot value~");
                        break;
                    case 9:
                        System.out.println("Exiting program...");
                        System.exit(0);
                        break;
                }
            } catch (InputMismatchException a) {
                System.out.println("Invalid input. Please try again.");
                in.next();
            }

            if (choice <= 0) {
                System.out.println("Invalid input. Please try again.");
            }

        } while (choice <= 0);

        //Add a new depot
        if (choice == 1) {

            //Display depot slots 
            do {
                System.out.println("Please enter your chosen depot slot: "); 
                System.out.println("");

                System.out.println("1       [ Depot 1 ]");
                System.out.println("2       [ Depot 2 ]");

                try {
                        System.out.println("");
                        depotChoice = in.nextInt();

                        System.out.println("");

                        //Add new depot
                        switch (depotChoice) {
                            case 1:
                                System.out.println("[ Depot 1 ]");
                                Depot depot1 = new Depot();
                                System.out.println("");
                                System.out.println("Please enter name of new depot: ");
                                depot1.setDName(depot1.getDName());
                                System.out.println(depot1.getDName());
                                break;
                            case 2:
                                System.out.println("[ Depot 2 ]");
                                Depot depot2 = new Depot();
                                System.out.println("");
                                System.out.println("Please enter name of new depot: ");
                                depot2.setDName(depot2.getDName());
                                System.out.println(depot2.getDName());
                                break;
                        } 

                    } catch (InputMismatchException a) {
                        System.out.println("Invalid input. Please try again.");
                        in.next();
                        }

            } while (depotChoice <= 0);                  
        }
        
        //Remove a depot
        if (choice == 2) {
            do {
                System.out.println("Please enter depot slot to delete: "); 
                System.out.println("");

                System.out.println("1       [ Depot 1 ]");
                System.out.println("2       [ Depot 2 ]");

                try {

                        depotDelete = in.nextInt();

                        System.out.println("");

                        
                        switch (depotDelete) {
                            case 1:
                                System.out.println(" Deleting [ Depot 1 ]...");
                                depot1 = null;
                                System.gc();
                                break;
                            case 2:
                                System.out.println("Deleting [ Depot 2 ]...");
                                depot2 = null;
                                System.gc();
                                break;
                        } 

                    } catch (InputMismatchException a) {
                        System.out.println("Invalid input. Please try again.");
                        in.next();
                        }

            } while (depotDelete <= 0);                  
        }

        //Add a new product
        if (choice == 3) {

            //Display depots
            do {
                System.out.println("Please enter depot you wish to add a new product to: "); 
                System.out.println("");

                System.out.println("1       [ Depot 1 ]");
                System.out.println("2       [ Depot 2 ]");


                try {

                        depotProductChoice = in.nextInt();

                        System.out.println("");

                        
                        switch (depotProductChoice) {
                            case 1:
                                System.out.println("[ Depot 1 ]");
                                depot1.addProductD(product1);
                                break;
                            case 2:
                                System.out.println("[ Depot 2 ]");
                                depot2.addProductD(product1);
                                break;
                        } 

                    } catch (InputMismatchException a) {
                        System.out.println("Invalid input. Please try again.");
                        in.next();
                        }

            } while (depotProductChoice <= 0);                  
        }
        
        //Remove a product
        if (choice == 4) {
            do {
                System.out.println("Please enter depot slot to delete product: "); 
                System.out.println("");

                System.out.println("1       [ Depot 1 ]");
                System.out.println("2       [ Depot 2 ]");

                try {

                        depotDeleteProduct = in.nextInt();

                        System.out.println("");

                        
                        switch (depotDeleteProduct) {
                            case 1:
                                depot1.deleteProductD(product1);
                                System.gc();
                                break;
                            case 2:
                                depot2.deleteProductD(product1);
                                System.gc();
                                break;
                        } 

                    } catch (InputMismatchException a) {
                        System.out.println("Invalid input. Please try again.");
                        in.next();
                        }

            } while (depotDeleteProduct <= 0);                  
        }   

        //Display existing depots
        if (choice == 5) {
            try {

                System.out.println("");
                System.out.println("[ Depot 1 ]");
                System.out.println("Name: "+ depot1.getDName());
                System.out.println("");


            } catch (NullPointerException e) {

                System.out.println("");
                System.out.println("[ Depot 1 ]");
                System.out.println("Depot 1 does not exist.");

            }

             try {

                System.out.println("");
                System.out.println("[ Depot 2 ]");
                System.out.println("Name: " + depot2.getDName());
                System.out.println("");

            } catch (NullPointerException e) {

                System.out.println("");
                System.out.println("[ Depot 2 ]");
                System.out.println("Depot 2 does not exist.");

            }
        }

        //Display existing products
        if (choice == 6) {

            try {

                System.out.println("");
                System.out.println("[ Depot 1 ]");
                depot1.displayProducts();
                System.out.println("");

            } catch (NullPointerException e) {

                System.out.println("");
                System.out.println("[ Depot 1 ]");
                System.out.println("Depot 1 does not exist.");
            } 
                
            try {
                
                System.out.println("[ Depot 2 ]");
                depot2.displayProducts();
                System.out.println("");

            } catch (NullPointerException e) {
                
                System.out.println("");
                System.out.println("[ Depot 2 ]");
                System.out.println("Depot 2 does not exist.");
            }        
        }

        //Search for a product
        if (choice == 7) {
            System.out.println("");
            System.out.println("Please enter name of product: ");
            searchQuery = scanner.nextLine();
        }

        //Calculate total value of depot
        if (choice == 8) {
            do {
                System.out.println("Please enter depot slot to calculate value of: "); 
                System.out.println("");

                System.out.println("1       [ Depot 1 ]");
                System.out.println("2       [ Depot 2 ]");

                try {

                        depotCalculate = in.nextInt();

                        System.out.println("");

                        
                        switch (depotCalculate) {
                            case 1:
                                System.out.println("Calculating total value of [ Depot 1 ]...");
                                cumulativeValue = depot1.calculateValue();
                                System.out.println("Total value of Depot 1 is: " + cumulativeValue);
                                break;
                            case 2:
                                System.out.println("Calculating total value of [ Depot 2 ]...");
                                cumulativeValue = depot2.calculateValue();
                                System.out.println("Total value of Depot 2 is: " + cumulativeValue);
                                break;
                        } 

                    } catch (InputMismatchException a) {
                        System.out.println("Invalid input. Please try again.");
                        in.next();
                        }

            } while (depotCalculate <= 0);                  
        }
            
    }
}    

        
