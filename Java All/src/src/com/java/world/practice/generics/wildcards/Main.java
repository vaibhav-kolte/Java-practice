package src.com.java.world.practice.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
        )));

        List<? extends Number> numbers = Arrays.asList(1, 2, 3);
//        numbers.add(4); // capture of ? extends Number Error
        numbers.add(null);


        List<? super Integer> integers = Arrays.asList(1, 2, 3);
        integers.add(4); // Valid
        integers.add(null);


    }

    public static double sum(ArrayList<? extends Number> numbers) { // upper bound
        double sum = 0;
        for (Number o : numbers) {
            sum += o.doubleValue();
        }
        return sum;
    }

    public static void printNumbers(List<? super Integer> list) { // lower bound
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public <T> T getFirst(ArrayList<T> list) {
        return list.getFirst();
    }

    public <T> void copy(ArrayList<T> source, ArrayList<T> destination) {

//        for (T item : source) {
//            destination.add(item);
//        }

        // Same as

        destination.addAll(source);
    }
}
