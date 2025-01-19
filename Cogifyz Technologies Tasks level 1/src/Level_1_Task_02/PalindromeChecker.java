package Level_1_Task_02;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str, rev = "";

        System.out.println("Enter a word or phrase: ");
        str = sc.nextLine();

        int len = str.length();

        for(int i = len-1; i>=0; i--){
            rev = rev + str.charAt(i);

        }
        if(str.equalsIgnoreCase(rev)){
            System.out.println("The input is a palindrome.");
        }
        else{
            System.out.println("The input is not a palindrome.");
        }
    }
}
