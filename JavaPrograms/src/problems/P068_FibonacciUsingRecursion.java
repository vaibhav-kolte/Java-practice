package problems;

import java.util.Scanner;

public class P068_FibonacciUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Print fibonacci using recursion.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number you want to print fibonacci series: ");
        int count = scanner.nextInt();

        nextFibonacciNumber(0,1,count);
    }

    private static void nextFibonacciNumber(int first, int second, int count) {
        System.out.print(first+" ");
        count--;
        if(count>=0) nextFibonacciNumber(second,first+second,count);
    }
}
