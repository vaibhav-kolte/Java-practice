package problems;

import java.util.Scanner;

public class P058_MonthOfYear {
    public static void main(String[] args) {
        System.out.println("Print month of year");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int month = scanner.nextInt();

        String output = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month";
        };

        System.out.println(output);
    }
}
