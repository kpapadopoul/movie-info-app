package com.workable.movieinfoapp.themoviedb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NowPlayingResponse {
    List<NowPlayingValue> results;

    public List<NowPlayingValue> getResults() {
        return results;
    }

    public void setResults(List<NowPlayingValue> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "NowPlayingResponse{" +
                "results=" + results +
                '}';
    }

}
