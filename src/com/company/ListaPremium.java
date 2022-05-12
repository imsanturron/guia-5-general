package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListaPremium implements Reproduccion {
    private Scanner scan = new Scanner(System.in);
    private String nombre;
    private final LinkedList<Cancion> miLista = new LinkedList<>();///xq el final?

    public ListaPremium(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reproducir() {
        int i = 0;
        if (!miLista.isEmpty()) {
            for (Cancion cancion : miLista) {
                System.out.println(i + ":" + cancion.nombre);
                i++;
            }
            do {
                System.out.println("que numero de cancion desea escuchar?");
                i = scan.nextInt();
                scan.nextLine();
                if (i > miLista.size() || i < 0)
                    System.out.println("error!");
            } while (i > miLista.size() || i < 0);

            System.out.println("reproduciendo: " + miLista.get(i).nombre + "album: " + miLista.get(i).albumx.titulo
                    + "genero: " + miLista.get(i).genero + "artista: " + miLista.get(i).albumx.artistax.nombre);
            if (miLista.get(i).artistaInvitado != null)
                System.out.println("artista invitado: " + miLista.get(i).artistaInvitado);
        }
    }

    @Override
    public void agregarCancion(Cancion c) {
        miLista.addLast(c);
    }

    @Override
    public void eliminarCancion() {
        int i = 0;
        if (!miLista.isEmpty()) {
            for (Cancion c : miLista) {
                System.out.println(i + ":" + c.nombre);
                i++;
            }
            System.out.println("que numero de cancion desea eliminar?");
            do {
                i = scan.nextInt();
                scan.nextLine();
                if (i > miLista.size() || i < 0)
                    System.out.println("error!");
            } while (i > miLista.size() || i < 0);
            miLista.remove(i);
            System.out.println("cancion removida!");
        }
    }

    @Override
    public void verMiLista() {
        if (!miLista.isEmpty()) {
            for (Cancion c : miLista) {
                System.out.println(c.nombre);
            }
        }
    }

    public void cambiarCancion() {
        reproducir();
    }
}