package problems;

import java.util.Scanner;

public class P031_SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Sum of digits");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int sum = sumOfDigit(scanner.nextInt());
        System.out.println("Sum of digit in given number is " + sum);
    }

    private static int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
