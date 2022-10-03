package ru.buttonone;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import ru.buttonone.domain.Genre;
import ru.buttonone.repository.FilmRepository;
import ru.buttonone.repository.GenreRepository;

import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		GenreRepository genreRepository = context.getBean(GenreRepository.class);

		System.out.println("genreRepository.getById(1L) = " + genreRepository.getById(1L));
		Genre westernGenre = new Genre(0L, "western");

		genreRepository.insert(westernGenre);
		System.out.println("genreRepository.getById(3L) = " + genreRepository.getById(3L));

		Genre westernGenre2 = genreRepository.getById(3L);
		westernGenre2.setName("WESTERN");
		genreRepository.update(westernGenre2);
		System.out.println("genreRepository.getById(3L) = " + genreRepository.getById(3L));

		genreRepository.deleteById(3L);
		System.out.println("genreRepository.getById(3L) = " + genreRepository.getById(3L));

		FilmRepository filmRepository = context.getBean(FilmRepository.class);

		System.out.println("filmRepository.findAll() = " + filmRepository.findAll());

//		Console.main(args);

	}

}
