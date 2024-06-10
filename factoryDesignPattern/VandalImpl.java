package factoryDesignPattern;

public class VandalImpl implements GunInterface{

    @Override
    public int damage() {
        return 150;
    }

    @Override
    public int ammoCapacity() {
        return 25;
    }

    @Override
    public int spray() {
        return 100;
    }
    
}
