package problems;

public class P043_SortedArray {
    public static void main(String[] args) {
        System.out.println("Check sorted array");

        int[] array = Utility.getIntegerArray();

        System.out.printf("Your array is " + (isArraySorted(array) ? "sorted." : "not sorted."));
    }

    private static boolean isArraySorted(int[] array) {
        int value = array[0];
        for (int i : array) {
            if (value <= i) value = i;
            else return false;
        }
        return true;
    }
}
