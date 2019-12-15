package com.workable.movieinfoapp.themoviedb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NowPlayingValue {

    private Long id;
    private String original_title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    @Override
    public String toString() {
        return "NowPlayingValue{" +
                "id=" + id +
                ", original_title='" + original_title + '\'' +
                '}';
    }

}
