package bookMyShow;

import java.util.ArrayList;

import bookMyShow.enums.CityEnum;

public class Theater {
    ArrayList<Screen> screens = new ArrayList<Screen>();
    CityEnum city;
    String name;
    ArrayList<Show> shows = new ArrayList<Show>();

    public Theater(String name,ArrayList<Screen> screens,CityEnum city) {
        this.screens = screens;
        this.city = city;
        this.name = name;
    }

    public void addScreen(Screen screen){
        screens.add(screen);
    }

    public void removeScreen(Screen screen){
        screens.remove(screen);
    }

    public ArrayList<Screen> getScreens() {
        return screens;
    }

    public CityEnum getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Show> getShows() {
        return shows;
    }

    public void addShow(Show show){
        shows.add(show);
    }

    public void removeShow(Show show){
        shows.remove(show);
    }

}
