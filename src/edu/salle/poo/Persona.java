package edu.salle.poo;

import java.time.LocalDate;

public abstract class Persona {

    private String nom;
    private LocalDate dataNaixement;
    private String nacionalitat;

    public Persona(String nom, LocalDate dataNaixement, String nacionalitat) {
        this.nom = nom;
        this.dataNaixement = dataNaixement;
        this.nacionalitat = nacionalitat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", dataNaixement=" + dataNaixement +
                ", nacionalitat='" + nacionalitat + '\'' +
                '}';
    }
}
