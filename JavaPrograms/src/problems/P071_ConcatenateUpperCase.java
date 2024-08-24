package problems;

import java.util.Scanner;

public class P071_ConcatenateUpperCase {
    public static void main(String[] args) {
        System.out.println("Concatenate and uppercase example.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = scanner.next();
        System.out.print("Enter second string: ");
        String secondString = scanner.next();

        String concat = firstString.concat(secondString);
        System.out.println("Concatenate of two string is " + concat);
        System.out.println("Uppercase to two string is " + concat.toUpperCase());
    }
}
