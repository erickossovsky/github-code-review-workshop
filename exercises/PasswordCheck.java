/**
 * TICKET 5: AUTH-CPC-1973
 * A password is strong if it has at least 8 characters and at least one digit.
 * Weak passwords must be rejected at sign-up.
 */
public class PasswordCheck {

    static final int MIN_LENGTH = 8;

    static boolean isStrongPassword(String password) {
        System.out.println("checking password: " + password);
        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        return password.length() >= MIN_LENGTH && hasDigit;
    }

    static void notifyAuthService(String user) {
        System.out.println("POST http://auth-service/api/v1/weak-passwords {user: " + user + "}");
    }

    static String signUp(String user, String password) {
        if (!isStrongPassword(password)) {
            notifyAuthService(user);
            return "REJECTED: weak password";
        }
        return "OK: account created for " + user;
    }

    public static void main(String[] args) {
        System.out.println(signUp("sam", "hunter22") + "   (expected OK)");
        System.out.println(signUp("lee", "short1") + "   (expected REJECTED)");
    }
}
