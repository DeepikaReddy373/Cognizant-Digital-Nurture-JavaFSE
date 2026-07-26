package exercise1;

import java.util.HashMap;

public class InventoryManagementSystem {

    static HashMap<Integer, Product> inventory = new HashMap<>();

    static void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    static void updateProduct(int id, int quantity) {
        if (inventory.containsKey(id)) {
            inventory.get(id).quantity = quantity;
        }
    }

    static void deleteProduct(int id) {
        inventory.remove(id);
    }

    static void displayProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        addProduct(new Product(101, "Laptop", 10, 65000));
        addProduct(new Product(102, "Mouse", 50, 700));
        addProduct(new Product(103, "Keyboard", 30, 1200));

        System.out.println("Inventory:");
        displayProducts();

        updateProduct(102, 60);

        System.out.println("\nAfter Update:");
        displayProducts();

        deleteProduct(103);

        System.out.println("\nAfter Delete:");
        displayProducts();
    }
}