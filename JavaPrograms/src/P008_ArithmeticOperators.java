import java.util.Scanner;

public class P008_ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Welcome to Arithmetic Operators\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int addition = num1 + num2;
        System.out.println("Addition of number " + num1 + " and " + num2 + ": " + addition);

        int subtraction = num1 - num2;
        System.out.println("Subtraction of number "+num1+" and "+num2+": " + subtraction);

        int multiplication = num1 * num2;
        System.out.println("Multiplication of number "+num1+" and "+num2+": " + multiplication);

        int division = num1 / num2;
        System.out.println("Division of number "+num1+" and "+num2+": " + division);

        int remainder = num1 % num2;
        System.out.println("Remainder of number "+num1+" and "+num2+": " + remainder);
    }
}
