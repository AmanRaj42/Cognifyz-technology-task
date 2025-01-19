package Level_2_Task_02;
import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();


        int strengthScore = calculatePasswordStrength(password);

        System.out.println("\nPassword Analysis:");
        if (strengthScore <= 2) {
            System.out.println("Your Password is WEAK. Consider making it longer and adding a mix of uppercase, lowercase, numbers, and special characters.");
        } else if (strengthScore == 3) {
            System.out.println("Your Password is MODERATE. Add more complexity to make it stronger.");
        } else {
            System.out.println("Your Password is STRONG. Great job!");
        }

        scanner.close();
    }

    public static int calculatePasswordStrength(String password) {
        int score = 0;


        if (password.length() >= 8) {
            score++;
        }

        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        if (password.matches(".*[a-z].*")) {
            score++;
        }

        if (password.matches(".*\\d.*")) {
            score++;
        }

        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            score++;
        }

        return score;
    }
}
