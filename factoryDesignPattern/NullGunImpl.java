package factoryDesignPattern;

public class NullGunImpl implements GunInterface{

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public int ammoCapacity() {
        return 0;
    }

    @Override
    public int spray() {
        return 0;
    }
    
}
