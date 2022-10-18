package ru.netology.movies.poster.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesPosterEmpty {

    MoviesPoster movie = new MoviesPoster();

    MoviesPoster movie1 = new MoviesPoster(100, "Бладшот", 2020, "Боевик");

    @Test

    public void shouldCreateEmptyMoviesPoster() {

        movie.setLimitMovies(0);

        Assertions.assertEquals(0, movie.getLimitMovies());


    }

    @Test

    public void shouldSaveFirstMovie() {

        movie.save(movie1);
        MoviesPoster[] expected = {movie1};
        MoviesPoster[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }


}
