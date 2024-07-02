package vehicleRental.Models;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {
    
    //a list of vehicles for car and bile to used in store
    private List<Vehicle> carsList = new ArrayList<Vehicle>();
    private List<Vehicle> bikesList = new ArrayList<Vehicle>();

 
    public void addCarVehicle(Vehicle vehicle){
        carsList.add(vehicle);
    }

    public void removeCarVehicle(Vehicle vehicle){
        carsList.remove(vehicle);
    }

    public List<Vehicle> getCarsVehicles(){
        return carsList;
    }

    public void addBikeVehicle(Vehicle vehicle){
        bikesList.add(vehicle);
    }

    public void removeBikeVehicle(Vehicle vehicle){
        bikesList.remove(vehicle);
    }

    public List<Vehicle> getBikesVehicles(){
        return bikesList;
    }

}
