package patterns.com.strategy.with_strategy_pattern;

import patterns.com.strategy.with_strategy_pattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
