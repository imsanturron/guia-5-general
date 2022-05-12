package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Cancion> canciones = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ListaBasica basica = new ListaBasica("lista reprod");
        ListaPremium premium = new ListaPremium("lista reprod premium");

        Artista artista1 = new Artista("Bob Dylan", "80", Nacionalidad.USA);
        Album album1 = new Album("1965", "Highway 61 revisited", artista1);
        Cancion cancion1 = new Cancion("Like a Rolling Stone", "323", Genero.ROCK, album1, null);
        canciones.add(cancion1);
        Artista artista2 = new Artista("The Rolling Stones", "76", Nacionalidad.INGLATERRA);
        Album album2 = new Album("1969", "Let it bleed", artista2);
        Cancion cancion2 = new Cancion("Gimme shelter", "250", Genero.ROCK, album2, null);
        canciones.add(cancion2);
        Artista artista3 = new Artista("Queen", "x", Nacionalidad.INGLATERRA);
        Album album3 = new Album("1975", "A night at the opera", artista3);
        Cancion cancion3 = new Cancion("Bohemian rhapsody", "402", Genero.ROCK, album3, null);
        canciones.add(cancion3);
        Artista artista4 = new Artista("Bob Marley", "x", Nacionalidad.JAMAICA);
        Artista artista41 = new Artista("The wailers", "x", Nacionalidad.JAMAICA);
        Album album4 = new Album("1980", "Uprising", artista4);
        Cancion cancion4 = new Cancion("Redemption song", "168", Genero.HIPHOP, album4, artista41);
        canciones.add(cancion4);
        Artista artista5 = new Artista("Michael Jackson", "x", Nacionalidad.USA);
        Album album5 = new Album("1982", "Thriller", artista5);
        Cancion cancion5 = new Cancion("Billie Jean", "194", Genero.POP, album5, null);
        canciones.add(cancion5);
        Artista artista6 = new Artista("Led Zeppelin", "x", Nacionalidad.INGLATERRA);
        Album album6 = new Album("1972", "Led zeppelin IV", artista6);
        Cancion cancion6 = new Cancion("Stairway to heaven", "608", Genero.ROCK, album6, null);
        canciones.add(cancion6);
        Artista artista7 = new Artista("Iron Maiden", "x", Nacionalidad.INGLATERRA);
        Album album7 = new Album("1982", "The number of the beast", artista7);
        Cancion cancion7 = new Cancion("The number of the beast", "256", Genero.METAL, album7, null);
        canciones.add(cancion7);
        Artista artista8 = new Artista("Dr Dre", "52", Nacionalidad.USA);
        Artista artista81 = new Artista("Snoop Dog", "58", Nacionalidad.USA);
        Album album8 = new Album("1992", "Nuthin but a g thang", artista8);
        Cancion cancion8 = new Cancion("Nuthin but a g", "197", Genero.TRAP, album8, artista81);
        canciones.add(cancion8);

        int i;
        do {
            System.out.println("Hola! Bienvenido a tu lista de reproduccion, usted desea:" +
                    "0:Salir    1:Reproducir cancion   2:Añadir cancion    3:Elminar cancion   4:Cambiar cancion    5:Ver lista");
            i = scan.nextInt();
            scan.nextLine();
            switch (i) {
                case 0 -> System.out.println("Hasta pronto!");
                case 1 -> basica.reproducir();
                case 2 -> basica.agregarCancion(cancion2);
                case 3 -> basica.eliminarCancion();
                case 4 -> basica.cambiarCancion();
                case 5 -> basica.verMiLista();
                default -> System.out.println("error!");
            }
        } while (i != 0);
    }
}
