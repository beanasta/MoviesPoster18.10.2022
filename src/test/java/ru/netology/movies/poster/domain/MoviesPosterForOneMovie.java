package ru.netology.movies.poster.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoviesPosterForOneMovie {

    MoviesPoster movie = new MoviesPoster();
    MoviesPoster movie1 = new MoviesPoster(100, "Бладшот", 2020, "Боевик");

    @BeforeEach
    public void setup() {
        movie.save(movie1);


    }

    @Test

    public void shouldSaveOneMovie() {
        MoviesPoster[] expected = {movie1};
        MoviesPoster[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }


    @Test

    public void shouldReversMovies() {

        MoviesPoster[] expected = {movie1};
        MoviesPoster[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

}
