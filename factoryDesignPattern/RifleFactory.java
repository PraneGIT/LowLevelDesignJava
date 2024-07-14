package factoryDesignPattern;

public class RifleFactory implements GunFactory{
    public GunInterface createGun(String type){
        GunInterface rifleInterface = null;
        switch(type){
            case "Vandal":
                rifleInterface = new VandalImpl();
                System.out.println("Vandal created");
                break;
            case "Phantom":
                rifleInterface = new PhantomImpl();
                System.out.println("Phantom created");
                break;
            default:
                rifleInterface = new NullGunImpl();
                System.out.println("Invalid Rifle");
        }
        return rifleInterface;
    }


}
