package ru.netology.movies.poster.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MoviesPosterOverLimit {

    MoviesPoster movie = new MoviesPoster();

    MoviesPoster movie1 = new MoviesPoster(100, "Бладшот", 2020, "Боевик");
    MoviesPoster movie2 = new MoviesPoster(101, "Вперед", 2020, "Приключения");
    MoviesPoster movie3 = new MoviesPoster(102, "Отель \"Белград\"", 2020, "Романтическая комедия");
    MoviesPoster movie4 = new MoviesPoster(103, "Джентельмены", 2019, "Боевик");
    MoviesPoster movie5 = new MoviesPoster(104, "Удача", 2022, "Мультфильм");
    MoviesPoster movie6 = new MoviesPoster(105, "Время", 2021, "Ужасы");
    MoviesPoster movie7 = new MoviesPoster(106, "Виновный", 2021, "Триллер");
    MoviesPoster movie8 = new MoviesPoster(107, "Дюна", 2021, "Приключения");
    MoviesPoster movie9 = new MoviesPoster(108, "Веном", 2021, "Боевик");
    MoviesPoster movie10 = new MoviesPoster(109, "Довод", 2020, "Боевик");
    MoviesPoster movie11 = new MoviesPoster(110, "Гнев", 2021, "Боевик");
    MoviesPoster movie12 = new MoviesPoster(111, "1917", 2019, "Драма");


    @BeforeEach
    public void setup() {
        movie.save(movie1);
        movie.save(movie2);
        movie.save(movie3);
        movie.save(movie4);
        movie.save(movie5);
        movie.save(movie6);
        movie.save(movie7);
        movie.save(movie8);
        movie.save(movie9);
        movie.save(movie10);
        movie.save(movie11);
        movie.save(movie12);


    }

    @Test

    public void shouldFindAllMovies() {

        MoviesPoster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11, movie12};
        MoviesPoster[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test

    public void shouldReversMovies() {

        MoviesPoster[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MoviesPoster[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

}
