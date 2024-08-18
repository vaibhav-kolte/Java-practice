package patterns.com.strategy.with_strategy_pattern;

import patterns.com.strategy.with_strategy_pattern.strategy.NormalDriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
    }
}
