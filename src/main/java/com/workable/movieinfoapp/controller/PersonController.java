package com.workable.movieinfoapp.controller;

import com.workable.movieinfoapp.model.Movie;
import com.workable.movieinfoapp.model.Person;
import com.workable.movieinfoapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/people")
    public Page<Person> getPeople(Pageable pageable) {
        return personRepository.findAll(pageable);
    }

}
