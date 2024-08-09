import java.util.Scanner;

public class P017_MaxOfThree {
    public static void main(String[] args) {
        System.out.println("Welcome to greatest of three number. ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + " is the greatest number.");
        } else if (secondNumber > thirdNumber) {
            System.out.println(secondNumber + " is the greatest number.");
        } else {
            System.out.println(thirdNumber + " is the greatest number.");
        }
    }
}
