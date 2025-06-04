package app.khanhlm091.foodicli;

import app.khanhlm091.foodicli.database.StoreList;
import app.khanhlm091.foodicli.service.*;
import app.khanhlm091.foodicli.controller.MainController;
import app.khanhlm091.foodicli.view.MenuView;


public class Application {
    public static void main(String[] args) {
        StoreList.initializeStoreListFromFile(15);

        MenuView menu = new MenuView();
        FoodService foodService = new FoodService();
        CartService cartService = new CartService();
        MainController controller = new MainController(menu, foodService, cartService);

        // Start app
        controller.start();
    }
}
