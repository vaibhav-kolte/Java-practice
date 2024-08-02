import java.util.Scanner;

public class P005_InputName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to grating...");
        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();

        System.out.println("Welcome " + name + " to Programming world.");
    }
}
