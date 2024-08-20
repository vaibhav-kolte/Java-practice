package problems;

import java.util.Scanner;

public class P058_SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to simple calculator.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        System.out.print("Which operation you want to perform: ");
        String operation = scanner.next();

        switch (operation) {
            case "+" -> System.out.println("Result: " + (first + second));
            case "-" -> System.out.println("Result: " + (first - second));
            case "/" -> System.out.println("Result: " + (first / second));
            case "*" -> System.out.println("Result: " + (first * second));
            case "%" -> System.out.println("Result: " + (first % second));
            default -> System.out.println("Invalid operation.");
        }
    }
}
