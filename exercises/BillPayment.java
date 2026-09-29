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

    static boolean canPay(Bill bill) {
        return bill.status.equals("PAID");
    }

    static String pay(Bill bill) {
        if (!canPay(bill)) {
            System.out.println("confirmation email sent to owner");
            return "REJECTED: bill " + bill.id + " cannot be paid";
        }
        bill.status = "PAID";
        System.out.println("confirmation email sent to owner");
        return "PAID: bill " + bill.id + " ($" + bill.amount + ")";
    }

    public static void main(String[] args) {
        Bill unpaid = new Bill("B7", 45.0, "UNPAID");
        System.out.println(pay(unpaid) + "   (expected PAID)");
        System.out.println(pay(unpaid) + "   (expected REJECTED: it is already paid)");
    }
}
