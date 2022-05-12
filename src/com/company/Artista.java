package com.company;

public class Artista {
    protected String nombre;
    protected String edad;
    protected Nacionalidad nacionalidad;

    public Artista(String nombre, String edad, Nacionalidad nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }


    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", nacionalidad=" + nacionalidad +
                '}';
    }
}
