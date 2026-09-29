import java.util.ArrayList;
import java.util.List;

/**
 * TICKET 6: VIST-CPC-1954
 * The visits page must show PAST for visits before today.
 * Visits today or later are UPCOMING. Also show the next upcoming visit.
 */
public class VisitStatus {

    static class Visit {
        final String pet;
        final int day;

        Visit(String pet, int day) {
            this.pet = pet;
            this.day = day;
        }
    }

    static List<Visit> sampleVisits() {
        List<Visit> visits = new ArrayList<>();
        visits.add(new Visit("Rex", 3));
        visits.add(new Visit("Luna", 10));
        visits.add(new Visit("Milo", 14));
        visits.add(new Visit("Coco", 21));
        return visits;
    }

    static String visitStatus(int visitDay, int today) {
        return visitDay > today ? "UPCOMING" : "PAST";
    }

    static Visit nextVisit(List<Visit> visits, int today) {
        Visit next = null;
        for (Visit visit : visits) {
            if (!visitStatus(visit.day, today).equals("UPCOMING")) {
                continue;
            }
            next = visit;
        }
        return next;
    }

    public static void main(String[] args) {
        int today = 10;
        for (Visit visit : sampleVisits()) {
            System.out.println(visit.pet + " (day " + visit.day + ") = " + visitStatus(visit.day, today));
        }
        System.out.println("expected: Rex PAST, Luna UPCOMING, Milo UPCOMING, Coco UPCOMING");
        Visit next = nextVisit(sampleVisits(), today);
        System.out.println("next visit = " + (next == null ? "none" : next.pet) + "   (expected Luna)");
    }
}
