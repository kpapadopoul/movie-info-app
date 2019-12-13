package com.workable.movieinfoapp.repository;

import com.workable.movieinfoapp.model.MoviesCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesCountRepository extends JpaRepository<MoviesCount, Long> {
}
