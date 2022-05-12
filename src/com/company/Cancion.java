package com.company;

public class Cancion{
    protected String nombre;
    protected String duracion;
    protected Genero genero;///ROCK, TRAP, JAZZ,HIP HOP, POP, METAL y CLASICA
    protected Album albumx;
    protected Artista artistaInvitado;

    public Cancion(String nombre, String duracion, Genero genero, Album albumx, Artista artistaInvitado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.albumx = albumx;
        this.artistaInvitado = artistaInvitado;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracion='" + duracion + '\'' +
                ", genero=" + genero +
                ", albumx=" + albumx +
                ", artistaInvitado=" + artistaInvitado +
                '}';
    }
}
