package com.workable.movieinfoapp.controller;

import com.workable.movieinfoapp.model.Review;
import com.workable.movieinfoapp.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @GetMapping("/reviews")
    public Page<Review> getReviews(Pageable pageable) {
        return reviewRepository.findAll(pageable);
    }

}
