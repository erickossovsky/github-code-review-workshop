/**
 * TICKET 2: BILL-CPC-1987
 * A bill that is already PAID must not be payable again.
 * Paying a bill sets its status to PAID and sends one confirmation email.
 */
public class BillPayment {

    static class Bill {
        final String id;
        final double amount;
        String status; // "PAID" or "UNPAID"

        Bill(String id, double amount, String status) {
            this.id = id;
            this.amount = amount;
            this.status = status;
        }
    }

    static String describe(Bill bill) {
        return bill.id + " ($" + bill.amount + ", " + bill.status + ")";
    }

    public static void main(String[] args) {
        Bill bill = new Bill("B7", 45.0, "UNPAID");
        System.out.println(describe(bill));
    }
}
