package com.workable.movieinfoapp.model;

public final class MovieBuilder {
    private Long id;
    private String name;
    private Long director;
    private Long countryProduced;

    private MovieBuilder() {
    }

    public static MovieBuilder aMovie() {
        return new MovieBuilder();
    }

    public MovieBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public MovieBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public MovieBuilder withDirector(Long director) {
        this.director = director;
        return this;
    }

    public MovieBuilder withCountryProduced(Long countryProduced) {
        this.countryProduced = countryProduced;
        return this;
    }

    public Movie build() {
        Movie movie = new Movie();
        movie.setId(id);
        movie.setName(name);
        movie.setDirector(director);
        movie.setCountryProduced(countryProduced);
        return movie;
    }
}
