package ru.buttonone.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.buttonone.domain.Film;
import ru.buttonone.repository.FilmRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService{
    private final FilmRepository filmRepository;

    @Transactional(readOnly = true)
    @Override
    public void printAllFilms() {
        System.out.println("Наши фильмы: ");
        List<Film> films = filmRepository.findAll();
        System.out.println(films.toString());
    }
}
