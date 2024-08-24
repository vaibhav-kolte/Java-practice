package problems;

import java.util.Scanner;

public class P069_PalindromeUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Check string palindrome or not using recursion.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string which you want to check palindrome or not: ");
        String string = scanner.next();

        System.out.println("Your string is " + (checkPalindrome(string) ? "Palindrome" : "Not Palindrome"));
    }

    private static boolean checkPalindrome(String string) {
        if (string.length() == 1) return true;
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            return checkPalindrome(string.substring(1, string.length() - 1));
        }
        return false;
    }
}
