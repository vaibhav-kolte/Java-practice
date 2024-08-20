package problems;

import java.util.Scanner;

public class P062_PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Check prime number using for loop.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number which you want to check prime or not: ");
        int num = scanner.nextInt();

        System.out.println("Your number is" + (checkPrimeNumber(num) ? "" : " not") + " prime number.");
    }

    private static boolean checkPrimeNumber(int num) {
        if (num <= 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
