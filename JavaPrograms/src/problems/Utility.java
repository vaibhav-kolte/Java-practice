package problems;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Utility {

    public static int[] getIntegerArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many number you want to enter: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static String[] getStringArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many string you want to enter: ");
        int arraySize = scanner.nextInt();
        String[] array = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            array[i] = scanner.next();
        }
        return array;
    }

    public static void printArray(int @NotNull [] array) {
        System.out.print("Your array is: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[][] get2DArray() {
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
        return array;
    }

    public static void print2DArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
