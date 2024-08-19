package problems;

import java.util.Scanner;

public class P055_AbsoluteValue {
    public static void main(String[] args) {
        System.out.println("Find absolute value using ternary operator.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("Absolute value of given number is " + ((num < 0) ? -num : num));
    }
}
