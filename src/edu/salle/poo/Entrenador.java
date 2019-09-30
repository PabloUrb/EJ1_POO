package edu.salle.poo;

import java.time.LocalDate;

public class Entrenador extends Persona{

    private LocalDate dataDebut;
    private Integer titolAconsequits;

    public Entrenador(String nom,
                      LocalDate dataNaixement,
                      String nacionalitat,
                      LocalDate dataDebut,
                      Integer titolAconsequits) {
        super(nom, dataNaixement, nacionalitat);
        this.dataDebut = dataDebut;
        this.titolAconsequits = titolAconsequits;
    }

    @Override
    public String toString() {
        String entrenador  =super.toString();
        return "Entrenador{" +
                entrenador +
                "dataDebut=" + dataDebut +
                ", titolAconsequits=" + titolAconsequits +
                '}';
    }
}
