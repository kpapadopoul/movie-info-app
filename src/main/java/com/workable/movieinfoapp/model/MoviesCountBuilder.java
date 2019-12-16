package com.workable.movieinfoapp.model;

public final class MoviesCountBuilder {
    private Long id;
    private Long year;
    private Long month;
    private Long country;
    private Long noMovies;

    private MoviesCountBuilder() {
    }

    public static MoviesCountBuilder aMoviesCount() {
        return new MoviesCountBuilder();
    }

    public MoviesCountBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public MoviesCountBuilder withYear(Long year) {
        this.year = year;
        return this;
    }

    public MoviesCountBuilder withMonth(Long month) {
        this.month = month;
        return this;
    }

    public MoviesCountBuilder withCountry(Long country) {
        this.country = country;
        return this;
    }

    public MoviesCountBuilder withNoMovies(Long noMovies) {
        this.noMovies = noMovies;
        return this;
    }

    public MoviesCount build() {
        MoviesCount moviesCount = new MoviesCount();
        moviesCount.setId(id);
        moviesCount.setYear(year);
        moviesCount.setMonth(month);
        moviesCount.setCountry(country);
        moviesCount.setNoMovies(noMovies);
        return moviesCount;
    }
}
