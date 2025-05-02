/*3. Use a HashMap to manage a product inventory where keys are productId (Integer) and
values are quantity (Integer). Add three products, update the quantity of one product, remove another, 
and display the final inventory.
 */
import java.util.HashMap;
import java.util.Map;

public class ProductInventory {

    public static void main(String[] args) {
        // Create HashMap for inventory
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Add 3 products: productId -> quantity
        inventory.put(1001, 50);  // Product 1001 has 50 units
        inventory.put(1002, 30);
        inventory.put(1003, 70);

        // Update quantity of product 1002 (e.g., restock to 45)
        inventory.put(1002, 45);  // overwrite value

        // Remove product 1001
        inventory.remove(1001);

        // Display final inventory
        System.out.println("Final Inventory:");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
