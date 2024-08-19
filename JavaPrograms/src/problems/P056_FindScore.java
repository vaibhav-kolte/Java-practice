package problems;

import java.util.Scanner;

public class P056_FindScore {
    public static void main(String[] args) {
        System.out.println("Find student score using ternary operator.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        System.out.println("Your score in  " +
                (score > 80 ? "High" : score > 50 ? "Moderate" : "Low"));
    }
}
