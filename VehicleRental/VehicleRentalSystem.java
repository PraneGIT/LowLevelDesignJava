package vehicleRental;
import java.util.List;

import vehicleRental.Models.*;

public class VehicleRentalSystem {

    List<Store>stores;
    List<User>users;

    public VehicleRentalSystem(List<Store>stores,List<User>users){
        this.stores = stores;
        this.users = users;
    }

    public Store getStore(String location){
        return stores.get(0);
    }
    
}
