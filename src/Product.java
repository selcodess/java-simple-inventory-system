public class Product {
    private String name;
    private String category;
    private double price;
    private int stockQuantity;

    public Product(String name, String category, double price, int stockQuantity) {
        this.name = name;
        this.category = category;

        if (price >= 0) {
            this.price = price;
        } else {
            this.price = 0;
            System.out.println("Invalid price for " + name + ". Price set to 0.");
        }

        if (stockQuantity >= 0) {
            this.stockQuantity = stockQuantity;
        } else {
            this.stockQuantity = 0;
            System.out.println("Invalid stock for " + name + ". Stock set to 0.");
        }
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void updateStock(int newStockQuantity) {
        if (newStockQuantity >= 0) {
            stockQuantity = newStockQuantity;
            System.out.println("Stock updated for " + name + ".");
        } else {
            System.out.println("Stock update failed. Stock cannot be negative.");
        }
    }

    public double getTotalValue() {
        return price * stockQuantity;
    }

    public void printInfo() {
        System.out.println("----------------------");
        System.out.println("Product Name: " + name);
        System.out.println("Category: " + category);
        System.out.printf("Price: %.2f EUR%n", price);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.printf("Total Value: %.2f EUR%n", getTotalValue());
    }
}
