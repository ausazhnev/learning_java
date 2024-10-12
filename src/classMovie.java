class Movie {
    String title;
    String genre;
    int rating;

    void playMovie() {
        System.out.println("Показ фильма");
    }
}

public class classMovie {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.title = "Матрица";
        firstMovie.genre = "Фантатика";
        firstMovie.rating = 87;

        Movie secondMovie = new Movie();
        secondMovie.title = "Властилин колец.";
        secondMovie.genre = "фентезе";
        secondMovie.rating = 91;
        secondMovie.playMovie();

        Movie three = new Movie();
        three.title = "О чем говорят мужчины.";
        three.genre = "Комедия";
        three.rating = 99;
    }
}