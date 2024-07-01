package VehicleRental.Models;

public class Bill {
    private int billID;
    private double amount;
    private Reservations reservation;

    public Bill(int billID, double amount, Reservations reservation) {
        this.billID = billID;
        this.amount = amount;
        this.reservation = reservation;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Reservations getReservation() {
        return reservation;
    }

    public void setReservation(Reservations reservation) {
        this.reservation = reservation;
    }
    
}
