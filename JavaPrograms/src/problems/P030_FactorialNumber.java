package problems;

import java.util.Scanner;

public class P030_FactorialNumber {
    public static void main(String[] args) {
        System.out.println("Factorial number example.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Which factorial you want: ");
        int num = scanner.nextInt();

        long factorial = 1;
        while (num > 0) {
            factorial *= num;
            num--;
        }
        System.out.println("Factorial is " + factorial);
    }
}
