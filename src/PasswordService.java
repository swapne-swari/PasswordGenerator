

import java.util.Scanner;

public class PasswordService {
    private final PasswordGenerator passwordGenerator;
    private final PasswordStrengthChecker passwordStrengthChecker;

    public PasswordService() {
        this.passwordGenerator = new PasswordGenerator();
        this.passwordStrengthChecker = new PasswordStrengthChecker();
    }

    public void generatePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to the Password Generator :)");
        System.out.println("Answer the following questions by Yes or No\n");

        System.out.print("Do you want Lowercase letters \"abcd...\" to be used? ");
        boolean lowercase = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Do you want Uppercase letters \"ABCD...\" to be used? ");
        boolean uppercase = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Do you want Numbers \"1234...\" to be used? ");
        boolean numbers = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Do you want Symbols \"!@#$...\" to be used? ");
        boolean symbols = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.print("Great! Now enter the length of the password: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String generatedPassword = passwordGenerator.generatePassword(length, lowercase, uppercase, numbers, symbols);
        System.out.println("\nYour generated password -> " + generatedPassword);
    }

    public void checkPasswordStrength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        String result = passwordStrengthChecker.checkPasswordStrength(password);
        System.out.println(result);
    }

    public void displayUsefulInformation() {
        System.out.println("Use a minimum password length of 8 or more characters if permitted");
        System.out.println("Include lowercase and uppercase alphabetic characters, numbers, and symbols if permitted");
        System.out.println("Generate passwords randomly where feasible");
        System.out.println("Avoid using the same password twice");
        System.out.println("Avoid character repetition, keyboard patterns, dictionary words, letter or number sequences,");
        System.out.println("usernames, relative or pet names, romantic links (current or past) and biographical information (e.g., ID numbers, ancestors' names or dates).");
        System.out.println("Avoid using information that the user's colleagues and/or acquaintances might know to be associated with the user");
        System.out.println("Do not use passwords which consist wholly of any simple combination of the aforementioned weak components");
    }
}
