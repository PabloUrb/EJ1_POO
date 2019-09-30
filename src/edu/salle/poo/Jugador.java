package edu.salle.poo;

import java.time.LocalDate;

public class Jugador extends Persona {

    private Integer altura;
    private Float pes;
    private String posicio;
    private Equip equip;

    public Jugador(String nom,
                   LocalDate dataNaixement,
                   String nacionalitat,
                   Integer altura,
                   Float pes,
                   String posicio,Equip equip) {
        super(nom, dataNaixement, nacionalitat);
        this.altura = altura;
        this.pes = pes;
        this.posicio = posicio;
        this.equip = equip;
    }

    @Override
    public String toString() {
        String jugador = super.toString();
        return "Jugador{" +
                jugador +
                "altura=" + altura +
                ", pes=" + pes +
                ", posicio='" + posicio + '\'' +
                ", equip=" + equip +
                '}';
    }
}
