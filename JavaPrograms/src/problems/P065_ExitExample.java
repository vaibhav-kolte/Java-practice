package problems;

import java.util.Scanner;

public class P065_ExitExample {
    public static void main(String[] args) {
        System.out.println("Welcome to exit example.");
        Scanner scanner = new Scanner(System.in);
        String name;
        do{
            System.out.print("Enter name: ");
            name = scanner.next();

        }while (!name.equals("exit"));
    }
}
