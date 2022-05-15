package SiiDay34;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String movieTitle;
    int rokWydania;
    Director director;
    List<Actor> actorList = new ArrayList<>();
    Genere genere;

    public Movie(String movieTitle, int rokWydania, Director director, List<Actor> actorList, Genere genere) {
        this.movieTitle = movieTitle;
        this.rokWydania = rokWydania;
        this.director = director;
        this.actorList = actorList;
        this.genere = genere;
    }

    public Movie(String movieTitle, int rokWydania, Director director, Genere genere) {
        this.movieTitle = movieTitle;
        this.rokWydania = rokWydania;
        this.director = director;
        this.genere = genere;
    }

    public void addActor(Actor actor){
        actorList.add(actor);
    }




    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", rokWydania=" + rokWydania +
                ", Genere=" + genere +
                ", director=" + director +
                ", Actors=" + actorList +
                '}';
    }

    public boolean isActorOnTheList(Actor actor) {
        return actorList.contains(actor);

    }
}
