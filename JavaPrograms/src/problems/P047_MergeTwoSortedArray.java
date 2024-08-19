package problems;

public class P047_MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Merge two sorted array.");

        int[] sortedArray1 = Utility.getIntegerArray();
        int[] sortedArray2 = Utility.getIntegerArray();

        int[] result = sortedArray(sortedArray1, sortedArray2);
        Utility.printArray(result);
    }

    private static int[] sortedArray(int[] sortedArray1, int[] sortedArray2) {
        int[] result = new int[sortedArray1.length + sortedArray2.length];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < (sortedArray1.length + sortedArray2.length); i++) {
            if (count1 == sortedArray1.length) {
                result[i] = sortedArray2[count2++];
            } else if (count2 == sortedArray2.length) {
                result[i] = sortedArray1[count1++];
            } else if (sortedArray1[count1] <= sortedArray2[count2]) {
                result[i] = sortedArray1[count1++];
            } else {
                result[i] = sortedArray2[count2++];
            }
        }
        return result;
    }
}
