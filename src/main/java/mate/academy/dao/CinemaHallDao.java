package mate.academy.dao;

import mate.academy.model.CinemaHall;
import mate.academy.model.Movie;

import java.util.List;
import java.util.Optional;

public interface CinemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}