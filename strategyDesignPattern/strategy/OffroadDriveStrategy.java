package strategyDesignPattern.strategy;

public class OffroadDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
         System.out.println("This is Offroad Drive");
    }
    
}
