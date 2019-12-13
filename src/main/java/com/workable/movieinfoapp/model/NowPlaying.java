package com.workable.movieinfoapp.model;

import java.util.List;

public class NowPlaying {
    private Long country;
    private List<Movie> movies;

    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "NowPlaying{" +
                "country=" + country +
                ", movies=" + movies +
                '}';
    }

}
