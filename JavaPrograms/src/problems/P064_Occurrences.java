package problems;

import java.util.Scanner;

public class P064_Occurrences {
    public static void main(String[] args) {
        System.out.println("Number of occurrences");

        Scanner scanner = new Scanner(System.in);

        int[] array = Utility.getIntegerArray();
        System.out.print("Which number you want to check occurrences: ");
        int num = scanner.nextInt();

        System.out.printf("%d occurrences in give array with number %d", checkOccurrences(array, num), num);
    }

    private static int checkOccurrences(int[] array, int num) {
        int count = 0;
        for (int i : array) {
            if (i == num) count++;
        }
        return count;
    }
}
