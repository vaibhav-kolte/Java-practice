package problems;

import java.util.Scanner;

public class P028_PrintTable {
    public static void main(String[] args) {
        System.out.println("Multiplication table.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number which number you want: ");
        int tableNum = scanner.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(tableNum + " X " + i + " = " + tableNum * i);
            i++;
        }
    }
}
