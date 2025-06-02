package app.khanhlm091.foodicli.controller;

import app.khanhlm091.foodicli.database.FoodDatabase;
import app.khanhlm091.foodicli.model.Food;
import app.khanhlm091.foodicli.view.MenuView;
import app.khanhlm091.foodicli.service.*;

import java.util.Scanner;
import static java.lang.System.exit;

public class MainController {
    private MenuView menu;
    private FoodService foodService;
    private CartService cartService;

    public MainController(MenuView menu, FoodService foodService, CartService cartService) {
        this.menu = menu;
        this.foodService = foodService;
        this.cartService = cartService;
    }

    public void start() {
        boolean running = true;

        while (running) {
            menu.displayMainMenu();
            int option = new Scanner(System.in).nextInt();
            handleMenuSelection(option);
        }
    }

    public void handleMenuSelection(int option) {
        switch (option) {
            case 1:
                System.out.println("Exiting...");
                exit(1);

            case 2:
                FoodService.addFood();
                for (Food food : FoodService.getAllFoods()) {
                    System.out.println(food.getName());
                }
        }
    }
}
