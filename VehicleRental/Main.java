package vehicleRental;
import java.util.ArrayList;
import java.util.List;

import vehicleRental.Models.*;

public class Main {
    public static void main(String[] args) {
        List<User>users = addUsers(); //set up of all User
        List<Vehicle>carVehicles = addCarVehicles(); // initialize all vehicles
        VehicleInventory vehicleInventory = new VehicleInventory(); // get the inventory

        for(Vehicle vehicle:carVehicles){
            vehicleInventory.addCarVehicle(vehicle); //add all cars to the inventory
        }

        List<Store>stores = addStores(vehicleInventory); // get all the stores

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(stores,users);  //init our system



        User user = users.get(0);//user enters the store

        Store store = vehicleRentalSystem.getStore("L1"); //get the store
        System.out.println(store.getStoreLocation());
        System.out.println(store.getStoreName());

        List<Vehicle>cars = store.getCarsVehicles();// get all the cars to show to user
        for(Vehicle car:cars){
            System.out.println(car.getVehicleName());
        }

        Reservations reservation = new Reservations(user,cars.get(0)); //book a car
        System.out.println(reservation.reservationID);

        reservation.updateReservationStatus(ReservationStaus.COMPLETED); //update the status
        System.out.println(reservation.reservationStatus);

        Bill bill = new Bill(4325,reservation.vehicle.getVehicleRate(),reservation);//gerate the bill

        System.out.println(bill.getBillID());
    }

    private static List<Vehicle> addCarVehicles() {
        Vehicle car1 = new Car();
        car1.setVehicleAvailable(true);
        car1.setVehicleCapacity(4);
        car1.setVehicleName("Car1");
        car1.setVehicleNumber("C1");
        car1.setVehicleRate(100);
        
        Vehicle car2 = new Car();
        car2.setVehicleAvailable(true);
        car2.setVehicleCapacity(4);
        car2.setVehicleName("Car2");
        car2.setVehicleNumber("C2");
        car2.setVehicleRate(200);

        List<Vehicle> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        return carList;
    }

    private static List<Store> addStores( VehicleInventory vehicleInventory) {
        Store store1 = new Store("S1","L1");
        store1.setVehicleInventory(vehicleInventory);
        Store store2 = new Store("S1","L2");
        store2.setVehicleInventory(vehicleInventory);

        //create a list and add store1 and 2
        List<Store> storeList = new ArrayList<>();
        storeList.add(store1);
        storeList.add(store2);

        return storeList;
    }

    private static List<User> addUsers() {
        User user1 = new User("abc","a@b.com","L1");
        User user2 = new User("def","b@c.com","L2");

        //create a list and add user1 and 2
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        return userList;

    }
    
}
