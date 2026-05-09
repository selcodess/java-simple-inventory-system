import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void printAllProducts() {
        System.out.println("ALL PRODUCTS");
        System.out.println("======================");

        for (Product product : products) {
            product.printInfo();
        }
    }

    public void printProductsByCategory(String category) {
        System.out.println("PRODUCTS IN CATEGORY: " + category);
        System.out.println("======================");

        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                product.printInfo();
            }
        }
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }

        return null;
    }

    public void updateProductStock(String name, int newStockQuantity) {
        Product product = findProductByName(name);

        if (product != null) {
            product.updateStock(newStockQuantity);
        } else {
            System.out.println("Product not found: " + name);
        }
    }

    public void deleteProduct(String name) {
        Product product = findProductByName(name);

        if (product != null) {
            products.remove(product);
            System.out.println("Product deleted: " + name);
        } else {
            System.out.println("Delete failed. Product not found: " + name);
        }
    }

    public void printInventorySummary() {
        double totalInventoryValue = 0;
        int totalStock = 0;

        for (Product product : products) {
            totalInventoryValue = totalInventoryValue + product.getTotalValue();
            totalStock = totalStock + product.getStockQuantity();
        }

        System.out.println("======================");
        System.out.println("INVENTORY SUMMARY");
        System.out.println("Total Products: " + products.size());
        System.out.println("Total Stock Quantity: " + totalStock);
        System.out.printf("Total Inventory Value: %.2f EUR%n", totalInventoryValue);
    }
}
