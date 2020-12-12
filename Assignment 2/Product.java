/*
        Product.java - Assignment 2
        *Author: Emily Conlon
        *Student No: 3331128
        *Date: 31/05/2019
        *Description:
         Product class for Assignment 2 Program
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

    //Constructor
    public Product () {
        name = "empty";
        price = 0;
        weight = 0;
        quantity = 0;
    }

    //Set Product name
    public void setName(String productName) {
        this.name = productName;
    }

    //Get Product name
    public String getName() {
        return name;
    }

    //Set Product price
    public void setPrice(double productPrice) {
        this.price = productPrice;       
    }

    //Get Product price
    public double getPrice() {
        return price;
    }

    //Set Product weight (kg)
    public void setWeight(double productWeight) {
        this.weight = productWeight;   
    }

    //Get Product weight (kg)
    public double getWeight() {
        return weight;
    }

    //Set Product quantity
    public void setQuantity(int productQuantity) {
        this.quantity = productQuantity;       
    }

    //Get Product quantity
    public int getQuantity() {
        return quantity;
    }   
}