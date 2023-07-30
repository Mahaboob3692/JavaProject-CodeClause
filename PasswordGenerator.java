import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {

    // Define the characters allowed in the password
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

    // Method to generate a random password with a specified length
    public static String generatePassword(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Password length must be greater than 0.");
        }

        StringBuilder password = new StringBuilder();

        // Use SecureRandom for secure password generation
        Random random = new SecureRandom();

        for (int i = 0; i < length; i++) {
            // Get a random index to select a character from the characters string
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 12; // Change this to set the desired password length
        String password = generatePassword(passwordLength);
        System.out.println("Generated Password: " + password);
    }
}