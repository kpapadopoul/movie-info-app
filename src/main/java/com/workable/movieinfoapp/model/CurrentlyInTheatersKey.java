package com.workable.movieinfoapp.model;

import java.util.Objects;

public class CurrentlyInTheatersKey {
    private Long country;
    private Long movie;

    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    public Long getMovie() {
        return movie;
    }

    public void setMovie(Long movie) {
        this.movie = movie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentlyInTheatersKey that = (CurrentlyInTheatersKey) o;
        return Objects.equals(country, that.country) &&
                Objects.equals(movie, that.movie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, movie);
    }

    @Override
    public String toString() {
        return "CurrentlyInTheatersKey{" +
                "country=" + country +
                ", movie=" + movie +
                '}';
    }

}
