package app.khanhlm091.foodicli.database;

import app.khanhlm091.foodicli.model.Food;

import java.util.ArrayList;
import java.util.List;

public class FoodDatabase {
    public static List<Food> foodList = new ArrayList<>();

    public static List<Food> getFoodList() { return foodList; }
}
