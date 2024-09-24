import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. JDBC Student operation: ");
            System.out.println("2. Transaction Handling: ");
            System.out.println("3. Exit: ");
            System.out.print("Select operation: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> new JdbcStudentCrud().start();
                case 2 -> new TransactionHandling().handleTransaction();
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid operation.");
            }
        }
    }
}