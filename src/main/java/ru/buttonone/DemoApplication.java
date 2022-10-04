package ru.buttonone;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import ru.buttonone.domain.Genre;
import ru.buttonone.repository.FilmRepository;
import ru.buttonone.repository.GenreRepository;
import ru.buttonone.service.FilmService;
import ru.buttonone.service.GenreService;

import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(DemoApplication.class, args);
		FilmService filmService = context.getBean(FilmService.class);
		filmService.printAllFilms();

		GenreService genreService = context.getBean(GenreService.class);
		genreService.changeGenre("fantasy", "comedy");
		genreService.printGenre("comedy");

	}

}
