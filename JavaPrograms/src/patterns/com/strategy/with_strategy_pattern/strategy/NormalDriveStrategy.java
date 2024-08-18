package patterns.com.strategy.with_strategy_pattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive strategy.");
    }
}
