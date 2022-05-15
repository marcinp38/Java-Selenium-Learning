package SiiDay34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MovieLibrary {
    List<Movie> movieList = new ArrayList<>();


    public void add (Movie movie){
        movieList.add(movie);
    }

    public List<Movie> getMoviesBetweenDates(int startYear, int endYear) {
        List<Movie> tmp = new ArrayList<>();
        for (Movie item : movieList){
            if (item.rokWydania >= startYear && item.rokWydania <= endYear)
                tmp.add(item);
        }
        return tmp;
    }

    public void showMoviesBetweenDates(int startYear, int endYear) {
        for (Movie item : movieList){
            if (item.rokWydania >= startYear && item.rokWydania <= endYear)
                System.out.println(item);
        }
    }

    public void showRandomMovieDetails() {
        int r = ThreadLocalRandom.current().nextInt(0, movieList.size());
        System.out.println(movieList.get(r));
    }

    public List<Movie> getMoviesByActor(String name, String surname) {
        Actor tmpActor = new Actor(name, surname);
        List<Movie> tmp = new ArrayList<>();
        for (Movie item : movieList) {
            if (item.isActorOnTheList(tmpActor))
                tmp.add(item);
        }
        return tmp;
    }


    public void showMoviesWithActor(String name, String surname) {
        for (Movie item : getMoviesByActor(name, surname)) {
            System.out.println(item);
        }
    }

}
