package com.driver;

public class Pizza {
    boolean addCheese;
    boolean addTapimg;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            price+=300;
        else
            price+=400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
            if(!addCheese){
                price+=80;
                addCheese=true;
            }
               
    }

    public void addExtraToppings(){
        // your code goes here
       if(!addTapimg){
         if(isVeg)
            price+=70;
        else
            price+=120;
        addTapimg=true;
       }

    }

    public void addTakeaway(){
        // your code goes here
        price+=20;
    }

    public String getBill(){
        // your code goes here
        getPrice();
        return this.bill;
    }
}
