import java.util.Scanner;

public class P011_AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Welcome to the Triangle Area Triangle.\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the breadth: ");
        double breadth = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        double area = (breadth * height) / 2;

        System.out.println("The area of the triangle is " + area);

    }
}
