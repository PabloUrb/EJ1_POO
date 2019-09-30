package edu.salle.poo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Jugador lebronJames = new Jugador("Lebron James",
                LocalDate.of(1984,12,30),
                "United States",
                203,
                100.0f,
                "Base");

        Entrenador entrenador = new Entrenador("Juan",
                LocalDate.now(),
                "Españita",
                LocalDate.now(),
                80
                );

    }


}
