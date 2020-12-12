/*
        Depot.java - Assignment 2
        *Author: Emily Conlon
        *Student No: 3331128
        *Date: 31/05/2019
        *Description:
         Depot class for Assignment 2 Program
*/
import java.util.*;
public class Depot
{
    private String name; //Depot name
    private double value;
    public Product[] productArray = new Product[5];
    
    //Constructor
    public Depot () {
        name = "empty";
        Product[] productArray = new Product[5];
    }

    //Set depot name
    public void setDName(String newName) {
        this.name = newName ;
    }
    
    //Get depot name
    public String getDName() {
        return name;
    }
}