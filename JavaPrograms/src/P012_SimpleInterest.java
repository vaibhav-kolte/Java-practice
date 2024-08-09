import java.util.Scanner;

public class P012_SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to the simple interest calculator.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principalAmount = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        float rateOfInterest = scanner.nextFloat();
        System.out.print("Enter time in year: ");
        float timeInYear = scanner.nextFloat();

        double simpleInterest = (principalAmount * rateOfInterest * timeInYear) / 100;
        System.out.println("Your simple interest is " + simpleInterest);
    }
}
