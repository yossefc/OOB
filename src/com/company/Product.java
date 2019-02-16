package com.company;

import java.lang.String;

public class Product {


    protected String name;
    protected String description;
    protected double price;

    /**
     *
     * @param Name
     * @param Description
     * @param Price
     */
    public void Product(String Name, String Description, double Price){
       name = Name;
       description = Description;
       price = Price;
    }

    /**
     *
     * @return
     */
    public String getname(){
        return name;
    }

    /**
     *
     * @param Name
     */
    public void setname(String Name){
        this.name = Name;
    }
    /**
     * display the facture
     */
    public void look(){
        System.out.println(String.format(name + " : " + price + "%n" + description));
    }


    /**
     *
     * @param bill
     * @param quantity
     */
    public void buy(Bill bill,int quantity){

    }
}
