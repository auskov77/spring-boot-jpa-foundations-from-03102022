package ru.buttonone.repository;

import ru.buttonone.domain.Genre;

public interface GenreRepository {

    Genre getById(long id);

    void insert(Genre genre);

    void update(Genre genre);

    void deleteById(long id);
}
