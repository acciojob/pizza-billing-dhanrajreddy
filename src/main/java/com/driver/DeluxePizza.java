package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(int basePrice) {
        super(basePrice + 80); // Deluxe pizza includes extra cheese by default
        this.extraCheeseAdded = true; // Extra cheese added by default
        this.toppingsAdded = true; // Deluxe pizza includes toppings by default
    }
}