package com.workable.movieinfoapp.themoviedb.model;

public final class NowPlayingBuilder {
    private String country;
    private NowPlayingResponse nowPlayingResponse;

    private NowPlayingBuilder() {
    }

    public static NowPlayingBuilder aNowPlaying() {
        return new NowPlayingBuilder();
    }

    public NowPlayingBuilder withCountry(String country) {
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
