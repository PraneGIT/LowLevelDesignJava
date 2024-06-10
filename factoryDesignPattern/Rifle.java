package factoryDesignPattern;

public class Rifle {
    public static void main(String[] args) {
        RifleFactory rifleFactory = new RifleFactory();
        
        RifleInterface rifleInterface = rifleFactory.getRifle("Vandal");
        System.out.println("Damage: " + rifleInterface.damage());
        System.out.println("Ammo Capacity: " + rifleInterface.ammoCapacity());
        System.out.println("Spray: " + rifleInterface.spray());


        rifleInterface = rifleFactory.getRifle("Phantom");
        System.out.println("Damage: " + rifleInterface.damage());
        System.out.println("Ammo Capacity: " + rifleInterface.ammoCapacity());
        System.out.println("Spray: " + rifleInterface.spray());

    }
}
