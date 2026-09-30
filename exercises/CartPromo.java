import java.util.ArrayList;
import java.util.List;

/**
 * TICKET 3: CART-CPC-1944
 * A promo code must lower the price in the cart by a percentage.
 * Promo codes only work on or before their last valid day.
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
            total += item.price;
        }
        return total;
    }

    static class PromoCode {
        final String code;
        final int percentOff;
        final int lastDay;

        PromoCode(String code, int percentOff, int lastDay) {
            this.code = code;
            this.percentOff = percentOff;
            this.lastDay = lastDay;
        }
    }

    static boolean isValid(PromoCode promo, int today) {
        return today < promo.lastDay;
    }

    static double applyPromo(double total, int percentOff) {
        double discount = total * (percentOff / 100);
        return total - discount;
    }

    static double checkout(List<Item> items, PromoCode promo, int today) {
        double total = cartTotal(items);
        if (!isValid(promo, today)) {
            return total;
        }
        return applyPromo(total, promo.percentOff);
    }

    public static void main(String[] args) {
        List<Item> cart = new ArrayList<>();
        cart.add(new Item("Dog food", 30.0));
        cart.add(new Item("Chew toy", 20.0));
        PromoCode save10 = new PromoCode("SAVE10", 10, 10);
        System.out.println("cart total          = " + cartTotal(cart) + "   (expected 50.0)");
        System.out.println("applyPromo(50, 10)  = " + applyPromo(50.0, 10) + "   (expected 45.0)");
        System.out.println("valid on last day   = " + isValid(save10, 10) + "   (expected true)");
        System.out.println("checkout day 5      = " + checkout(cart, save10, 5) + "   (expected 45.0)");
        System.out.println("applyPromo(50, 150) = " + applyPromo(50.0, 150) + "   (expected: rejected)");
    }
}
