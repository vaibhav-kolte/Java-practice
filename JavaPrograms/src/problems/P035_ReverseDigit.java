package problems;

import java.util.Scanner;

public class P035_ReverseDigit {
    public static void main(String[] args) {
        System.out.println("Reverse the digit\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        int result = reverseNumber(num);
        System.out.println("Your number with reverse order: " + result);
    }

    public static int reverseNumber(int num) {
        int reverseNum = 0;
        while (num > 0) {
            reverseNum = (reverseNum * 10) + num % 10;
            num /= 10;
        }
        return reverseNum;
    }
}
