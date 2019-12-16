package com.workable.movieinfoapp.themoviedb.model;

import com.workable.movieinfoapp.model.Country;

public final class NowPlayingBuilder {
    private Country country;
    private NowPlayingResponse nowPlayingResponse;

    private NowPlayingBuilder() {
    }

    public static NowPlayingBuilder aNowPlaying() {
        return new NowPlayingBuilder();
    }

    public NowPlayingBuilder withCountry(Country country) {
        this.country = country;
        return this;
    }

    public NowPlayingBuilder withNowPlayingResponse(NowPlayingResponse nowPlayingResponse) {
        this.nowPlayingResponse = nowPlayingResponse;
        return this;
    }

    public NowPlaying build() {
        NowPlaying nowPlaying = new NowPlaying();
        nowPlaying.setCountry(country);
        nowPlaying.setNowPlayingResponse(nowPlayingResponse);
        return nowPlaying;
    }
}
