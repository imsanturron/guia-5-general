package com.company;

import java.util.Stack;

public class ListaBasica implements Reproduccion {
    private String nombre;
    private final Stack<Cancion> miLista = new Stack<>(); ///asi stack?   xq tiral em may be final
    //private Stack<Cancion> Stackaux = new Stack<>();
    //private List<Cancion> miLista = new Stack<>();

    public ListaBasica(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void reproducir() {
        if (!miLista.empty()) {
            System.out.println("reproduciendo: " + miLista.peek().nombre + "album: " + miLista.peek().albumx.titulo
                    + "genero: " + miLista.peek().genero + "artista: " + miLista.peek().albumx.artistax.nombre);
            if (miLista.peek().artistaInvitado != null)
                System.out.println("artista invitado: " + miLista.peek().artistaInvitado);
        }
        ///y enviar al final
    }

    @Override
    public void agregarCancion(Cancion c) {
        miLista.push(c);
    }

    @Override
    public void verMiLista() {
        int i = miLista.size();
        while (i > 0) {
            System.out.println(miLista.size());//eso no es nada/como hago, stack aux o que??
        }
    }

    public void cambiarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void eliminarCancion() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }
}
