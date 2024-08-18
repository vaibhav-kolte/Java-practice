package patterns.com.liskov_pattern;

public class Car extends Vehicle{
    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}
