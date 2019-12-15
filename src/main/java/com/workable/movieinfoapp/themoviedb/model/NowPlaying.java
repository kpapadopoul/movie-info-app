package com.workable.movieinfoapp.themoviedb.model;

public class NowPlaying {
    private String country;
    private NowPlayingResponse nowPlayingResponse;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public NowPlayingResponse getNowPlayingResponse() {
        return nowPlayingResponse;
    }

    public void setNowPlayingResponse(NowPlayingResponse nowPlayingResponse) {
        this.nowPlayingResponse = nowPlayingResponse;
    }

    @Override
    public String toString() {
        return "NowPlaying{" +
                "country='" + country + '\'' +
                ", nowPlayingResponse=" + nowPlayingResponse +
                '}';
    }

}
