package src.com.java.world.practice.generics.generics_class;

public class GenericExample {
    // Check both example
    public static void main(String[] args) {
        // Example 1
//        Box<Integer> box = new Box<>(); // Box is now type safe
//        box.setObject(96);
//        Integer value = box.getObject();
//        System.out.println(value);


        // Example 2
//        Box<String> box = new Box<>();
//        box.setObject("Vaibhav");
//        String value = box.getObject();
//        System.out.println(value);

        // Example 3
        Pair<String, Integer> pair = new Pair<>("Age", 29);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }

    /* Naming Convention

        T -> Type
        E -> Element ( used in Collections )
        K -> Key ( used in map )
        V -> Value ( used in value )
        N -> Number
     */
}
