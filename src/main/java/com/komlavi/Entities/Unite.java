package com.komlavi.Entities;

public class Unite extends AbstractEntity{
    // COnstructeurs par défaut
    public Unite() {
        super();
    }
    
    // Construteur avec arguements...
    public Unite(String libelle) {
        super(libelle);
    }
    
    @Override
    public String toString() {
        return "Unite [ " + super.toString() + " ]";
    }
    
}
