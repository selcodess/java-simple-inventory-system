public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product laptop = new Product("Laptop", "Electronics", 899.99, 5);
        Product mouse = new Product("Mouse", "Electronics", 19.99, 20);
        Product chair = new Product("Office Chair", "Furniture", 129.99, 7);
        Product desk = new Product("Desk", "Furniture", 249.99, 3);

        System.out.println("JAVA SIMPLE INVENTORY SYSTEM");
        System.out.println("======================");

        inventory.addProduct(laptop);
        inventory.addProduct(mouse);
        inventory.addProduct(chair);
        inventory.addProduct(desk);

        System.out.println();

        inventory.printAllProducts();

        System.out.println();

        inventory.printProductsByCategory("Electronics");

        System.out.println();

        inventory.updateProductStock("Laptop", 8);
        inventory.updateProductStock("Keyboard", 10);
        inventory.deleteProduct("Desk");
        inventory.deleteProduct("Monitor");

        System.out.println();

        inventory.printAllProducts();

        System.out.println();

        inventory.printInventorySummary();
    }
}
