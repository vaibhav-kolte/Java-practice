package src.com.java.world.practice.generics.bounded_type_parameter;

public class BoundedExample {
    public static void main(String[] args) {
//        Box<String> stringBox = new Box<>(); // Invalid because String is not extend Number class
        Box<Integer> integerBox = new Box<>(); // Valid
    }
}
