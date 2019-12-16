package com.workable.movieinfoapp.service;

import com.workable.movieinfoapp.model.MoviesCount;

import java.util.List;

public interface PreviousMonthCountService {
    List<MoviesCount> getPreviousMonthCount();
}
