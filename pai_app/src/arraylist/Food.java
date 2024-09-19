package arraylist;

public class Food {
    private String name;
    private double price;
    private String description;

    public Food(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
