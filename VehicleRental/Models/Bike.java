package vehicleRental.Models;

public class Bike implements Vehicle{

    private VehicleTypes vehicleType;
    private String vehicleName;
    private String vehicleNumber;
    private int vehicleCapacity;
    private int vehicleRate;
    private boolean isVehicleAvailable;

    @Override
    public VehicleTypes getVehicleType() {
        return vehicleType.Bike;
    }

    @Override
    public String getVehicleName() {
        return  vehicleName;
    }

    @Override
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    @Override
    public int getVehicleCapacity() {
        return vehicleCapacity;
    }

    @Override
    public int getVehicleRate() {
        return vehicleRate;
    }

    @Override
    public boolean isVehicleAvailable() {
        return isVehicleAvailable;
    }

    @Override
    public void setVehicleAvailable(boolean available) {
        isVehicleAvailable = available;
    }

    @Override
    public void setVehicleRate(int rate) {
        vehicleRate = rate;
    }

    @Override
    public void setVehicleCapacity(int capacity) {
        vehicleCapacity = capacity;
    }

    @Override
    public void setVehicleName(String name) {
        vehicleName = name;
    }

    @Override
    public void setVehicleNumber(String number) {
        vehicleNumber = number;
    }

    @Override
    public void setVehicleType(String type) {
        vehicleType = VehicleTypes.valueOf(type);
    }

    @Override
    public VehicleStatus getStatus() {
        if(isVehicleAvailable){
            return VehicleStatus.Available;
        }else{
            return VehicleStatus.Booked;
        }
    }
    
}
