package com.workable.movieinfoapp.model;

public final class CurrentlyInTheatersKeyBuilder {
    private Long country;
    private Long movie;

    private CurrentlyInTheatersKeyBuilder() {
    }

    public static CurrentlyInTheatersKeyBuilder aCurrentlyInTheatersKey() {
        return new CurrentlyInTheatersKeyBuilder();
    }

    public CurrentlyInTheatersKeyBuilder withCountry(Long country) {
        this.country = country;
        return this;
    }

    public CurrentlyInTheatersKeyBuilder withMovie(Long movie) {
        this.movie = movie;
        return this;
    }

    public CurrentlyInTheatersKey build() {
        CurrentlyInTheatersKey currentlyInTheatersKey = new CurrentlyInTheatersKey();
        currentlyInTheatersKey.setCountry(country);
        currentlyInTheatersKey.setMovie(movie);
        return currentlyInTheatersKey;
    }
}
