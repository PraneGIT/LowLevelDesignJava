package decoratorDesignPattern;

public class CheeseTopping extends ToppingsDecorator{

    BasePizza basePizza;

    public CheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost()+20;
    }
    
}
