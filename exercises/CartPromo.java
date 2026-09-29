/**
 * TICKET 3: CART-CPC-1944
 * A promo code gives a percentage off the cart total.
 * Example: applyPromo(50.0, 10) should return 45.0
 */
public class CartPromo {

    static double applyPromo(double total, int percentOff) {
    return total; // TODO
}

    public static void main(String[] args) {
        System.out.println("applyPromo(50.0, 10) = " + applyPromo(50.0, 10) + "   (expected 45.0)");
    }
}
