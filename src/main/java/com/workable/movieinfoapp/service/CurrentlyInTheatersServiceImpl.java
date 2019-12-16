package com.workable.movieinfoapp.service;

import com.workable.movieinfoapp.model.CurrentlyInTheaters;
import com.workable.movieinfoapp.model.CurrentlyInTheatersBuilder;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CurrentlyInTheatersServiceImpl implements CurrentlyInTheatersService {

    private static String SELECT_LAST_MONTH_ENTRIES =
            "SELECT *\n" +
            "FROM currently_in_theaters \n" +
            "WHERE currently_in_theaters.date >= date_trunc('month', current_date - interval '1' month)\n" +
            "AND currently_in_theaters.date < date_trunc('month', current_date)";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CurrentlyInTheaters> findPreviousMonthEntries() {

        Session session = entityManager.unwrap(Session.class);
        SQLQuery query = session.createSQLQuery(SELECT_LAST_MONTH_ENTRIES);
        List<Object[]> rows = query.list();

        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);

        return rows
                .stream()
                .map(row -> {
                    try {
                        return CurrentlyInTheatersBuilder
                                .aCurrentlyInTheaters()
                                .withId(Long.valueOf(row[0].toString()))
                                .withCountry(Long.valueOf(row[1].toString()))
                                .withMovie(Long.valueOf(row[2].toString()))
                                .withDate(format.parse(row[3].toString()))
                                .build();
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toList());

    }

}
