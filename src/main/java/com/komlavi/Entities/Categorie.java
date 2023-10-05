package com.komlavi.Entities;

public class Categorie extends AbstractEntity {
    // Constructeurs par défaut
    public Categorie() {
        super();
    }

    // Constructeurs avec arguments
    public Categorie(int id, String libelle) {
        super(id, libelle);
    }

    @Override
    public String toString() {
        return "Categorie [ "+ super.toString() +" ]";
    }
}