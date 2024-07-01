package VehicleRental.Models;

public class Reservations {
    public int reservationID;
    public User user;
    public Vehicle vehicle;
    public ReservationStaus reservationStatus;

    public Reservations(User user,Vehicle vehicle){
        this.user = user;
        this.vehicle = vehicle;
        this.reservationStatus = ReservationStaus.PENDING;
        reservationID = 69; 
    }

    //update logic
    public void updateReservationStatus(ReservationStaus status){
        this.reservationStatus = status;
    }
}
