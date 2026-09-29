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

    public static void main(String[] args) {
        System.out.println(sampleProducts().size() + " products loaded");
    }
}
