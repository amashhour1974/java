package Movie;

class Movie {
    String title;
    String genre;
    int rating;

    void playit() {
        System.out.println("Play my movie !");
    }
}

public class MoviTest {

    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with Wind.";
        one.genre = "Tragic";
        one.rating = -2;

        one.playit();

        Movie two = new Movie();
        two.title = "Lost in Space.";
        two.genre = "Sci";
        two.rating = -1;

        two.playit();
    }

}
