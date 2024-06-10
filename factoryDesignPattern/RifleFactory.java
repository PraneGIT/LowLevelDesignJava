package factoryDesignPattern;

public class RifleFactory {
    public RifleInterface getRifle(String rifle){
        RifleInterface rifleInterface = null;
        switch(rifle){
            case "Vandal":
                rifleInterface = new VandalImpl();
                System.out.println("Vandal created");
                break;
            case "Phantom":
                rifleInterface = new PhantomImpl();
                System.out.println("Phantom created");
                break;
            default:
                System.out.println("Invalid Rifle");
        }
        return rifleInterface;
    }


}
