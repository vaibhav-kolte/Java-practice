package problems;

import java.util.Scanner;

public class P048_Search2DArray {
    public static void main(String[] args) {
        System.out.println("Search 2-D Array.");

        int[][] array = Utility.get2DArray();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Which number you want to search: ");
        int num = scanner.nextInt();

        searchElement(array, num);
    }

    private static void searchElement(int[][] array, int num) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt == num)
                    System.out.printf("%d found", num);
            }
        }
    }
}
