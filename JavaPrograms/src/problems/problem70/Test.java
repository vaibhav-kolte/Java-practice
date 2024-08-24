package problems.problem70;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Print student details using toString().");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        Student student = new Student(name, age);
        System.out.println("Your student details is " + student);
    }
}
