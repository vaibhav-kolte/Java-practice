package patterns.com.strategy.with_strategy_pattern;

import patterns.com.strategy.with_strategy_pattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
