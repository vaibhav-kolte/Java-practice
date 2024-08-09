import java.util.Scanner;

public class P014_TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("Welcome to Fahrenheit to Celsius temperature convertor.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        float feh = scanner.nextFloat();

        float celsius = (feh - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
