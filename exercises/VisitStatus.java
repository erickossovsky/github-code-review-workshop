/**
 * TICKET 6: VIST-CPC-1954
 * A visit is PAST if its day is before today. Today and later are UPCOMING.
 * Example: visitStatus(3, 10) should be PAST, visitStatus(10, 10) should be UPCOMING
 */
public class VisitStatus {

    static String visitStatus(int visitDay, int today) {
    return ""; // TODO
}

    public static void main(String[] args) {
        System.out.println("visitStatus(3, 10)  = " + visitStatus(3, 10) + "   (expected PAST)");
    System.out.println("visitStatus(10, 10) = " + visitStatus(10, 10) + "   (expected UPCOMING)");
    System.out.println("visitStatus(12, 10) = " + visitStatus(12, 10) + "   (expected UPCOMING)");
    }
}
