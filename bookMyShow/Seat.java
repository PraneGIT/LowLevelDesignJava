package bookMyShow;

import bookMyShow.enums.SeatEnum;

public class Seat {
    int id;
    char row;
    SeatEnum type;

    public Seat(int id, char row, SeatEnum type) {
        this.id = id;
        this.row = row;
        this.type = type;
    }

    public int getNumber() {
        return id;
    }

    public char getRow() {
        return row;
    }

    public SeatEnum getType() {
        return type;
    }

}
