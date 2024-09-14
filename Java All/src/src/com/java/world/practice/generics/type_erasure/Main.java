package src.com.java.world.practice.generics.type_erasure;

class NumberBox<T extends Number>{
    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        String value = stringBox.getValue();

        // Compiler convert like this
        // this is type erasure
//        Box stringBox = new Box();
//        stringBox.setValue("Hello");
//        String value = (String) stringBox.getValue();
    }
}
