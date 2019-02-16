package com.company;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products = new HashMap<Product,Integer>();

    public Bill(Customer detailCustomer){
        detailCustomer = customer;
    }
    public void addProduct (Product produit,Integer nombre) {
        this.products.put(produit, nombre);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
