package Entidades;

import java.util.List;

/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class Juego {

    private List<Jugador> totales;
    private RevolverDeAgua revolver;

    public void llenarJuego(List<Jugador> jugadores, RevolverDeAgua revolver) {
        this.totales = jugadores;
        this.revolver = revolver;

    }

    public void ronda() {
        int jugadorActual = 0;

        while (true) {
            Jugador jugador = totales.get(jugadorActual);
            System.out.println("Jugador # " + (jugadorActual + 1) + " its your turn, shoot");

            if (jugador.disparo(revolver)) {
                System.out.println("jugador # " + jugador + " game over, sorry not sorry");
                break;

            } else {
                System.out.println("jugador # " + jugador + " good game, next");

                jugadorActual = (jugadorActual + 1) % totales.size();           

            }

        }
    }

}
