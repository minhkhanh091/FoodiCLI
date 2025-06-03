package app.khanhlm091.foodicli.database;

import app.khanhlm091.foodicli.model.Food;

import java.util.ArrayList;
import java.util.List;

public class FoodDatabase {
    private static List<Food> foodList = new ArrayList<>();

    public static List<Food> getFoodList() { return foodList; }

    public static void addFood(Food food) {
        foodList.add(food);
    }
}
