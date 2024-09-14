package src.com.java.world.practice.generics.generics_methods;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b) {
        return switch (this) {
            case ADD -> a.doubleValue() + b.doubleValue();
            case SUBTRACT -> a.doubleValue() - b.doubleValue();
            case MULTIPLY -> a.doubleValue() * b.doubleValue();
            case DIVIDE -> a.doubleValue() / b.doubleValue();
        };
    }
}

public class EnumExample {
    public static void main(String[] args) {
        double add = Operation.ADD.apply(10, 20);
        double sub = Operation.SUBTRACT.apply(10, 20);
        double multi = Operation.MULTIPLY.apply(10, 20);
        double div = Operation.DIVIDE.apply(10, 20);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
    }
}
