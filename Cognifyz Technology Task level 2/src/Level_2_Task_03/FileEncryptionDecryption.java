package Level_2_Task_03;
import java.io.*;
import java.util.Scanner;

public class FileEncryptionDecryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File Encryption/Decryption Program:-");
        System.out.print("Enter 'E' to Encrypt or 'D' to Decrypt: ");
        char choice = scanner.next().toUpperCase().charAt(0);

        if (choice != 'E' && choice != 'D') {
            System.out.println("Invalid choice! Please enter 'E' or 'D'.");
            return;
        }

        scanner.nextLine();

        System.out.print("Enter the path of the input file: ");
        String inputFilePath = scanner.nextLine();

        System.out.print("Enter the path for the output file: ");
        String outputFilePath = scanner.nextLine();


        final int SHIFT_KEY = 5;

        try {
            String content = readFile(inputFilePath);

            String result;
            if (choice == 'E') {
                result = encrypt(content, SHIFT_KEY);
                System.out.println("File successfully encrypted!");
            } else {
                result = decrypt(content, SHIFT_KEY);
                System.out.println("File successfully decrypted!");
            }

            writeFile(outputFilePath, result);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    private static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    private static String encrypt(String text, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                encrypted.append((char) ((c - base + key) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }


    private static String decrypt(String text, int key) {
        return encrypt(text, 26 - key);
    }
}
