package org.miage.ihm.database;


import java.util.Date;

/**
 * Created by Mohamed on 09/03/14.
 */
public class RendezVous {
    private long id;
    private String titre;
    private String description;
    private Date date;

    public RendezVous(long id, String titre, String description, Date date) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.date = date;
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
}
