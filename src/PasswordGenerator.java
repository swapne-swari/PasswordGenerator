
import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

    public String generatePassword(int length, boolean lowercase, boolean uppercase, boolean numbers, boolean symbols) {
        StringBuilder validChars = new StringBuilder();
        if (lowercase) validChars.append(LOWERCASE_LETTERS);
        if (uppercase) validChars.append(UPPERCASE_LETTERS);
        if (numbers) validChars.append(NUMBERS);
        if (symbols) validChars.append(SYMBOLS);

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }
}
