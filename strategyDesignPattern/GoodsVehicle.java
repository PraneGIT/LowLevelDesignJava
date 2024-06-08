package strategyDesignPattern;

import strategyDesignPattern.strategy.NormalDriveStategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new NormalDriveStategy());
    }
    
}
