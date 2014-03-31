package org.miage.ihm.database.model;

import java.util.ArrayList;
import java.util.Date;


public class Menu {
    private long id;
    private String titre;
    private String description;
    private Date date;
    private ArrayList<Produit> produits;

    public Menu(long id, String titre, String description, Date date, ArrayList<Produit> produits) {
        this.id = id;
        this.titre = titre;
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

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }

    public boolean addProduit(Produit produit) {
        return produits.add(produit);
    }

    public Produit deleteProduit(int position) {
        return this.produits.remove(position);
    }
}
