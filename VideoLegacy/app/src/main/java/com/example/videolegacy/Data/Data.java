package com.example.videolegacy.Data;

import com.example.videolegacy.Logica.Movie;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Movie> movieList;
    public Data(){
        movieList = new ArrayList<>();
        this.prepareMovies();
    }
    public void prepareMovies(){
        Movie movie = new Movie("The Avengers", "Action", 2015);
        this.movieList.add(movie);
        Movie movie1 = new Movie("2012", "Fiction", 2012);
        this.movieList.add(movie1);
        Movie movie2 = new Movie("Batman", "Action", 2014);
        this.movieList.add(movie2);
        Movie movie3 = new Movie("The Last of Us", "Fiction", 2018);
        this.movieList.add(movie3);
        Movie movie4 = new Movie("La Llorona", "Terror", 2020);
        this.movieList.add(movie4);
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
    public List<String> getMovieNames(){
        List<String> string_list = new ArrayList<>();
        for (Movie movie: movieList) {
            string_list.add(movie.getTitulo());
        }
        return  string_list;
    }
}
