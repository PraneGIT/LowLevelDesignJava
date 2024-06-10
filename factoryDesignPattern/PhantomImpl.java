package factoryDesignPattern;

public class PhantomImpl implements RifleInterface {

    @Override
    public int damage() {
        return 140;
    }

    @Override
    public int ammoCapacity() {
        return 30;
    }

    @Override
    public int spray() {
        return 80;
    }
    
}
