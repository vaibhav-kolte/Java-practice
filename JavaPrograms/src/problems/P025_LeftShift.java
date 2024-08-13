package problems;

import java.util.Scanner;

public class P025_LeftShift {
    public static void main(String[] args) {
        System.out.println("Bitwise Left Shift example.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        int result = first << second;
        System.out.println("Result = " + result);
    }
}
