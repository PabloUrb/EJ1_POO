package edu.salle.poo;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Equip {

    private String nom;
    private LocalDate dataFundacio;
    private String localitat;
    private ArrayList<Jugador> jugadores;

    public Equip(String nom, LocalDate dataFundacio, String localitat) {
        this.nom = nom;
        this.dataFundacio = dataFundacio;
        this.localitat = localitat;
    }

    public Equip(String nom, LocalDate dataFundacio, String localitat, ArrayList<Jugador> jugadores) {
        this.nom = nom;
        this.dataFundacio = dataFundacio;
        this.localitat = localitat;
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equip{" +
                "nom='" + nom + '\'' +
                ", dataFundacio=" + dataFundacio +
                ", localitat='" + localitat + '\'' +
                ", jugadores=" + jugadores +
                '}';
    }
}
