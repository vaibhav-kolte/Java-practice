package problems;

import java.util.Scanner;

public class P032_LCM {
    public static void main(String[] args) {
        System.out.println("LCM finder.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number which you want to find LCM: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int index = Math.max(first, second) + 1;
        while (true) {
            if (index % first == 0 && index % second == 0) {
                System.out.printf("LCM of (%d,%d) is %d", first, second, index);
                break;
            }
            index++;
        }
    }
}
