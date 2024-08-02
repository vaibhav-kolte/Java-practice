import java.util.Scanner;

public class P009_Product {
    public static void main(String[] args) {
        System.out.println("welcome to product of two floating number.\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = sc.nextFloat();

        float product = num1 * num2;
        System.out.println("The product of two floating numbers is " + product);
    }
}
