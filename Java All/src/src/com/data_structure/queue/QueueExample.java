package src.com.data_structure.queue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        System.out.println("Stack Project");
        Scanner scanner = new Scanner(System.in);

        PersonQueue queue = new PersonQueue();
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
                    System.out.print("Enter person name: ");
                    String name = scanner.next();
                    queue.push(name);
                }
                case 2 -> {
                    try {
                        System.out.println("Pop person: " + queue.pop());
                    } catch (EmptyQueueException e) {
                        System.out.println("Pop failed: " + e.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        System.out.println("Top person: " + queue.peek());
                    } catch (EmptyQueueException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> System.out.println("Queue is " + ((queue.isEmpty()) ? "" : "not ") + "empty");
                case 5 -> queue.printQueue();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid operation.");
            }

        }
    }
}
