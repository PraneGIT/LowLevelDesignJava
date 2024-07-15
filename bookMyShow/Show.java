package bookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Show {
    String showId;
    Theater theater;
    Screen screen;
    Movie movie;
    String showTime;
    List<Integer> bookedSeatIds = new ArrayList<>();

    public Show(String id,Theater theater, Screen screen, Movie movie, String showTime) {
        this.showId = id;
        this.theater = theater;
        this.screen = screen;
        this.movie = movie;
        this.showTime = showTime;
    }

    public Theater getTheater() {
        return theater;
    }

    public Screen getScreen() {
        return screen;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getShowTime() {
        return showTime;
    }

    public List<Integer> getBookedSeatIds() {
        return bookedSeatIds;
    }

    public void bookSeat(int seatId){
        bookedSeatIds.add(seatId);
        System.out.println(seatId + " seat booked");
    }

}
