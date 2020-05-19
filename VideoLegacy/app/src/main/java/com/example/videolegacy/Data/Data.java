package com.example.videolegacy.Data;

import com.example.videolegacy.Logica.Movie;
import com.example.videolegacy.Logica.Serie;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Movie> movieList;
    private List<Serie> horrorSeries;

    public Data(){
        movieList = new ArrayList<>();
        horrorSeries = new ArrayList<>();
        this.prepareMovies();
        this.prepareHorrorSeries();


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
    public void prepareHorrorSeries(){
        Serie serie = new Serie("American Horror Story", "Historias de terror", 2011);
        this.horrorSeries.add(serie);
         serie = new Serie("hill house", "La historia de una maldicion", 2018);
        this.horrorSeries.add(serie);
         serie = new Serie("Stranger Things", "Sucesos paranormales", 2016);
        this.horrorSeries.add(serie);
         serie = new Serie("Marianne", "La bruja maldita", 2019);
        this.horrorSeries.add(serie);
         serie = new Serie("Slasher", "El espiritu asesino", 2016);
        this.horrorSeries.add(serie);
        serie = new Serie("Haunted", "Historia de un asesino que caza a sus presas", 2018);
        this.horrorSeries.add(serie);
        serie = new Serie("Kingdom", "Fantasmas asesinos", 2017);
        this.horrorSeries.add(serie);
        serie = new Serie("Supernatural", "Eventos inexplicables", 2005);
        this.horrorSeries.add(serie);
        serie = new Serie("Chambers", "Camaras de tortura", 2019);
        this.horrorSeries.add(serie);
        serie = new Serie("iZombie", "apocalipsis zombie", 2015);
        this.horrorSeries.add(serie);
        serie = new Serie("Dracula", "El vampiro", 2016);
        this.horrorSeries.add(serie);
        serie = new Serie("True blood", "Vampiros sofisticados y  mafiosos", 2016);
        this.horrorSeries.add(serie);
        serie = new Serie("outcast", "la Maldicion", 2016);
        this.horrorSeries.add(serie);
        serie = new Serie("Hannibal", "El come hombres", 2016);
        this.horrorSeries.add(serie);
        serie = new Serie("Fear itself", "miedo a tus propios demonios", 2016);
        this.horrorSeries.add(serie);

    }
    public String[] horrorSeriesToArray(){
        ArrayList<String> horrorSeriesArray = new ArrayList<>();

        for (Serie serie:this.horrorSeries) {
            horrorSeriesArray.add(serie.getTitulo());
        }
        String[] simpleArray = new String[ horrorSeriesArray.size() ];
        horrorSeriesArray.toArray( simpleArray );
        return simpleArray;
    }
    public Serie getSerieByTitulo(String titulo){
        for (Serie serie:this.horrorSeries) {
            if(serie.getTitulo().equals(titulo))
                return serie;
        }
        return null;
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
