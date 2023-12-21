package com.driver;

public class Pizza {
    protected int basePrice;
    protected boolean extraCheeseAdded;
    protected boolean toppingsAdded;
    protected boolean paperBagAdded;

    public Pizza(int basePrice) {
        this.basePrice = basePrice;
        this.extraCheeseAdded = false;
        this.toppingsAdded = false;
        this.paperBagAdded = false;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            // Add extra cheese only if not added before
            this.basePrice += 80;
            this.extraCheeseAdded = true;
        }
    }

    public void addToppings(int price) {
        if (!toppingsAdded) {
            // Add toppings only if not added before
            this.basePrice += price;
            this.toppingsAdded = true;
        }
    }

    public void addPaperBag() {
        if (!paperBagAdded) {
            this.basePrice += 20;
            this.paperBagAdded = true;
        }
    }

    public int calculateTotal() {
        return this.basePrice;
    }

    public String generateBill() {
        // Generate bill with itemized details
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(this.basePrice).append("\n");
        if (extraCheeseAdded) bill.append("Extra Cheese Added: 80\n");
        if (toppingsAdded) bill.append("Extra Toppings Added: ").append(this.basePrice - (extraCheeseAdded ? 80 : 0)).append("\n");
        if (paperBagAdded) bill.append("Paperbag Added: 20\n");
        bill.append("Total Price: ").append(calculateTotal()).append("\n");
        return bill.toString();
    }
}
