package com.komlavi.Entities;

public abstract class AbstractEntity {
    // Properties
    protected int id;
    protected String libelle;
    protected static int nbreEntity;

    // Constructors
    public AbstractEntity() {

    }

    public AbstractEntity(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public AbstractEntity(String libelle) {
        this.id = ++nbreEntity;
        this.libelle = libelle;
    }

    // Setters
    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    // Getters
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public static int getNbreEntity() {
        return nbreEntity;
    }
    
    public static void setNbreEntity(int nbreEntity) {
        AbstractEntity.nbreEntity = nbreEntity;
    }

    public String toString() {
        return "Id : " + this.id + " Libelle : " + this.libelle;
    }

}
