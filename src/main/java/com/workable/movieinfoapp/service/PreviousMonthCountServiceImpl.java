package com.workable.movieinfoapp.service;

import com.workable.movieinfoapp.component.KeyComponent;
import com.workable.movieinfoapp.model.CurrentlyInTheaters;
import com.workable.movieinfoapp.model.CurrentlyInTheatersKeyBuilder;
import com.workable.movieinfoapp.model.MoviesCount;
import com.workable.movieinfoapp.model.MoviesCountBuilder;
import com.workable.movieinfoapp.repository.MoviesCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PreviousMonthCountServiceImpl implements PreviousMonthCountService {

    private CurrentlyInTheatersService currentlyInTheatersService;
    private MoviesCountRepository moviesCountRepository;

    @Autowired
    public PreviousMonthCountServiceImpl(CurrentlyInTheatersService currentlyInTheatersService, MoviesCountRepository moviesCountRepository) {
        this.currentlyInTheatersService = currentlyInTheatersService;
        this.moviesCountRepository = moviesCountRepository;
    }

    @Override
    public List<MoviesCount> getPreviousMonthCount() {

        List<CurrentlyInTheaters> previousMonthEntries = currentlyInTheatersService.findPreviousMonthEntries();

        if (previousMonthEntries.isEmpty()) return new ArrayList<>();

        Date date = previousMonthEntries
                .get(0)
                .getDate();

        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Long month = Long.valueOf(localDate.getMonthValue());
        Long year = Long.valueOf(localDate.getYear());

        List<MoviesCount> moviesCountList = previousMonthEntries
                .stream()
                .filter(KeyComponent.distinctByKey(
                        cit -> CurrentlyInTheatersKeyBuilder
                                .aCurrentlyInTheatersKey()
                                .withCountry(cit.getCountry())
                                .withMovie(cit.getMovie())
                                .build()))
                .collect(Collectors.groupingBy(CurrentlyInTheaters::getCountry, Collectors.counting()))
                .entrySet()
                .stream()
                .map(entry -> MoviesCountBuilder
                        .aMoviesCount()
                        .withCountry(entry.getKey())
                        .withYear(year)
                        .withMonth(month)
                        .withNoMovies(entry.getValue())
                        .build())
                .collect(Collectors.toList());

        return moviesCountRepository.saveAll(moviesCountList);

    }

}
