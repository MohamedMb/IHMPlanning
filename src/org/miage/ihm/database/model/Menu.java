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
        this.produits = produits;
    }
    
    public Menu(String titre, String description, Date date, ArrayList<Produit> produits) {
        this.titre = titre;
        this.description = description;
        this.date = date;
        this.produits = produits;
    }

    //--- getters ---
    public long getId() {return id;}
    public String getTitre() {return titre;}
    public String getDescription() {return description;}
    public Date getDate() {return date;}
    public ArrayList<Produit> getProduits() {return produits;}
    
    //--- setters ---
    public void setId(long id) {this.id = id;}
    public void setTitre(String titre) {this.titre = titre;}
    public void setDescription(String description) {this.description = description;}
    public void setDate(Date date) {this.date = date;}
    public void setProduits(ArrayList<Produit> produits) {this.produits = produits;}

    /**
     * Ajout d'un nouveau produit dans le menu.
     * @param produit Produit à ajouter dans le menu.
     * @return
     */
    public boolean addProduit(Produit produit) {
    	return produits.add(produit);
    }

    /**
     * Suppression d'un produit.
     * @param position
     * @return
     */
    public Produit deleteProduit(int position) {
    	return this.produits.remove(position);
    }
}
