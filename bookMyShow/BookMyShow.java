package bookMyShow;

import java.util.ArrayList;
import java.util.List;

import bookMyShow.enums.CityEnum;
import bookMyShow.enums.SeatEnum;

public class BookMyShow {

    public MovieController movieController;
    static TheaterController theaterController;

    BookMyShow() {
        movieController = new MovieController();
        theaterController = new TheaterController();
    }

    void init() {
        createMovies();
        createTheaters();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.init();
        //user enters site views all movies
        List<Movie>myMovies = bookMyShow.movieController.getMoviesByCity(CityEnum.PATNA);

        for (Movie movie : myMovies) {
            System.out.println(movie.getName());
        }

        //user views all theater that has that movie location wise
        List<Theater>myTheaters = bookMyShow.theaterController.getTheatersByCity(CityEnum.PATNA);
        for (Theater theater : myTheaters) {
            System.out.println(theater.getName());
        }

        //user books the seat for that show
        bookMyShow.createBooking(myMovies.get(0),CityEnum.PATNA,SeatEnum.PLATINUM);

    }

    private void createTheaters() {
        // create list<seats>
        List<Seat> seats1 = new ArrayList<Seat>();

        for (int i = 0; i < 50; i++) {
            seats1.add(new Seat(i, 'F', SeatEnum.SILVER));
        }

        for (int i = 50; i < 90; i++) {
            seats1.add(new Seat(i, 'A', SeatEnum.GOLD));
        }

        for (int i = 90; i < 100; i++) {
            seats1.add(new Seat(i, 'C', SeatEnum.PLATINUM));
        }

        // create list<screens>
        ArrayList<Screen> screens1 = new ArrayList<Screen>();
        screens1.add(new Screen(1, 100, seats1));
        screens1.add(new Screen(2, 100, seats1));
        theaterController.addTheater(new Theater("Mona CinemaHall",screens1, CityEnum.PATNA));

        // create list<seats>
        List<Seat> seats2 = new ArrayList<Seat>();
        for (int i = 0; i < 50; i++) {
            seats2.add(new Seat(i, 'F', SeatEnum.SILVER));
        }
        for (int i = 50; i < 90; i++) {
            seats2.add(new Seat(i, 'A', SeatEnum.GOLD));
        }
        for (int i = 90; i < 100; i++) {
            seats2.add(new Seat(i, 'C', SeatEnum.PLATINUM));
        }

        // create list<screens>
        ArrayList<Screen> screens2 = new ArrayList<Screen>();
        screens2.add(new Screen(1, 100, seats2));
        screens2.add(new Screen(2, 100, seats2));
        theaterController.addTheater(new Theater("Cinepolis",screens2, CityEnum.PATNA));


        //create shows
        Movie movie1 = movieController.getMovie("The Boy and Heron");
        Theater theater1= theaterController.getTheater("Cinepolis");
        Show show1 = new Show("show1",theater1,theater1.getScreens().get(0),movie1,"9:00");
        theater1.addShow(show1);


    }

    private void createMovies() {

        movieController.addMovie(new Movie("The Boy and Heron",90,"Japaneese"), CityEnum.PATNA);
        movieController.addMovie(new Movie("Spirited Away",120,"English"), CityEnum.PATNA);
        movieController.addMovie(new Movie("Delli Belly",120,"Hindi"), CityEnum.DELHI);

    }

    private void createBooking(Movie movie,CityEnum city,SeatEnum seatEnum){
        List<Theater> theaters = theaterController.getTheatersByCity(city);
        for(Theater theater : theaters){
            for(Show show : theater.getShows()){
                if(show.getMovie().equals(movie)){
                    System.out.println("Booking for movie "+movie.getName()+" at "+theater.getName()+" Seat type:"+seatEnum);
                    System.out.println("Available seats for show "+show.getMovie().getName()+" are: "+ (show.screen.getCapacity()-show.bookedSeatIds.size()) );
                    Booking booking = new Booking();
                    System.out.println("Seats of type "+ seatEnum + " are ");
                    booking.showSeatOfType(show, seatEnum);
                    booking.bookShow(show,96);
                    return;
                }
            }
        }

    }
}
