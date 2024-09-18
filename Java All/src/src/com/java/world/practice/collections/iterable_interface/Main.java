package src.com.java.world.practice.collections.iterable_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Jay");
        list.add("Jay");
        list.add("Ram");
        list.add("Krishna");
        list.add("Hare");

        // Iterate through the list
//        for (String string : list) {
//            System.out.println(string);
//        }

        // ------------------------------------------------------------

//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        // OR

//        list.forEach(s -> System.out.println(s));

        // OR

        list.forEach(System.out::println);

        // ------------------------------------------------------------

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
