import java.util.Scanner;

public class P015_PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println("Welcome to number checker.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println(number + " is Zero");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is positive");
        }
    }
}
