package patterns.com.liskov_pattern.actual_pattern;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List<Vehicle> vehicleList = new ArrayList<>();
//        Vehicle motorCycle = new MotorCycle();
//        Vehicle car = new Car();
//        Vehicle bicycle = new Bicycle();
//
//        vehicleList.add(motorCycle);
//        vehicleList.add(car);
//        vehicleList.add(bicycle);
//
//        for (Vehicle vehicle : vehicleList) {
//            System.out.println(vehicle.hasEngin().toString()); // not able to call hasEngin method here
//        }


//        List<EnginVehicle> enginVehicles = new ArrayList<>();
//
//        enginVehicles.add(new MotorCycle());
//        enginVehicles.add(new Car());
//        enginVehicles.add(new Bicycle()); // not able to add if you create engin vehicle
//
//        for (EnginVehicle vehicle : enginVehicles) {
//            System.out.println(vehicle.hasEngin().toString());
//        }


        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle motorCycle = new MotorCycle();
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        vehicleList.add(motorCycle);
        vehicleList.add(car);
        vehicleList.add(bicycle);

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.getNumberOfWheels()); // not able to call hasEngin method here
        }
    }
}
