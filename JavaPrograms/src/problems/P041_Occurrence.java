package problems;


import java.util.Scanner;

public class P041_Occurrence {
    public static void main(String[] args) {
        System.out.println("Find out number of occurrences.");

        Scanner scanner = new Scanner(System.in);
        int[] array = Utility.getIntegerArray();

        System.out.print("Which number you want to check occurrence: ");
        int checkNumber = scanner.nextInt();

        int occurrence = checkNumberOfOccurrences(array, checkNumber);
        System.out.printf("%d is %d occurrences.", checkNumber, occurrence);
    }

    private static int checkNumberOfOccurrences(int[] array, int checkNumber) {
        int occurrence = 0;
        for (int i : array) {
            if (i == checkNumber) occurrence++;
        }
        return occurrence;
    }
}
