import java.util.ArrayList;
import java.util.List;

/**
 * TICKET 8: INVT-CPC-1996
 * The inventory page shows how many products are low on stock.
 * Low stock means FEWER than 5 items left.
 */
public class LowStock {

    static class Product {
        final String name;
        final int quantity;

        Product(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }
    }

    static List<Product> sampleProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Dog food", 1));
        products.add(new Product("Cat litter", 5));
        products.add(new Product("Chew toy", 9));
        products.add(new Product("Leash", 5));
        return products;
    }

    static final int LOW_STOCK = 5;

    static int countLowStock(List<Product> products) {
        int count = 0;
        for (Product product : products) {
            if (product.quantity <= LOW_STOCK) {
                count++;
            }
        }
        return count;
    }

    static String restockReminder(List<Product> products) {
        StringBuilder text = new StringBuilder("Restock: ");
        for (Product product : products) {
            if (product.quantity <= LOW_STOCK) {
                text.append(product.name).append(", ");
            }
        }
        return text.toString();
    }

    public static void main(String[] args) {
        List<Product> products = sampleProducts();
        System.out.println("low stock = " + countLowStock(products) + "   (expected 1)");
        System.out.println(restockReminder(products));
    }
}
