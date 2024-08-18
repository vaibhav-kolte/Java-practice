package problems;

import java.util.Scanner;

public class P039_Pattern {
    public static void main(String[] args) {
        System.out.println("Pattern");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        int totalLine = scanner.nextInt();
        rightHalfPyramid(totalLine);
        reverseRightHalfPyramid(totalLine);
        leftHalfPyramid(totalLine);
    }

    public static void rightHalfPyramid(int totalLine) {
        System.out.println("\n\nRight half pyramid.");
        for (int i = 1; i <= totalLine; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void reverseRightHalfPyramid(int totalLine) {
        System.out.println("\n\nReverse right half pyramid.");
        for (int i = 1; i <= totalLine; i++) {
            for (int j = i; j <= totalLine; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void leftHalfPyramid(int totalLine) {
        System.out.println("\n\nLeft half pyramid.");
        for (int i = 1; i <= totalLine; i++) {
            for (int k = i; k < totalLine; k++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
