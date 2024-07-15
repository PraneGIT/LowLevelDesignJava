package bookMyShow;

import java.util.List;

public class Screen {
    private int id;
    private int capacity;
    List<Seat> seats;

    Screen(
        int id,
        int capacity,
        List<Seat> seats
    ){
        this.id = id;
        this.capacity = capacity;
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
