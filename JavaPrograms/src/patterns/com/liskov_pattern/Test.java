package patterns.com.liskov_pattern;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle motorCycle = new MotorCycle();
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        vehicleList.add(motorCycle);
        vehicleList.add(car);
        vehicleList.add(bicycle);

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.hasEngin().toString());
        }

        /*
        Try to run and you get runtime error
         */
    }
}
