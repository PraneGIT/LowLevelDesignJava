package strategyDesignPattern;

public class Main{
    public static void main(String[] args) {
        System.out.println("this is main");
        OffroadVehicle offroadVehicle = new OffroadVehicle();
        offroadVehicle.drive();
    }
}

// In the context class, identify an algorithm that’s prone to frequent changes. 
// It may also be a massive conditional that selects and executes a variant of the same algorithm at runtime.

// Declare the strategy interface common to all variants of the algorithm.

// One by one, extract all algorithms into their own classes. They should all implement the strategy interface.

// In the context class, add a field for storing a reference to a strategy object.
// Provide a setter for replacing values of that field. The context should work with the strategy object only via the strategy interface. 

// The context may define an interface which lets the strategy access its data.

// Clients of the context must associate it with a suitable strategy that matches the way they expect the context to perform its primary job.