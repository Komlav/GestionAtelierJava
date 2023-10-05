package com.komlavi.Entities;

import java.util.ArrayList;

public class ArticleConfection extends AbstractEntity{
    // (Proprieties...
    private int prix;
    private int quantite;

    // Attributs navigationnels
    private Categorie categorie;
    private ArrayList<Unite> unites = new ArrayList<>();

    // Constructeurs
    public ArticleConfection() {
        super();
    }

    /**
     * @param prix
     * @param quantite
     */
    public ArticleConfection(int prix, int quantite) {
        super();
        this.prix = prix;
        this.quantite = quantite;
    }
    /**
     * @param id
     * @param libelle
     * @param prix
     * @param quantite
     */
    public ArticleConfection(int id, String libelle, int prix, int quantite) {
        super(id, libelle);
        this.prix = prix;
        this.quantite = quantite;
    }
    /**
     * @param libelle
     * @param prix
     * @param quantite
     */
    public ArticleConfection(String libelle, int prix, int quantite) {
        super(libelle);
        this.prix = prix;
        this.quantite = quantite;
    }

    // Setters et getters des attributs de navigation
    /**
     * @return the categorie
     */
    public Categorie getCategorie() {
        return categorie;
    }
    
    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    /**
     * @return the unites
     */
    public ArrayList<Unite> getUnites() {
        return unites;
    }

    /**
     * @param unite the unites to set
     */
    public void setUnites(Unite unite) {
        this.unites.add(unite);
    }

    /**
     * @return the prix
     */
    public int getPrix() {
        return prix;
    }
    /**
     * @param prix the prix to set
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }
    /**
     * @return the quantite
     */
    public int getQuantite() {
        return quantite;
    }
    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    @Override
    public String toString() {
        return "ArticleConfection [ " + super.toString() + "Prix = " + prix + " Quantite = " + quantite + " ]";
    }

}
