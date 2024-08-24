package problems;

public class P067_PrintOnlyEvenNumber {
    public static void main(String[] args) {
        System.out.println("Print only even number.");

        int[] array = Utility.getIntegerArray();

        printOnlyEvenNumber(array);
    }

    private static void printOnlyEvenNumber(int[] array) {
        for (int i : array) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
    }
}
