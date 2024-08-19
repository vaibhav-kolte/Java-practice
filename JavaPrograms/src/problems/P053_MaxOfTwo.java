package problems;

import java.util.Scanner;

public class P053_MaxOfTwo {
    public static void main(String[] args) {
        System.out.println("Maximum of two number using ternary operator.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.println("Maximum of given two number is " + ((first > second) ? first : second));
    }
}
