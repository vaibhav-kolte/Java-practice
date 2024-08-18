package problems;

import java.util.Scanner;

public class P037_ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong number");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println("Given number is " + (isArmstrongNumber(num) ? "armstrong" : "not armstrong") + " number");
    }

    private static boolean isArmstrongNumber(int num) {
        int length = String.valueOf(num).length();
        int temp = num;
        int result = 0;
        while (num > 0) {
            result += (int) Math.pow(num % 10, length);
            num /= 10;
        }
        return temp == result;
    }
}
