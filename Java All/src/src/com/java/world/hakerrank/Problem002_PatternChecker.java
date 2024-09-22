package src.com.java.world.hakerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Problem002_PatternChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            if (isValidRegex(pattern)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
    public static boolean isValidRegex(String regex) {
        try {
            Pattern.compile(regex);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
