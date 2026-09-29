import java.util.List;

/**
 * TICKET 7: CART-CPC-1940
 * The cart total is the sum of the prices plus 15% tax.
 * After checkout the customer gets a receipt text.
 */
public class CartTotal {

    private static final double TAX_RATE = 0.15;
    private static final String MAILER_KEY = "mailer-key-workshop-12345"; // used to email the receipt

    static double subtotal(List<Double> prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }

    static double cartTotal(List<Double> prices) {
        return subtotal(prices) * (1 + TAX_RATE);
    }

    static String receiptText(List<Double> prices) {
        return "Subtotal: $" + subtotal(prices)
            + "\nTax (15%): $" + subtotal(prices) * TAX_RATE
            + "\nTotal: $" + cartTotal(prices);
    }

    static void sendReceipt(String email, List<Double> prices) {
        System.out.println("Sending receipt to " + email + " using key " + MAILER_KEY);
        System.out.println(receiptText(prices));
    }

    public static void main(String[] args) {
        System.out.println("subtotal = " + subtotal(List.of(10.0, 20.0)) + "   (expected 30.0)");
        System.out.println("total    = " + cartTotal(List.of(10.0, 20.0)) + "   (expected 34.5)");
        sendReceipt("sam@example.com", List.of(10.0, 20.0));
    }
}
