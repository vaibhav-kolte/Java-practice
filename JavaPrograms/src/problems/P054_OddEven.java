package problems;

import java.util.Scanner;

public class P054_OddEven {
    public static void main(String[] args) {
        System.out.println("Find odd or even using ternary operator.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("Given number is " + ((num % 2 == 0) ? "Even." : "Odd."));
    }
}
