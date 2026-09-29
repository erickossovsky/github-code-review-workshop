import java.util.ArrayList;
import java.util.List;

/**
 * TICKET 1: BILL-CPC-1988
 * Give the billing page a small report for one customer:
 * the total owed, the average bill, and the list of overdue bills.
 */
public class BillReport {

    static class Bill {
        final String id;
        final double amount;
        final String status; // "PAID" or "UNPAID"
        final int dueDay;

        Bill(String id, double amount, String status, int dueDay) {
            this.id = id;
            this.amount = amount;
            this.status = status;
            this.dueDay = dueDay;
        }
    }

    static List<Bill> sampleBills() {
        List<Bill> bills = new ArrayList<>();
        bills.add(new Bill("B1", 30.0, "UNPAID", 5));
        bills.add(new Bill("B2", 50.0, "PAID", 3));
        bills.add(new Bill("B3", 60.0, "UNPAID", 8));
        bills.add(new Bill("B4", 40.0, "PAID", 12));
        return bills;
    }

    static double totalOwed(List<Bill> bills) {
        double total = 0;
        for (Bill bill : bills) {
            if (bill.status.equals("UNPAID")) {
                total += bill.amount;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        List<Bill> bills = sampleBills();
        System.out.println("total owed = " + totalOwed(bills) + "   (expected 90.0)");
    }
}
