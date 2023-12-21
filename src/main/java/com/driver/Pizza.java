package com.driver;

import java.net.StandardSocketOptions;

public class Pizza {
    private int price, pacKageprice, sosPrice, toppingPrice, count;
    private boolean isVej, pack, sos, topping;
    private String bill;
    boolean isdeal;

    public Pizza(boolean isVej) {
        price = 0;
        count = 0;
        isdeal = false;
        pack = false;
        sos = false;
        topping = false;
        bill = "";
        this.isVej = isVej;
        if (isVej == true) {
            price = 300;
            pacKageprice = 20;
            sosPrice = 80;
            toppingPrice = 70;
        } else {
            price = 400;
            pacKageprice = 20;
            sosPrice = 80;
            toppingPrice = 120;
        }
    }

//    public void methodPrice(){
//        if (isdeal)
//            price+=(sosPrice+toppingPrice);
//    }

    public void addTakeaway() {
        count++;
        pack = true;
    }

    public void addExtraCheese() {
        sos = true;

    }

    public void addExtraToppings() {
        topping = true;

    }

    public void delPizzaCall() {
        sos = true;
        topping = true;
    }

    public String getBill() {
            bill += "Base Price Of The Pizza: " + this.price+ "\n";
        if (sos)
            bill += "Extra Cheese Added: " + sosPrice + "\n";
        if (topping)
            bill += "Extra Toppings Added: " + toppingPrice + "\n";

        if (pack)
            bill += "Paperbag Added: " + (pacKageprice) + "\n";
        bill += "Total Price: " + this.getPriceCount() + "\n";
        return bill;
    }

    public int getPrice(){
        System.out.print("Base Price Of The Pizza: ");
        return price;
    }

    public int getPriceCount() {
        int total=0;
        if(sos){
           total += sosPrice;
        }
        if(topping)
            total += toppingPrice;
        if (pack)
            total += (pacKageprice);
        return price+total;
    }
}
