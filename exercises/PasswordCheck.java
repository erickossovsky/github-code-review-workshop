/**
 * TICKET 5: AUTH-CPC-1973
 * A password is strong if it has at least 8 characters and at least one digit.
 * Weak passwords must be rejected at sign-up.
 */
public class PasswordCheck {

    static final int MIN_LENGTH = 8;

    public static void main(String[] args) {
        System.out.println("minimum length = " + MIN_LENGTH);
    }
}
