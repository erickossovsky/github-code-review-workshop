/**
 * TICKET 5: AUTH-CPC-1973
 * A password is strong if it has at least 8 characters and at least one digit.
 * Example: isStrongPassword("hunter22") should be true, isStrongPassword("short1") should be false
 */
public class PasswordCheck {

    static boolean isStrongPassword(String password) {
    return false; // TODO
}

    public static void main(String[] args) {
        System.out.println("isStrongPassword(hunter22) = " + isStrongPassword("hunter22") + "   (expected true)");
    System.out.println("isStrongPassword(short1)   = " + isStrongPassword("short1") + "   (expected false)");
    }
}
