package problems;

import java.util.Scanner;

public class P040_SumAndAverage {
    public static void main(String[] args) {
        System.out.println("Sum and average of array.\n\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Total array element: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 1; i <= length; i++) {
            System.out.printf("Enter %d element: ", i);
            array[i - 1] = scanner.nextInt();
        }

        System.out.println("Sum of array element is " + sumOfArray(array));
        System.out.println("Average of array element is " + averageOfArray(array));

    }

    private static float averageOfArray(int[] array) {
        return (float) sumOfArray(array) / array.length;
    }

    private static int sumOfArray(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
}
