package problems;

import java.util.Scanner;

public class P059_PasswordChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to password checker.");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            if (!password.contains(" ")) {
                System.out.println("You enter valid password");
                break;
            }
        } while (true);
    }
}
