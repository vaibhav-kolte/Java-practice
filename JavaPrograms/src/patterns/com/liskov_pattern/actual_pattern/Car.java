package patterns.com.liskov_pattern.actual_pattern;

public class Car extends EnginVehicle {
    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}
