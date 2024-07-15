package bookMyShow;

public class Movie {
    private String name;
    private int duration;
    private String language;

    public Movie(String name, int duration, String language) {
        this.name = name;
        this.duration = duration;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String getLanguage() {
        return language;
    }

}
