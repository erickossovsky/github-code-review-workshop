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

    public static void main(String[] args) {
        System.out.println(sampleVisits().size() + " visits loaded");
    }
}
