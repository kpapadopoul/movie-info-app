package com.workable.movieinfoapp.repository;

import com.workable.movieinfoapp.model.NowPlaying;
import com.workable.movieinfoapp.model.NowPlayingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NowPlayingRepository {

    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    public NowPlayingRepository(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public List<NowPlaying> getNowPlaying(String apiKey, String region) {

        String url = String.format(
                "https://api.themoviedb.org/3/movie/now_playing?api_key={}&region={}", apiKey, region);

        NowPlayingResponse nowPlayingResponse = restTemplateBuilder
                .build()
                .getForObject(
                        url, NowPlayingResponse.class);

        return new ArrayList<>();
    }

}
