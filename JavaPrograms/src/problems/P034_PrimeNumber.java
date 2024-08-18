package problems;

import java.util.Scanner;

public class P034_PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime number checker\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number which you want to check prime or not: ");
        int num = scanner.nextInt();
        System.out.println("Your number is " + (isPrimeNumber(num) ? "Prime" : "Not Prime"));
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
