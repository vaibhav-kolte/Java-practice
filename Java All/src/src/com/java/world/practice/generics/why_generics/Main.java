package src.com.java.world.practice.generics.why_generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();
        list.add("Vaibhav");
        list.add(29);
        list.add(5.4);
        list.add(false);
        list.add(new Bike("SP 125", "RED BLACK"));

        for (Object o : list) {

//            if (o instanceof String) {
//                System.out.println(o + " is String Object");
//            } else if (o instanceof Integer) {
//                System.out.println(o + " is Integer Object");
//            } else if (o instanceof Float) {
//                System.out.println(o + " is Float Object");
//            } else if (o instanceof Double) {
//                System.out.println(o + " is Double Object");
//            } else if (o instanceof Boolean) {
//                System.out.println(o + " is Boolean Object");
//            } else {
//                System.out.println(o + " is Unknown Object");
//            }

            // OR

            switch (o) {
                case String string -> System.out.println(o + " is String Object");
                case Integer i -> System.out.println(o + " is Integer Object");
                case Float v -> System.out.println(o + " is Float Object");
                case Double v -> System.out.println(o + " is Double Object");
                case Boolean b -> System.out.println(o + " is Boolean Object");
                case null, default -> System.out.println(o + " is Unknown Object");
            }
        }
    }
}
