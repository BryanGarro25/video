package com.example.videolegacy.Logica;

import java.io.Serializable;

public class Movie implements Serializable {
    private String titulo;
    private String genero;
    private int anio;

    public Movie(String titulo, String genero, int anio) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
    }

    public Movie() {
        this.titulo = "";
        this.genero = "";
        this.anio = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anio=" + anio +
                '}';
    }
}
