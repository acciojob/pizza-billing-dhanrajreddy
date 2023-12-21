package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVej){
        super(isVej);
        addExtraCheese();
        addExtraToppings();
        System.out.println(getBill());
    }
}

