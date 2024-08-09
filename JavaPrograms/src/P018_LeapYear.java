import java.util.Scanner;

public class P018_LeapYear {
    public static void main(String[] args) {
        System.out.println("Welcome to Leap Year checker.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is not leap year.");
        }
    }
}
