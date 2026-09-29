import java.util.ArrayList;
import java.util.List;

/**
 * TICKET 4: CUST-CPC-1953
 * The customer portal greets an owner by name and shows a short summary of their pets.
 */
public class OwnerWelcome {

    static class Owner {
        final String name;
        final List<String> pets;

        Owner(String name, List<String> pets) {
            this.name = name;
            this.pets = pets;
        }
    }

    public static void main(String[] args) {
        List<String> pets = new ArrayList<>();
        pets.add("Rex");
        pets.add("Luna");
        Owner owner = new Owner("Sam", pets);
        System.out.println("owner = " + owner.name + " with " + owner.pets.size() + " pets");
    }
}
