package problems;

public class P050_DiagonalSum {
    public static void main(String[] args) {
        System.out.println("Sum of diagonal element.");

        int[][] array = Utility.get2DArray();

        System.out.println("Your 2-D array is: ");
        Utility.print2DArray(array);
        System.out.println("Sum of diagonal element is " + sumOfDiagonalElement(array));

    }

    private static int sumOfDiagonalElement(int[][] array) {
        int sum = 0;
        int column = array[0].length;

        for (int i = 0, j = 0; i < array.length && j < column; i++, j++) {
            sum += array[i][j];
            if (!(j == --column)) sum += array[i][column];
        }
        return sum;
    }
}
