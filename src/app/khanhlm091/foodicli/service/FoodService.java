package app.khanhlm091.foodicli.service;

import app.khanhlm091.foodicli.model.Food;
import app.khanhlm091.foodicli.database.FoodDatabase;

import java.util.List;

public class FoodService {
    public static List<Food> getAllFoods() { return FoodDatabase.getFoodList(); }

    public static void addFood() {
        Food food = new Food(0, 100, "Banh kem", "Banh kem thom ngon");
        FoodDatabase.addFood(food);
    }
}
