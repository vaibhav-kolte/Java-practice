package problems;

import java.util.Scanner;

public class P033_GCD {
    public static void main(String[] args) {
        System.out.println("GCD finder.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number which you want to find GCD: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int gcd = findGCDEuclideanAlgorithm(first, second);
        System.out.printf("GCD of (%d,%d) is %d\n", first, second, gcd);
        int gcd1 = findGCDMyOwnLogic(first, second);
        System.out.printf("GCD of (%d,%d) is %d\n", first, second, gcd1);

    }

    // Function to compute GCD using the Euclidean algorithm
    public static int findGCDEuclideanAlgorithm(int a, int b) {
        int count = 0;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            count++;
        }
        System.out.println("GCD found in " + count + " attempts.");
        return a;
    }

    public static int findGCDMyOwnLogic(int a, int b) {
        int count = 0;
        int index = Math.max(a, b) - 1;
        while (index > 0) {
            if (a % index == 0 && b % index == 0) {
                break;
            }
            index--;
            count++;
        }
        System.out.println("GCD found in " + count + " attempts.");
        return index;
    }
}
