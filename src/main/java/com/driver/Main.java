package com.driver;

public class Main {
  public static void main(String[] args) {
    // Example usage
    Pizza regularVegPizza = new Pizza(300);
    regularVegPizza.addExtraCheese();
    regularVegPizza.addToppings(70);
    regularVegPizza.addPaperBag();
    System.out.println(regularVegPizza.generateBill());

    DeluxePizza deluxeNonVegPizza = new DeluxePizza(400);
    deluxeNonVegPizza.addExtraCheese();
    deluxeNonVegPizza.addToppings(120);
    System.out.println(deluxeNonVegPizza.generateBill());
  }
}