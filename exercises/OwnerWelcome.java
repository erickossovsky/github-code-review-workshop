import java.util.ArrayList;
import java.util.Arrays;
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

    static String welcomeMessage(Owner owner) {
        // System.out.println("debug: " + owner.name);
        String mesage = "Welcome back, " + owner.name + "!";
        return mesage;
    }

    static String petSummary(Owner owner) {
        int count = owner.pets.size();
        if (count == 0) {
            return "You have no pets registered yet.";
        }
        if (count == 1) {
            return "Your pet: " + owner.pets.get(0) + ".";
        }
        String names = String.join(", ", owner.pets.subList(0, count - 1));
        return "Your pets: " + names + " and " + owner.pets.get(count - 1) + ".";
    }

    static String badge(Owner owner) {
        return owner.pets.size() > 3 ? "Pet lover" : "";
    }

    public static void main(String[] args) {
        List<String> pets = new ArrayList<>();
        pets.add("Rex");
        pets.add("Luna");
        pets.add("Milo");
        Owner owner = new Owner("Sam", pets);
        Owner newcomer = new Owner("Lee", new ArrayList<>());
        System.out.println(welcomeMessage(owner));
        System.out.println(petSummary(owner));
        System.out.println(petSummary(newcomer));
        System.out.println("badge for Sam: '" + badge(owner) + "'   (expected '')");
    }
}
