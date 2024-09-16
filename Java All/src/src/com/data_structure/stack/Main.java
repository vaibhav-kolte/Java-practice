package src.com.data_structure.stack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stack Project");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set stack size: ");
        int stackSize = scanner.nextInt();
        NumberStack stack = new NumberStack(stackSize);

        int operation;

        while (true) {
            System.out.println("\n");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check empty");
            System.out.println("5. Print stack");
            System.out.println("6. Exit");
            System.out.print("Select operation: ");

            try {
                operation = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Enter correct input.");
                continue;
            }

            switch (operation) {
                case 1 -> {
                    System.out.print("Enter element: ");
                    int element = scanner.nextInt();
                    try {
                        stack.push(element);
                    } catch (StackUnderflowException e) {
                        System.out.println("Push failed: " + e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        System.out.println("Pop element: " + stack.pop());
                    } catch (EmptyStackException e) {
                        System.out.println("Pop failed: " + e.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        System.out.println("Top element: " + stack.peek());
                    } catch (EmptyStackException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                }
                case 5 -> stack.printStack();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid operation.");
            }

        }
    }
}
