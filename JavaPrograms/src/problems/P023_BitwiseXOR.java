package problems;

import java.util.Scanner;

public class P023_BitwiseXOR {
    public static void main(String[] args) {
        System.out.println("Bitwise XOR example.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        int result = first ^ second;
        System.out.println("Result = " + result);
    }
}
