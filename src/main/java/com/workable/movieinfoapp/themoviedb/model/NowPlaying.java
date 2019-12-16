package com.workable.movieinfoapp.themoviedb.model;

import com.workable.movieinfoapp.model.Country;

public class NowPlaying {
    private Country country;
    private NowPlayingResponse nowPlayingResponse;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
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
