package problems;

import java.util.Scanner;

public class P061_MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication table.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Which table you want to print: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
        }
    }
}
