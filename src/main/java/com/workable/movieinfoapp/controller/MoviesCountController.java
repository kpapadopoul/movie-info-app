package com.workable.movieinfoapp.controller;

import com.workable.movieinfoapp.model.Movie;
import com.workable.movieinfoapp.model.MoviesCount;
import com.workable.movieinfoapp.repository.MoviesCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MoviesCountController {

    private MoviesCountRepository moviesCountRepository;

    @Autowired
    public MoviesCountController(MoviesCountRepository moviesCountRepository) {
        this.moviesCountRepository = moviesCountRepository;
    }

    @GetMapping("/moviesCount")
    public Page<MoviesCount> getMoviesCount(Pageable pageable) {
        return moviesCountRepository.findAll(pageable);
    }

    @PostMapping("/moviesCount")
    public MoviesCount createMoviesCount(@Valid @RequestBody MoviesCount moviesCount) {
        return moviesCountRepository.save(moviesCount);
    }

}
