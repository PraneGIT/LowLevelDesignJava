package strategyDesignPattern;

import strategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategyObj;

    Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategyObj=driveStrategyObj;
    }

    public void drive(){
        driveStrategyObj.drive();
    }
}
