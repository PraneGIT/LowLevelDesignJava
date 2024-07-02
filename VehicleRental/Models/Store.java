package vehicleRental.Models;

import java.util.List;

public class Store {
    private String storeName;
    private String storeLocation;
    private VehicleInventory vehicleInventory;

    public Store(String storeName, String storeLocation) {
        this.storeName = storeName;
        this.storeLocation = storeLocation;
    }

    
    public Reservations createReservation(User user,Vehicle vehicle){
        return new Reservations(user,vehicle);
    }


    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public void setVehicleInventory(VehicleInventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

    public List<Vehicle> getCarsVehicles(){
        return vehicleInventory.getCarsVehicles();
    }

    public List<Vehicle> getBikesVehicles(){
        return vehicleInventory.getBikesVehicles();
    }

    
}
