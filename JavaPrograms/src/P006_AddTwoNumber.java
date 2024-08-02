import java.util.Scanner;

public class P006_AddTwoNumber {
    public static void main(String[] args) {
        System.out.println("Addition Calculator");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        System.out.println("Addition of given two number is " + addition);
    }
}
