package problems;

import java.util.Scanner;

public class P049_SumAndAvg2DArray {
    public static void main(String[] args) {
        System.out.println("Find sum and average of 2-D array.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row = scanner.nextInt();
        System.out.print("Enter column size: ");
        int column = scanner.nextInt();

        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter [%d][%d] element: ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Sum of given 2-D Array is " + sumArray(array));
        System.out.println("Average of given 2-D array is " + averageArray(array));
    }

    private static float averageArray(int[][] array) {
        int row = array.length;
        int column = array[0].length;
        return sumArray(array) / (float) (row * column);
//        return sumArray(array) / numberOfElement(array);
    }

    private static int sumArray(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }

    private static int numberOfElement(int[][] array) {
        int count = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                count++;
            }
        }
        return count;
    }
}
