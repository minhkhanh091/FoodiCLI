package app.khanhlm091.foodicli.model;

import app.khanhlm091.foodicli.model.Food;

public class CartItem {
    private Food food;
    private int quality;

    CartItem(Food food, int quality) {
        this.food = food;
        this.quality = quality;
    }

    // Getter
    public Food getFood() { return food; }
    public int getQuality() { return quality; }
    public double getTotalPrice() { return food.getprice() * quality; }

    // Setter
    public void setFood(Food food) { this.food = food; }
    public void setQuality(int quality) { this.quality = quality; }
}
