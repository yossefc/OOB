package com.company;

import java.lang.String;

public class Customer {
   private String fullName;
   private String adress;

   public  Customer (String fullName,String adress){
       this.fullName = fullName;
       this.adress = adress;
   }
    public String getFullName() {
        return fullName;
    }

    public String getAdress() {
        return adress;
    }
}
