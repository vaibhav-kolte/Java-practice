package problems;

import java.util.Scanner;

public class P024_BitwiseCompliment_Not {
    public static void main(String[] args) {
        System.out.println("Bitwise Compliment or NOT example.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        int result = ~first;
        System.out.println("Result = " + result);
    }
}
