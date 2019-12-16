package com.workable.movieinfoapp.service;

import com.workable.movieinfoapp.component.KeyComponent;
import com.workable.movieinfoapp.model.*;
import com.workable.movieinfoapp.repository.CountryRepository;
import com.workable.movieinfoapp.repository.CurrentlyInTheatersRepository;
import com.workable.movieinfoapp.repository.MovieRepository;
import com.workable.movieinfoapp.themoviedb.model.NowPlaying;
import com.workable.movieinfoapp.themoviedb.model.NowPlayingResponse;
import com.workable.movieinfoapp.themoviedb.model.NowPlayingValue;
import com.workable.movieinfoapp.themoviedb.repository.NowPlayingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class NowPlayingServiceImpl implements NowPlayingService {

    private static String API_KEY = "bbb0e77b94b09193e6f32d5fac7a3b9c";

    private CountryRepository countryRepository;
    private NowPlayingRepository nowPlayingRepository;
    private MovieRepository movieRepository;
    private CurrentlyInTheatersRepository currentlyInTheatersRepository;

    @Autowired
    public NowPlayingServiceImpl(CountryRepository countryRepository, NowPlayingRepository nowPlayingRepository,
                                 MovieRepository movieRepository, CurrentlyInTheatersRepository currentlyInTheatersRepository) {
        this.countryRepository = countryRepository;
        this.nowPlayingRepository = nowPlayingRepository;
        this.movieRepository = movieRepository;
        this.currentlyInTheatersRepository = currentlyInTheatersRepository;
    }

    @Override
    public NowPlayingControllerResponse getNowPlaying() {
        List<Country> countries = countryRepository.findAll();

        List<NowPlaying> nowPlayingList = countries
                .stream()
                .map(country -> nowPlayingRepository.getNowPlaying(API_KEY, country))
                .collect(Collectors.toList());

        List<Movie> movies = nowPlayingList
                .stream()
                .map(NowPlaying::getNowPlayingResponse)
                .map(NowPlayingResponse::getResults)
                .flatMap(Collection::stream)
                .filter(KeyComponent.distinctByKey(NowPlayingValue::getId))
                .map(value -> MovieBuilder.aMovie().withId(value.getId()).withName(value.getOriginal_title()).build())
                .collect(Collectors.toList());

        List<Movie> movieList = movieRepository.saveAll(movies);

        List<CurrentlyInTheaters> currentlyInTheaters = nowPlayingList
                .stream()
                .flatMap(value -> value.getNowPlayingResponse().getResults().stream().map(
                        nowPlayingValue -> CurrentlyInTheatersBuilder.aCurrentlyInTheaters()
                                .withCountry(value.getCountry().getId())
                                .withMovie(nowPlayingValue.getId())
                                .withDate(Calendar.getInstance().getTime())
                                .build()))
                .collect(Collectors.toList());

        List<CurrentlyInTheaters> currentlyInTheatersList = currentlyInTheatersRepository.saveAll(currentlyInTheaters);

        return NowPlayingControllerResponseBuilder
                .aNowPlayingControllerResponse()
                .withMovies(movieList)
                .withCurrentlyInTheaters(currentlyInTheatersList)
                .build();

    }

}
