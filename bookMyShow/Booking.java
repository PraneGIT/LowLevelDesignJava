package bookMyShow;

import bookMyShow.enums.SeatEnum;

public class Booking {

    public void bookShow(Show show, int seatId){
        if(show.getBookedSeatIds().contains(seatId)){
            System.out.println("seat already booked");
        }else{
            new Payment("id", "upi", seatId);
            show.bookSeat(seatId);
        }
    }

    public void cancelShow(Show show, int seatId){
        if(show.getBookedSeatIds().contains(seatId)){
            show.getBookedSeatIds().remove(seatId);
            System.out.println("seat cancelled");
        }else{
            System.out.println("seat not booked");
        }
    }

    public void showBookedSeats(Show show){
        System.out.println(show.getBookedSeatIds());
    }

    public void showAvailableSeats(Show show){
        for(Seat seat:show.getScreen().getSeats()){
            if(!show.getBookedSeatIds().contains(seat.getNumber())){
                System.out.println(seat.getNumber());
            }
        }
    }

    public void showBookedSeatsCount(Show show){
        System.out.println(show.getBookedSeatIds().size());
    }

    public void showAvailableSeatsCount(Show show){
        System.out.println(show.getScreen().getSeats().size());
    }

    public void showBookedSeatsPercentage(Show show){
        System.out.println((show.getBookedSeatIds().size()*100)/show.getScreen().getSeats().size());
    }

    public void showAvailableSeatsPercentage(Show show){
        System.out.println((show.getScreen().getSeats().size()-show.getBookedSeatIds().size())*100/show.getScreen().getSeats().size());
    }

    public void showSeatOfType(Show show,SeatEnum seatEnum){
        for(Seat seat:show.getScreen().getSeats()){
            if(seat.getType()==seatEnum){
                System.out.println(seat.getNumber());
            }
        }
    }
    
}
