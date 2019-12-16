package com.workable.movieinfoapp.model;

import java.util.List;

public class NowPlayingControllerResponse {
    private List<Movie> movies;
    private List<CurrentlyInTheaters> currentlyInTheaters;

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<CurrentlyInTheaters> getCurrentlyInTheaters() {
        return currentlyInTheaters;
    }

    public void setCurrentlyInTheaters(List<CurrentlyInTheaters> currentlyInTheaters) {
        this.currentlyInTheaters = currentlyInTheaters;
    }

    @Override
    public String toString() {
        return "NowPlayingControllerResponse{" +
                "movies=" + movies +
                ", currentlyInTheaters=" + currentlyInTheaters +
                '}';
    }

}
