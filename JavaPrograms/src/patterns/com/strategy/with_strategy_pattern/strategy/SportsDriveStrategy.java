package patterns.com.strategy.with_strategy_pattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Drive strategy.");
    }
}
