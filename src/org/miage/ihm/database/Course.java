package org.miage.ihm.database;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Mohamed on 09/03/14.
 */
public class Course {
    private long id;
    private String libelle;
    private String description;
    private Date date;
    private ArrayList<Produit> produits;

    public Course(long id, String libelle, String description, ArrayList<Produit> produits, Date date) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.date = date;
        this.produits = new ArrayList<Produit>(produits);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }

    public boolean addProduit(Produit produit) {
        if (this.produits.add(produit)) {
            return true;
        }
        return false;
    }

    public Produit deleteProduit(int position) {
        return this.produits.remove(position);
    }
}
