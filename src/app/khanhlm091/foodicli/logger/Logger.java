package app.khanhlm091.foodicli.logger;

public class Logger {
    public static void getMessage(String message) {
        System.out.println(message);
    }

    public static void getError(Exception e) {
        System.out.println("[ERROR] " + e.getMessage());
    }
}
