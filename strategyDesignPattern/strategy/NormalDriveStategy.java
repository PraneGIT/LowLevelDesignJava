package strategyDesignPattern.strategy;

public class NormalDriveStategy implements DriveStrategy{

    @Override
    public void drive() {
       System.out.println("This is Normal Drive");
    }
    
}
