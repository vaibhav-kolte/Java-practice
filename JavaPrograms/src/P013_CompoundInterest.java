import java.util.Scanner;

public class P013_CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to the simple compound calculator.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principalAmount = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        float rateOfInterest = scanner.nextFloat();
        System.out.print("Enter time in year: ");
        float timeInYear = scanner.nextFloat();

        double compoundInterest = principalAmount * Math.pow((1 + rateOfInterest / 100), timeInYear);
        System.out.println("Your compound interest is " + compoundInterest);
    }
}
