package com.driver;
import java.net.StandardSocketOptions;
public class Pizza {
    private int price, takeAwayPrice, cheesPrice, toppingPrice;
    private boolean isVej, pack, chees, topping;
    private String bill;


    public Pizza(boolean isVej) {
        bill="";
        if (isVej) {
            price = 300;
            takeAwayPrice = 20;
            cheesPrice = 80;
            toppingPrice = 70;
        } else {
            price = 400;
            takeAwayPrice = 20;
            cheesPrice = 80;
            toppingPrice = 120;
        }
    }
    public void addTakeaway() {
        pack = true;
    }
    public void addExtraCheese() {
        chees = true;

    }
    public void addExtraToppings() {
        topping = true;

    }

    public String getBill() {
            bill += "Base Price Of The Pizza: " + this.price+ "\n";
        if (chees)
            bill += "Extra Cheese Added: " + cheesPrice + "\n";
        if (topping)
            bill += "Extra Toppings Added: " + toppingPrice + "\n";

        if (pack)
            bill += "Paperbag Added: " + (takeAwayPrice) + "\n";
        bill += "Total Price: " + this.getPrice() + "\n";
        return bill;
    }

    public int getPrice()  {
        int total=0;
        if(chees){
           total += cheesPrice;
        }
        if(topping)
            total += toppingPrice;
        if (pack)
            total += (takeAwayPrice);
        return price+total;
    }
}

