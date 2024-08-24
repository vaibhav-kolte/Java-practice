package problems;

public class P066_SumAllPositiveNumber {
    public static void main(String[] args) {
        System.out.println("Enter Sum of all positive number.");

        int[] array = Utility.getIntegerArray();

        int result = getSumOfAllPositiveNumber(array);
        System.out.printf("Sum of all positive number is %d", result);
    }

    private static int getSumOfAllPositiveNumber(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i < 0) continue;
            sum += i;
        }
        return sum;
    }
}
