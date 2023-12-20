package com.driver;

public class Pizza{
    private int price,pacKageprice,sosPrice,toppingPrice,count;
    private boolean isVej,pack,sos,topping;
    private String bill;
     boolean isdeal;

    public Pizza(boolean isVej){
        System.out.println("constructor called");
        price=0;
        count=0;
        isdeal=false;pack=false;sos=false;topping=false;
        bill="";
        this.isVej=isVej;
        if(isVej==true){
            price=300;
            pacKageprice=20;
            sosPrice=80;
            toppingPrice=70;
        }else{
            price=400;
            pacKageprice=20;
            sosPrice=80;
            toppingPrice=120;
        }
    }

    public void addTakeaway(){
        count++;
        pack=true;
    }

    public void addExtraCheese(){
        sos=true;
    }

    public void addExtraToppings(){
        topping=true;
    }

    public void delPizzaCall(){
        sos=true;
        topping=true;
    }

    public String getBill(){
        if(sos)
            bill+="sos price: "+sosPrice+"\n";
        if (topping)
            bill+="topping price: "+toppingPrice+"\n";
        
        if (pack)
            bill+="pack price : "+(count*pacKageprice)+"\n";
        bill+="Total price : "+this.getPrice()+"\n";
        return bill;
    }

    public int getPrice(){
        if(sos)
            price+=sosPrice;
        if (topping)
            price+=toppingPrice;
        if (pack)
            price+=(count*pacKageprice);
        return price;
    }
}