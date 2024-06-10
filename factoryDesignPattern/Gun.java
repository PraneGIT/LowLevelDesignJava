package factoryDesignPattern;

public class Gun {
    public static void main(String[] args) {
        GunFactory rifleFactory = new RifleFactory();
        GunFactory sniperFactory = new SniperFactory();


        GunInterface gun = rifleFactory.createGun("Vandal");
        System.out.println("Damage: " + gun.damage());
        System.out.println("Ammo Capacity: " + gun.ammoCapacity());
        System.out.println("Spray: " + gun.spray());

        gun = rifleFactory.createGun("Phantom");
        System.out.println("Damage: " + gun.damage());
        System.out.println("Ammo Capacity: " + gun.ammoCapacity());
        System.out.println("Spray: " + gun.spray());

        
        gun = sniperFactory.createGun("Operator");
        System.out.println("Damage: " + gun.damage());
        System.out.println("Ammo Capacity: " + gun.ammoCapacity());
        System.out.println("Spray: " + gun.spray());

    }
}
