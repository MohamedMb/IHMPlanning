package org.miage.ihm.database.model;


import java.util.Date;

/**
 * Created by Mohamed on 09/03/14.
 */
public class RendezVous {
    private long id;
    private String titre;
    private String description;
    private Date date;
    
    /**
     * Constructeur de RendezVous
     * @param id
     * @param titre
     * @param description
     * @param date
     */
    public RendezVous(long id, String titre, String description, Date date) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.date = date;
    }
    
    /**
     * Constructeur de RendezVous
     * @param titre
     * @param description
     * @param date
     */
    public RendezVous(String titre, String description, Date date) {
        this.titre = titre;
        this.description = description;
        this.date = date;
    }
    
    //--- getters ---
    public long getId() {return id;}
    public String getTitre() {return titre;}
    public String getDescription() {return description;}
    public Date getDate() {return date;}
    
    //--- setters ---
    public void setId(long id) {this.id = id;}
    public void setTitre(String titre) {this.titre = titre;}
    public void setDescription(String description) {this.description = description;}
    public void setDate(Date date) {this.date = date;}
}
