package app.khanhlm091.foodicli.view;

import app.khanhlm091.foodicli.model.*;
import app.khanhlm091.foodicli.logger.Logger;

import java.util.List;

public class MenuView {
    public void displayMainMenu() {
        Logger.getMessage("\nFoodiCLI\n");
        Logger.getMessage("Vui lòng chọn chức năng để sử dụng");
    }

    public void displayFoodList(List<Food> foods) {

    }

    public void displayCart(List<CartItem> cart) {

    }

    public void displayMessage(String message) {

    }
}
