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

// Gun Interface: An interface GunInterface is defined, specifying the common methods (damage(), ammoCapacity(), and spray()) that all gun types must implement.

// Concrete Gun Implementations: Specific gun types (Vandal, Phantom, and Operator) implement the GunInterface, providing their own implementations of the required methods.

// Abstract Factory Interface: An interface GunFactory serves as the abstract factory, declaring a method createGun(String type) that all concrete factories must implement.

// Concrete Factories: RifleFactory and SniperFactory are concrete implementations of the GunFactory interface. Each factory knows how to create its specific types of guns. For instance,
//  RifleFactory creates rifles like Vandal and Phantom,  while SniperFactory creates snipers like Operator.

// Client Code: The Gun class (client code) uses the abstract factory to create gun objects without needing to know the exact class of the object that will be created. 
// This ensures loose coupling and adheres to the Dependency Inversion Principle.


