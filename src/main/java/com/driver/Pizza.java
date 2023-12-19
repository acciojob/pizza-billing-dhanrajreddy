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
        if(isVeg){
            System.out.println("Base Price Of The Pizza: 300");
            price+=300;
        }
            
        else{
             System.out.println("Base Price Of The Pizza: 400");
             price+=400;
        }
           
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
            if(!addCheese){
                System.out.println("Extra Cheese Added: 80");
                price+=80;
                addCheese=true;
            }
               
    }

    public void addExtraToppings(){
        // your code goes here
       if(!addTapimg){
         if(isVeg){
            System.out.println("Extra Toppings Added: 70");
            price+=70;
         }
            
        else{
            System.out.println("Extra Toppings Added: 120");
             price+=120;
        }  
        addTapimg=true;
       }

    }

    public void addTakeaway(){
        // your code goes here
        System.out.println("Paperbag Added: 20");
        price+=20;
    }

    public String getBill(){
        // your code goes here
        getPrice();
        bill+=price;
        addCheese=false;
        addTapimg=false;
        return bill;
    }
}
