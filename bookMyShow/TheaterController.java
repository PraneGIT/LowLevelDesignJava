package bookMyShow;

import java.util.ArrayList;
import java.util.HashMap;

import bookMyShow.enums.CityEnum;

public class TheaterController {
    
    ArrayList<Theater> theaters = new ArrayList<Theater>();
    HashMap<CityEnum,ArrayList<Theater>> theatersControllerMap = new HashMap<CityEnum,ArrayList<Theater>>();

    public void addTheater(Theater theater){
        theaters.add(theater);
        if(theatersControllerMap.containsKey(theater.city)){
            theatersControllerMap.get(theater.city).add(theater);
        }else{
            ArrayList<Theater> theaterList = new ArrayList<Theater>();
            theaterList.add(theater);
            theatersControllerMap.put(theater.city,theaterList);
        }
    }

    public void removeTheater(Theater theater){
        theaters.remove(theater);
        theatersControllerMap.get(theater.city).remove(theater);
    }

    public ArrayList<Theater> getTheaters() {
        return theaters;
    }

    public ArrayList<Theater> getTheatersByCity(CityEnum city){
        return theatersControllerMap.get(city);
    }

    public void addScreenToTheater(Theater theater,Screen screen){
        theater.addScreen(screen);
    }

    public void removeScreenFromTheater(Theater theater,Screen screen){
        theater.removeScreen(screen);
    }

    public Theater getTheater(String name){
        Theater theater = null;
        for(Theater t : theaters){
            if(t .name.equals(name)){
                theater = t;
                return theater;
            }
        }
        return theater;
    }

}
