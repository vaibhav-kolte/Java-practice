import java.util.Scanner;

public class P016_OddEven {
    public static void main(String[] args) {
        System.out.println("Welcome to Odd and Even number checker.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }
}
