package ru.netology.movies.poster.domain;

public class MoviesPoster {

    private int id;
    private String title;
    private int year;
    private String genre;

    public MoviesPoster() {

    }


    public MoviesPoster(int id, String title, int year, String genre) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
    }


    private MoviesPoster[] movies = new MoviesPoster[0];

    public void save(MoviesPoster movie) {
        MoviesPoster[] tmp = new MoviesPoster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }

        tmp[tmp.length - 1] = movie;
        movies = tmp;


    }


    public MoviesPoster[] findAll() {

        return movies;
    }

    private int resultLength;

    private int limitMovies;


    public int getLimitMovies() {
        return limitMovies;
    }

    public void setLimitMovies(int newLimitMovies) {

        limitMovies = newLimitMovies;
    }


    public MoviesPoster[] findLast() {
        if (movies.length < 10) {
            resultLength = movies.length;
        } else {
            resultLength = 10;
        }

        MoviesPoster[] result = new MoviesPoster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[resultLength - 1 - i];
        }
        return result;

    }


}




