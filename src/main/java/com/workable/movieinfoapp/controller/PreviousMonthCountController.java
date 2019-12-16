package com.workable.movieinfoapp.controller;

import com.workable.movieinfoapp.model.MoviesCount;
import com.workable.movieinfoapp.service.PreviousMonthCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PreviousMonthCountController {

    private PreviousMonthCountService previousMonthCountService;

    @Autowired
    public PreviousMonthCountController(PreviousMonthCountService previousMonthCountService) {
        this.previousMonthCountService = previousMonthCountService;
    }

    @GetMapping("/previous-month-count")
    public List<MoviesCount> getPreviousMonthCount() {
        return previousMonthCountService.getPreviousMonthCount();
    }

}
