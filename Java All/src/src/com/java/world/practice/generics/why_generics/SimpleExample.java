package src.com.java.world.practice.generics.why_generics;

public class SimpleExample {
    // Check both example
    public static void main(String[] args) {
        // Example 1
//        Box box = new Box();
//        box.setObject(96);
//        Integer value = (Integer) box.getObject();
//        System.out.println(value);


        // Example 2
        Box box = new Box();
        box.setObject(96);
        String value = (String) box.getObject();
        System.out.println(value);
    }
}
