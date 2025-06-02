package app.khanhlm091.foodicli.model;

public class Food {
    private int id;
    private int price;
    private String name;
    private String description;

    public Food(int id, int price, String name, String description) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    // Getter
    public int getId() { return id; }
    public int getprice() { return price; }
    public String getName() { return name; }
    public String getDescription() { return description; }

    // Setter
    public void setId(int id) { this.id = id; }
    public void setPrice(int price) { this.price = price; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
}
