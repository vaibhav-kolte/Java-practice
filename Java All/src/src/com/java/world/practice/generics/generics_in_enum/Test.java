package src.com.java.world.practice.generics.generics_in_enum;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FIRDAY, SATURDAY
}

public class Test {
    public static void main(String[] args) {
        Day day1 = Day.MONDAY;
//        Day day2 = "TUESDAY"; // Invalid
    }
}
