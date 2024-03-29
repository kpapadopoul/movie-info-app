package com.workable.movieinfoapp.controller;

import com.workable.movieinfoapp.model.Country;
import com.workable.movieinfoapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private CountryRepository countryRepository;

    @Autowired
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("/countries")
    public Page<Country> getCountries(Pageable pageable) {
        return countryRepository.findAll(pageable);
    }

}
