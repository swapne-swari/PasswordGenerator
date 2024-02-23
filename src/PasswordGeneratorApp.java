import java.util.Scanner;

public class PasswordGeneratorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordService passwordService = new PasswordService();


        while (true) {
            System.out.println("Enter 1 - Password Generator");
            System.out.println("Enter 2 - Password Strength Check");
            System.out.println("Enter 3 - Useful Information");
            System.out.println("Enter 4 - Quit");
            System.out.print("Choice:");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    passwordService.generatePassword();
                    break;
                case 2:
                    passwordService.checkPasswordStrength();
                    break;
                case 3:
                    passwordService.displayUsefulInformation();
                    break;
                case 4:
                    System.out.println("Closing the program bye bye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
