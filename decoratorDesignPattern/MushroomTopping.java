package decoratorDesignPattern;

public class MushroomTopping extends ToppingsDecorator{

    BasePizza basePizza;

    public MushroomTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost()+30; 
    }
    
}
