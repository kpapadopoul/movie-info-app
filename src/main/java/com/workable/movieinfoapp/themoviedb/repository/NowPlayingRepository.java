package com.workable.movieinfoapp.themoviedb.repository;

import com.workable.movieinfoapp.model.Country;
import com.workable.movieinfoapp.themoviedb.model.NowPlaying;
import com.workable.movieinfoapp.themoviedb.model.NowPlayingBuilder;
import com.workable.movieinfoapp.themoviedb.model.NowPlayingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Repository;

@Repository
public class NowPlayingRepository {

    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    public NowPlayingRepository(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public NowPlaying getNowPlaying(String apiKey, Country country) {

        String url = String.format(
                "https://api.themoviedb.org/3/movie/now_playing?api_key=%s&region=%s", apiKey, country.getCode());

        NowPlayingResponse nowPlayingResponse = restTemplateBuilder
                .build()
                .getForObject(
                        url, NowPlayingResponse.class);

        return NowPlayingBuilder
                .aNowPlaying()
                .withCountry(country)
                .withNowPlayingResponse(nowPlayingResponse)
                .build();

    }

}
