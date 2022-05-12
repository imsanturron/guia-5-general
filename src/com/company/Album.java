package com.company;

public class Album{
    protected String anio;
    protected String titulo;
    protected Artista artistax;

    public Album(String anio, String titulo, Artista artistax) {
        this.anio = anio;
        this.titulo = titulo;
        this.artistax = artistax;
    }

    @Override
    public String toString() {
        return "Album{" +
                "anio='" + anio + '\'' +
                ", titulo='" + titulo + '\'' +
                ", artistax=" + artistax +
                '}';
    }
}
