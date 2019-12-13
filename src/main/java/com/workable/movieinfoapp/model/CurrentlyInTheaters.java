package com.workable.movieinfoapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "currently_in_theaters")
public class CurrentlyInTheaters {

    @Id
    private Long id;
    private Long movie;
    private Long country;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovie() {
        return movie;
    }

    public void setMovie(Long movie) {
        this.movie = movie;
    }

    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CurrentlyInTheaters{" +
                "id=" + id +
                ", movie=" + movie +
                ", country=" + country +
                ", date=" + date +
                '}';
    }

}
