package com.company;

public interface Reproduccion {
    void reproducir();
    void agregarCancion(Cancion c);
    void eliminarCancion();
    void verMiLista();
    default void hacee(){
        System.out.println("ieieie");
    }
}
