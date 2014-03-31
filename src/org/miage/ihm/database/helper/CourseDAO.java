package org.miage.ihm.database.helper;

import org.miage.ihm.database.model.Produit;

import android.content.Context;

/**
 * Created by Mohamed on 09/03/14.
 */
public class CourseDAO extends DAOBase {
    public static final String TABLE_NAME = "produit";
    public static final String KEY = "id_produit";
    public static final String TITLE = "libelle";
    public static final String DESCRIPTION = "description";
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + TITLE + " VARCHAR(128) NOT NULL, "
            + DESCRIPTION + " TEXT NOT NULL"
            + ");";
    public static final String RDV_TABLE_DROP = "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    public CourseDAO(Context c) {
        super(c);
    }
    public void add(Produit p) {

    }

    public void delete(long id) {

    }

    public void update(Produit p) {

    }

    public Produit get(long id) {
        //temporaire pour pas d'erreur
        return new Produit(1, "titre", "description");
    }
}
