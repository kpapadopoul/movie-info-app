package com.workable.movieinfoapp.service;

import com.workable.movieinfoapp.model.Country;
import com.workable.movieinfoapp.model.NowPlaying;
import com.workable.movieinfoapp.repository.CountryRepository;
import com.workable.movieinfoapp.repository.NowPlayingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class NowPlayingService {

    private static String API_KEY = "bbb0e77b94b09193e6f32d5fac7a3b9c";

    private CountryRepository countryRepository;
    private NowPlayingRepository nowPlayingRepository;

    @Autowired
    public NowPlayingService(CountryRepository countryRepository, NowPlayingRepository nowPlayingRepository) {
        this.countryRepository = countryRepository;
        this.nowPlayingRepository = nowPlayingRepository;
    }

    public void getNowPlaying() {
        List<Country> countries = countryRepository.findAll();

        List<List<NowPlaying>> collect = countries
                .stream()
                .map(country -> nowPlayingRepository.getNowPlaying(API_KEY, country.getCode()))
                .collect(Collectors.toList());
    }

}
