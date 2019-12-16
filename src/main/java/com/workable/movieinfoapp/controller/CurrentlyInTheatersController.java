package com.workable.movieinfoapp.controller;

import com.workable.movieinfoapp.model.CurrentlyInTheaters;
import com.workable.movieinfoapp.repository.CurrentlyInTheatersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentlyInTheatersController {

    private CurrentlyInTheatersRepository currentlyInTheatersRepository;

    @Autowired
    public CurrentlyInTheatersController(CurrentlyInTheatersRepository currentlyInTheatersRepository) {
        this.currentlyInTheatersRepository = currentlyInTheatersRepository;
    }

    @GetMapping("/currently-in-theaters")
    public Page<CurrentlyInTheaters> getCurrentlyInTheaters(Pageable pageable) {
        return currentlyInTheatersRepository.findAll(pageable);
    }

}
