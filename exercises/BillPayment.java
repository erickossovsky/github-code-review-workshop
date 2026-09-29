/**
 * TICKET 2: BILL-CPC-1987
 * A bill can only be paid if its status is not PAID.
 * Example: canPay("UNPAID") should be true, canPay("PAID") should be false
 */
public class BillPayment {

    static boolean canPay(String status) {
    return false; // TODO
}

    public static void main(String[] args) {
        System.out.println("canPay(UNPAID) = " + canPay("UNPAID") + "   (expected true)");
    System.out.println("canPay(PAID)   = " + canPay("PAID") + "   (expected false)");
    }
}
