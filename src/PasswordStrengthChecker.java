
public class PasswordStrengthChecker {
    public String checkPasswordStrength(String password) {
        // Implement password strength checking logic here
        // This is just a placeholder
        if (password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[a-z].*")
                && password.matches(".*[A-Z].*") && password.matches(".*[!@#$%^&*()-_=+\\[\\]{}|;:'\",.<>/?].*")) {
            return "This is a good password :) but you can still do better";
        } else {
            return "Weak password. Please consider making it stronger.";
        }
    }
}
