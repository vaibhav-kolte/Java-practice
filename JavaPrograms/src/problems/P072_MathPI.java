package problems;

import java.util.Scanner;

public class P072_MathPI {
    public static void main(String[] args) {
        System.out.println("Area and circumference of circle using Math.PI");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float radius = scanner.nextFloat();

        System.out.printf("Area of circle is %f\n", (Math.PI * radius * radius));
        System.out.printf("Circumference of circle is %f", (2 * Math.PI * radius));
    }
}
