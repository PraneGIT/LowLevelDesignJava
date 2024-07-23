package compositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Directory animeDirectory = new Directory("anime");
        animeDirectory.addFile(new File("jujutsu kaisen"));

        Directory mangaDirectory = new Directory("manga");
        mangaDirectory.addFile(new File("berserk"));
        mangaDirectory.addFile(new File("jojo"));

        animeDirectory.addFile(mangaDirectory);

        animeDirectory.ls();

    }
}
