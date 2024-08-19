package problems;

public class P045_ReverseArray {
    public static void main(String[] args) {
        System.out.println("Reverse an array.");

        int[] array = Utility.getIntegerArray();
        System.out.println("Initial array is ");
        Utility.printArray(array);

        int[] reverseArray = reverseArray(array);
        System.out.println("Reverse array is ");
        Utility.printArray(reverseArray);
    }

    public static int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reverse = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            reverse[length - i - 1] = array[i];
        }
        return reverse;
    }
}
