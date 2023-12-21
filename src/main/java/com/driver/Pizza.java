package com.driver;
import java.net.StandardSocketOptions;
public class Pizza {
    private int price, takeAwayPrice, cheesPrice, toppingPrice,basePrice;
    private boolean  takeAway, cheese, topping,isBill;
    private String bill;


    public Pizza(boolean isVeg) {
        bill="";
        if (isVeg) {
            price = 300;
            basePrice=300;
            takeAwayPrice = 20;
            cheesPrice = 80;
            toppingPrice = 70;
        } else {
            price = 400;
            basePrice=400;
            takeAwayPrice = 20;
            cheesPrice = 80;
            toppingPrice = 120;
        }
    }


    public void addExtraCheese(){
        // your code goes here
        if (!cheese){
            cheese= true;
          //  price+=cheesPrice;
        }
    }
    public void addExtraToppings(){
        // your code goes here
        if (!topping){
            topping= true;
          //  price+=toppingPrice;
        }
    }
    public void addTakeaway(){
        // your code goes here
        if (!takeAway){
            takeAway=true;
           // price+=takeAwayPrice;
        }

    }


    public String getBill() {
        if(!isBill){
            bill += "Base Price Of The Pizza: " + this.basePrice+ "\n";
            if (cheese)
                bill += "Extra Cheese Added: " + cheesPrice + "\n";
            if (topping)
                bill += "Extra Toppings Added: " + toppingPrice + "\n";

            if (takeAway)
                bill += "Paperbag Added: " + (takeAwayPrice) + "\n";
            bill += "Total Price: " +getPrice() +"\n";
            isBill=true;
            return bill;
        }
        return bill;
    }

    public int getPrice()  {
        int total=0;
        if(cheese)
            total+=cheesPrice;
        if(topping)
            total+=toppingPrice;
        if(takeAway)
            total+=takeAwayPrice;
        return price+total;
    }
}

