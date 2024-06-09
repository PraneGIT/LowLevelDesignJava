package decoratorDesignPattern;

public class PizzaStore {
    public static void main(String[] args) {
        BasePizza pizza1= new MargaritaPizza();
        System.out.println("Cost of Margarita Pizza: "+pizza1.getCost());

        BasePizza pizza2= new CheeseTopping(new MargaritaPizza());
        System.out.println("Cost of Margarita Pizza with Cheese Topping: "+pizza2.getCost());

        BasePizza pizza3= new MushroomTopping(new CheeseTopping(new GoldenDelightPizza()));
        System.out.println("Cost of Golden Delight Pizza with Cheese and Mushroom Topping: "+pizza3.getCost());
    }
    
}


// Make sure your business domain can be represented as a primary component with multiple optional layers over it.

// Figure out what methods are common to both the primary component and the optional layers. Create a component interface and declare those methods there.

// Create a concrete component class and define the base behavior in it.

// Create a base decorator class. It should have a field for storing a reference to a wrapped object. The field should be declared with the component interface type to allow linking to concrete components as well as decorators. The base decorator must delegate all work to the wrapped object.

// Make sure all classes implement the component interface.

// Create concrete decorators by extending them from the base decorator. A concrete decorator must execute its behavior before or after the call to the parent method (which always delegates to the wrapped object).

// The client code must be responsible for creating decorators and composing them in the way the client needs.

