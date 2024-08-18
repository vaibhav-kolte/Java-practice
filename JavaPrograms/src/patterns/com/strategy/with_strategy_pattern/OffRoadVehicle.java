package patterns.com.strategy.with_strategy_pattern;

import patterns.com.strategy.with_strategy_pattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
