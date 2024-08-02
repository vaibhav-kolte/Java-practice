import java.util.Scanner;

public class P010_PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Welcome to Perimeter of rectangle.\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}
