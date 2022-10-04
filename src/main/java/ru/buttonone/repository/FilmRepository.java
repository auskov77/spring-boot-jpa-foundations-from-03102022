package ru.buttonone.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.buttonone.domain.Film;
import ru.buttonone.domain.Genre;

import java.util.List;
import java.util.Optional;


public interface FilmRepository extends JpaRepository<Film, Long> {
    Optional<Film> findFilmByTitleAndGenre(String title, Genre genre);
}
