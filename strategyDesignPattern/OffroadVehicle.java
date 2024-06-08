package strategyDesignPattern;

import strategyDesignPattern.strategy.OffroadDriveStrategy;

public class OffroadVehicle extends Vehicle{

    OffroadVehicle() {
        super(new OffroadDriveStrategy());
    }
    
}
