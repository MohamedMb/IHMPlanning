package org.miage.ihm.database.model;

/**
 * Created by Mohamed on 09/03/14.
 */
public class Produit {
    private long id;
    private String libelle;
    private String description;

    /**
     * Constructeur de produit.
     * @param id
     * @param libelle
     * @param description
     */
    public Produit(long id, String libelle, String description) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
    }

    //--- getters ---
    public long getId() {return id;}
    public String getLibelle() {return libelle;}
    public String getDescription() {return description;}
    
    //--- setters ---
    public void setId(long id) {this.id = id;}
    public void setLibelle(String libelle) {this.libelle = libelle;}
    public void setDescription(String description) {this.description = description;}    
}
