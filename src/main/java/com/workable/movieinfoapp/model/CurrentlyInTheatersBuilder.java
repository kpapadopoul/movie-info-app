package com.workable.movieinfoapp.model;

import java.util.Date;

public final class CurrentlyInTheatersBuilder {
    private Long id;
    private Long movie;
    private Long country;
    private Date date;

    private CurrentlyInTheatersBuilder() {
    }

    public static CurrentlyInTheatersBuilder aCurrentlyInTheaters() {
        return new CurrentlyInTheatersBuilder();
    }

    public CurrentlyInTheatersBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public CurrentlyInTheatersBuilder withMovie(Long movie) {
        this.movie = movie;
        return this;
    }

    public CurrentlyInTheatersBuilder withCountry(Long country) {
        this.country = country;
        return this;
    }

    public CurrentlyInTheatersBuilder withDate(Date date) {
        this.date = date;
        return this;
    }

    public CurrentlyInTheaters build() {
        CurrentlyInTheaters currentlyInTheaters = new CurrentlyInTheaters();
        currentlyInTheaters.setId(id);
        currentlyInTheaters.setMovie(movie);
        currentlyInTheaters.setCountry(country);
        currentlyInTheaters.setDate(date);
        return currentlyInTheaters;
    }
}
