import java.util.List;

/**
 * TICKET 7: CART-CPC-1940
 * The cart total is the sum of the prices plus 15% tax.
 * After checkout the customer gets a receipt text.
 */
public class CartTotal {

    static double subtotal(List<Double> prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("subtotal = " + subtotal(List.of(10.0, 20.0)) + "   (expected 30.0)");
    }
}
