package problems;

import java.util.Scanner;

public class P038_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Palindrome number.\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("Given number is " + (isPalindromeNumber(num) ? "palindrome." : "not palindrome"));
    }

    private static boolean isPalindromeNumber(int num) {
        return num == reverseNumber(num);
    }

    public static int reverseNumber(int num) {
        int reverseNum = 0;
        while (num > 0) {
            reverseNum = (reverseNum * 10) + num % 10;
            num /= 10;
        }
        return reverseNum;
    }
}
