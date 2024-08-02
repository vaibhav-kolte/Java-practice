import java.util.Scanner;

public class P007_Swap {
    public static void main(String[] args) {
        System.out.println("Welcome to swap of two number.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("\n\nBefore swap");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\n\nAfter swap");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}
