package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        if(!addCheese)
            super.addExtraCheese();
            super.addExtraToppings();
        // your code goes here
    }
}

