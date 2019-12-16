package com.workable.movieinfoapp.service;

import com.workable.movieinfoapp.model.CurrentlyInTheaters;

import java.util.List;

public interface CurrentlyInTheatersService {
    List<CurrentlyInTheaters> findPreviousMonthEntries();
}
