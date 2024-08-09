import java.util.Scanner;

public class P019_MarksGrade {
    public static void main(String[] args) {
        System.out.println("Welcome to calculate Marks Grade system.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        float percentage = scanner.nextFloat();

        if(percentage>90){
            System.out.println("Great!!, You got A");
        }else if(percentage>75){
            System.out.println("Good!!, You got B");
        }else if(percentage>60){
            System.out.println("You got C, Study harder next time.");
        } else if (percentage>30) {
            System.out.println("You got D, You need to study seriously next time.");
        }else{
            System.out.println("Sorry!, You failed");
        }
    }
}
