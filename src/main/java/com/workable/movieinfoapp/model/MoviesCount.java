package com.workable.movieinfoapp.model;

import javax.persistence.*;

@Entity
@Table(name = "movies_count")
public class MoviesCount {

    @Id
    @GeneratedValue
    private Long id;
    private Long year;
    private Long month;
    private Long country;

    @Column(columnDefinition = "no_movies")
    private Long noMovies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Long getMonth() {
        return month;
    }

    public void setMonth(Long month) {
        this.month = month;
    }

    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    public Long getNoMovies() {
        return noMovies;
    }

    public void setNoMovies(Long noMovies) {
        this.noMovies = noMovies;
    }

    @Override
    public String toString() {
        return "MoviesCount{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", country=" + country +
                ", noMovies=" + noMovies +
                '}';
    }

}
