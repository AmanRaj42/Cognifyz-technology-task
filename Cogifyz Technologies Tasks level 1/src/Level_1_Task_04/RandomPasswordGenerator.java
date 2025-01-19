package Level_1_Task_04;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();

        System.out.print("Include numbers? (true/false): ");
        boolean includeNumbers = scanner.nextBoolean();

        System.out.print("Include lowercase letters? (true/false): ");
        boolean includeLowercase = scanner.nextBoolean();

        System.out.print("Include uppercase letters? (true/false): ");
        boolean includeUppercase = scanner.nextBoolean();

        System.out.print("Include special character? (true/false): ");
        boolean includeSpecialChars = scanner.nextBoolean();

        String password = generatePassword(length,includeNumbers,includeLowercase,includeUppercase,includeSpecialChars);
        System.out.println("Generated password: " + password);

        scanner.close();
    }
    private static String generatePassword(int length,boolean includeNumbers,boolean includeLowercase,boolean includeUppercase,boolean includeSpecialChars){
        String numbers = "0123456789";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\\\",.<>?/";

        StringBuilder characterPool = new StringBuilder();
        if (includeNumbers) characterPool.append(numbers);
        if (includeLowercase) characterPool.append(lowercase);
        if (includeUppercase) characterPool.append(uppercase);
        if (includeSpecialChars) characterPool.append(specialChars);

        if (characterPool.length() == 0){
            System.out.println("Error: At least one character type should be included. ");
            return "";
        }
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for(int i = 0; i< length; i++){
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));

        }
        return password.toString();

    }
}
