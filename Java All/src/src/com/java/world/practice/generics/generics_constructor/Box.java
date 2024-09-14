package src.com.java.world.practice.generics.generics_constructor;


public class Box<T extends Number> {
    private T object;

    public Box(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}