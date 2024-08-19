package problems;

import java.util.Scanner;

public class P044_DeletingElement {
    public static void main(String[] args) {
        System.out.println("Return a new array deleting a specific element.\n");

        int[] array = Utility.getIntegerArray();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you number you want to delete in given array: ");
        int deleteElement = scanner.nextInt();

        System.out.println("Initial array is: ");
        Utility.printArray(array);

        int[] updatedArray = deleteElementInArray(array, deleteElement);
        System.out.println("Updated array is: ");
        Utility.printArray(updatedArray);
    }

    private static int[] deleteElementInArray(int[] array, int deleteElement) {
        int[] updatedArray = new int[array.length - checkNumberOfOccurrences(array, deleteElement)];
        int count = 0;
        for (int i : array) {
            if (i != deleteElement) updatedArray[count++] = i;
        }
        return updatedArray;
    }

    private static int checkNumberOfOccurrences(int[] array, int checkNumber) {
        int occurrence = 0;
        for (int i : array) {
            if (i == checkNumber) occurrence++;
        }
        return occurrence;
    }
}
