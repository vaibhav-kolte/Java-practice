package src.com.java.world.practice.generics.bounded_type_parameter;

public class Box<N extends Number> {
    private N object;

    public N getObject() {
        return object;
    }

    public void setObject(N object) {
        this.object = object;
    }
}
