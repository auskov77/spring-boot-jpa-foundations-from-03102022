package ru.buttonone.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.buttonone.domain.Film;

import java.util.List;

public interface FilmRepository {

    List<Film> findAll();
}
