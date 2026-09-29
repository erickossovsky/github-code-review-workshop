import java.util.ArrayList;
import java.util.List;

/**
 * TICKET 3: CART-CPC-1944
 * A promo code must lower the price in the cart by a percentage.
 */
public class CartPromo {

    static class Item {
        final String name;
        final double price;

        Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    static double cartTotal(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total = total + item.price;
        }
        return total;
    }

    public static void main(String[] args) {
        List<Item> cart = new ArrayList<>();
        cart.add(new Item("Dog food", 30.0));
        cart.add(new Item("Chew toy", 20.0));
        System.out.println("cart total = " + cartTotal(cart) + "   (expected 50.0)");
    }
}
