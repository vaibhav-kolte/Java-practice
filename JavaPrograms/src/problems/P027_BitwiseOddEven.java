package problems;

import java.util.Scanner;

public class P027_BitwiseOddEven {
    public static void main(String[] args) {
        System.out.println("Check Odd Even using Bitwise example.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        int result = num & 1;
        System.out.println("Given number is " + ((result == 1) ? "Odd" : "Even"));
    }
}
