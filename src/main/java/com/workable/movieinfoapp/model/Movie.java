package com.workable.movieinfoapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    private Long id;
    private String name;
    private Long director;

    @Column(columnDefinition = "country_produced")
    private Long countryProduced;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDirector() {
        return director;
    }

    public void setDirector(Long director) {
        this.director = director;
    }

    public Long getCountryProduced() {
        return countryProduced;
    }

    public void setCountryProduced(Long countryProduced) {
        this.countryProduced = countryProduced;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director=" + director +
                ", countryProduced=" + countryProduced +
                '}';
    }

}
