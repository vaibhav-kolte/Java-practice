package problems;

import java.util.Scanner;

public class P029_SumOddNumber {
    public static void main(String[] args) {
        System.out.println("Sum all odd numbers from 1 to a specified number.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter specified number up to you want odd number sum : ");
        int num = scanner.nextInt();

        int i = 0;
        long sum = 0;
        while (i <= num) {
            if (i % 2 == 1) sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}
