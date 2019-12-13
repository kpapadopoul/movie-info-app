package com.workable.movieinfoapp.repository;

import com.workable.movieinfoapp.model.CurrentlyInTheaters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentlyInTheatersRepository extends JpaRepository<CurrentlyInTheaters, Long> {
}
