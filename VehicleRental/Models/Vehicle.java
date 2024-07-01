package VehicleRental.Models;

public interface Vehicle {
    public String getVehicleType();
    public String getVehicleName();
    public String getVehicleNumber();
    public int getVehicleCapacity();
    public int getVehicleRate();
    public boolean isVehicleAvailable();
    public void setVehicleAvailable(boolean available);
    public void setVehicleRate(int rate);
    public void setVehicleCapacity(int capacity);
    public void setVehicleName(String name);
    public void setVehicleNumber(String number);
    public void setVehicleType(String type);
}
