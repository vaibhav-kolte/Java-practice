package problems;

public class P042_MaxMinInArray {
    public static void main(String[] args) {
        System.out.println("Find Maximum and Minimum in array.");

        int[] array = Utility.getIntegerArray();

        System.out.printf("Maximum is %d\n", findMax(array));
        System.out.printf("Minimum is %d\n", findMin(array));
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) min = i;
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }
}
