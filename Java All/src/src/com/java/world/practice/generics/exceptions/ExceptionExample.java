package src.com.java.world.practice.generics.exceptions;

class StringProcessingException extends Exception {
    public StringProcessingException(String message) {
        super(message);
    }
}

class IntegerProcessingException extends Exception {
    public IntegerProcessingException(String message) {
        super(message);
    }
}

class MyException extends Exception {
    public <T> MyException(T value) {
        super("Exception related to value: " +
                value.toString() +
                " of type: " +
                value.getClass().getName());
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyException(123);
        } catch (MyException e) {
            System.out.println("MyException Number: " + e);
        }

        try {
            throw new MyException("Hello");
        } catch (MyException e) {
            System.out.println("MyException String: " + e);
        }
    }
}
