package problems;

import java.util.Scanner;

public class P074_NumberGuessing {
    public static void main(String[] args) {
        System.out.println("Welcome to number guessing game.\n");

        Scanner scanner = new Scanner(System.in);
        int random = (int) Math.floor(Math.random() * 100);
        System.out.print("Guess the number: ");
        do {
            int num = scanner.nextInt();
            if (num > random) {
                System.out.print("Guess lowest number: ");
            } else if (num < random) {
                System.out.print("Guess highest number: ");
            } else {
                System.out.println("You guess correct number.");
                break;
            }
        } while (true);
    }
}
