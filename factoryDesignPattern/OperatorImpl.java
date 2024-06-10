package factoryDesignPattern;

public class OperatorImpl implements GunInterface{

    @Override
    public int damage() {
        return 250;
    }

    @Override
    public int ammoCapacity() {
        return 5;
    }

    @Override
    public int spray() {
        return 999;
    }
    
}
