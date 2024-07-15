package bookMyShow;

import bookMyShow.enums.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieController {
    ArrayList<Movie> movies = new ArrayList<Movie>();
    HashMap<CityEnum, List<Movie>> moviesControllerMap = new HashMap<CityEnum, List<Movie>>();

    public void addMovie(Movie movie, CityEnum city) {
        if (moviesControllerMap.containsKey(city)) {
            moviesControllerMap.get(city).add(movie);
        } else {
            ArrayList<Movie> newList = new ArrayList<Movie>();
            newList.add(movie);
            moviesControllerMap.put(city, newList);
            movies.add(movie);
        }
    }

    public List<Movie> getMoviesByCity(CityEnum city) {
        return moviesControllerMap.get(city);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void removeMovie(Movie movie, CityEnum city) {
        if (moviesControllerMap.containsKey(city)) {
            moviesControllerMap.get(city).remove(movie);
        }
    }

    public Movie getMovie(String movieName) {
        Movie movie=null;
        for (Movie m: movies) {
            if (m.getName().equals(movieName)) {
                movie=m;
                return movie;
            } 
        }

        return movie;
    }
}
