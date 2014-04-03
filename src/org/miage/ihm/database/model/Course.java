package org.miage.ihm.database.model;

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

    /**
     * Constructeur de Course.
     * @param id
     * @param libelle
     * @param description
     * @param produits
     * @param date
     */
    public Course(long id, String libelle, String description, ArrayList<Produit> produits, Date date) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.date = date;
        this.produits = new ArrayList<Produit>(produits);
    }

    //--- getters ---
    public long getId() {return id;}
    public String getLibelle() {return libelle;}
    public String getDescription() {return description;}
    public ArrayList<Produit> getProduits() {return produits;}
    
    //--- setters ---
    public void setId(long id) {this.id = id;}
    public void setLibelle(String libelle) {this.libelle = libelle;}
    public void setDescription(String description) {this.description = description;}
    public void setProduits(ArrayList<Produit> produits) {this.produits = produits;}
    
    /**
     * Ajout d'un nouveau produit dans la liste de produits.
     * @param produit Produit à ajouter dans la liste de produits.
     * @return
     */
    public boolean addProduit(Produit produit) {
        if (this.produits.add(produit)) {
            return true;
        }
        return false;
    }
    
    /**
     * Suppression d'un produit dans la liste de courses.
     * @param position
     * @return
     */
    public Produit deleteProduit(int position) {
        return this.produits.remove(position);
    }
}
