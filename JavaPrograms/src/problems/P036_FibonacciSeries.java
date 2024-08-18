package problems;

import java.util.Scanner;

public class P036_FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series.\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number you want to fibonacci series: ");
        int totalNumber = scanner.nextInt();

        printFibonacciSeries(totalNumber);

    }

    private static void printFibonacciSeries(int totalNumber) {
        if (totalNumber <= 0) return;
        if (totalNumber == 1) {
            System.out.print("0 ");
            return;
        }
        System.out.print("0 1 ");
        int firstNum = 0;
        int secondNum = 1;
        for (int count = 3; count <= totalNumber; count++) {
            int temp = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = temp;
            System.out.print(temp + " ");
        }
    }
}
