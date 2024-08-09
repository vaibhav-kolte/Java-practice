import java.sql.SQLOutput;
import java.util.Scanner;

public class P020_AgeGroup {
    public static void main(String[] args) {
        System.out.println("Welcome to age group.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();

        if (age <= 0) {
            System.out.println("Sorry!, You entered wrong age.");
        } else if (age <= 13) {
            System.out.println("You are child. Play something.");
        } else if (age <= 20) {
            System.out.println("You are teenager.");
        } else if (age <= 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("Take care you are senior citizen.");
        }


    }
}
