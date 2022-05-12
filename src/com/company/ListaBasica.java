package com.company;

import java.util.Stack;

public class ListaBasica implements Reproduccion {
    private String nombre;
    private final Stack<Cancion> miLista = new Stack<>();
    private final Stack<Cancion> miListaaux = new Stack<>();


    public ListaBasica(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reproducir() {
        if (!miLista.empty()) {
            System.out.println("reproduciendo: " + miLista.peek().nombre + "album: " + miLista.peek().albumx.titulo
                    + "genero: " + miLista.peek().genero + "artista: " + miLista.peek().albumx.artistax.nombre);
            if (miLista.peek().artistaInvitado != null)
                System.out.println("artista invitado: " + miLista.peek().artistaInvitado);

            Cancion auxi = miLista.pop();
            while (!miLista.empty())
                miListaaux.push(miLista.pop());

            miListaaux.push(auxi);

            while (!miListaaux.empty())
                miLista.push(miListaaux.pop());
        } else
            System.out.println("toavia no tiene canciones. Añadalas!");
    }

    @Override
    public void agregarCancion(Cancion c) {
        miLista.push(c);
    }

    @Override
    public void verMiLista() {
        while (!miLista.empty()) {
            System.out.println("cancion: " + miLista.peek().nombre);
            miListaaux.push(miLista.pop());
        }
        while (!miListaaux.empty())
            miLista.push(miListaaux.pop());
    }

    public void cambiarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void eliminarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }
}
