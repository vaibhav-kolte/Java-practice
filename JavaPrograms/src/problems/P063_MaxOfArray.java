package problems;


public class P063_MaxOfArray {
    public static void main(String[] args) {
        System.out.println("Find max number in array using for-each");

        int[] array = Utility.getIntegerArray();

        System.out.println("Max number in given array is " + findMax(array));
    }

    private static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (max < i) max = i;
        }
        return max;
    }
}
