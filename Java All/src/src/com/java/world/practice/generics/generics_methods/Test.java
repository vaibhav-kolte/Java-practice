package src.com.java.world.practice.generics.generics_methods;


public class Test {

    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Test test = new Test();
        Integer[] intArray = {1, 2, 3, 4, 5};
        test.printArray(intArray);

        String[] stringArray = {"Vaibhav", "Sharad", "Pankaj", "Sagar"};
        test.printArray(stringArray);
        test.display(12);
        test.display("Vaibhav");
        test.display(3.14);
    }

    public <T> void display(T element){
        System.out.println("Generic display: "+element);
    }

    public void display(Integer element){
        System.out.println("Generic display: "+element);
    }
}
