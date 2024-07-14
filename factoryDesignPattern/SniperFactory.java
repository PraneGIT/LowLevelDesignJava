package factoryDesignPattern;

public class SniperFactory implements GunFactory{
    public GunInterface createGun(String type){
        GunInterface sniperInterface = null;
        switch(type){
            case "Operator":
                 sniperInterface = new OperatorImpl();
                System.out.println("Operator created");
                break;
            default:
                sniperInterface = new NullGunImpl();
                System.out.println("Invalid Sniper");
         }

        return sniperInterface;
    }
}
