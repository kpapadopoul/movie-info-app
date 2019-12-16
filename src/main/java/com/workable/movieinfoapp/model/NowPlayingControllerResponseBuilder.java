package com.workable.movieinfoapp.model;

import java.util.List;

public final class NowPlayingControllerResponseBuilder {
    private List<Movie> movies;
    private List<CurrentlyInTheaters> currentlyInTheaters;

    private NowPlayingControllerResponseBuilder() {
    }

    public static NowPlayingControllerResponseBuilder aNowPlayingControllerResponse() {
        return new NowPlayingControllerResponseBuilder();
    }

    public NowPlayingControllerResponseBuilder withMovies(List<Movie> movies) {
        this.movies = movies;
        return this;
    }

    public NowPlayingControllerResponseBuilder withCurrentlyInTheaters(List<CurrentlyInTheaters> currentlyInTheaters) {
        this.currentlyInTheaters = currentlyInTheaters;
        return this;
    }

    public NowPlayingControllerResponse build() {
        NowPlayingControllerResponse nowPlayingControllerResponse = new NowPlayingControllerResponse();
        nowPlayingControllerResponse.setMovies(movies);
        nowPlayingControllerResponse.setCurrentlyInTheaters(currentlyInTheaters);
        return nowPlayingControllerResponse;
    }
}
