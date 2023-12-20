package com.driver;

public class Pizza {
    private boolean addCheese,addTapimg,addTakeAway,isVeg;
    private int price;
    private int cheesePrice;
    private int takeAwayPrice;
    private int toppingPrice;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price=300;
            cheesePrice=80;
            toppingPrice=70;
            takeAwayPrice=20;
        }  
        else{
            price=400;
            cheesePrice=80;
            toppingPrice=120;
            takeAwayPrice=20;
        }
           
    }

    public int getPrice(){

        int ans=this.price;
        if(addCheese)
            ans+=cheesePrice;

        if(addTapimg)
            ans+=toppingPrice;

        if(addTakeAway)
            ans+=takeAwayPrice;

        return ans;

    }

    public void addExtraCheese(){
        // your code goes here
                addCheese=true;
               
    }

    public void addExtraToppings(){
        // your code goes here
        addTapimg=true;
    }

    public void addTakeaway(){
       addTakeAway=true;
    }

    public String getBill(){
        bill="Base Price Of The Pizza: "+price +"/n";
        if(addCheese){
           bill+= "Extra Cheese Added: "+cheesePrice +"/n";
        }

        if(addTapimg){
           bill+= "Extra Toppings Added: "+toppingPrice +"/n";
        }

         if(addTakeAway){
           bill+= "Paper bag Price: "+takeAwayPrice +"/n";
        }
        bill+= "Total Price: "+getPrice();
        return bill;
    }
}

