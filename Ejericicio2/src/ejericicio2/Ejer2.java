package ejericicio2;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de jugadores");
        int num = leer.nextInt();

        if (num < 1 || num > 6) {
            System.out.println("Jugarán 6 jugadores");
            num = 6;
        }

        ArrayList<Jugador> jugadores = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            jugadores.add(new Jugador(i));

        }

        RevolverDeAgua servr = new RevolverDeAgua();

        servr.llenarRevolver();

        Juego servj = new Juego();
        servj.llenarJuego(jugadores, servr);

        servj.ronda();

    }

}
