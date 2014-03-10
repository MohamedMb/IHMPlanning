package org.miage.ihm.database;

import java.util.Date;

import android.content.Context;

/**
 * Created by Mohamed on 09/03/14.
 */
public class RdvvDAO extends DAOBase {
    public static final String TABLE_NAME = "rdv";
    public static final String KEY = "id_rdv";
    public static final String TITLE = "titre";
    public static final String DESCRIPTION = "description";
    public static final String DATE = "date_rdv";
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + TITLE + " VARCHAR(128) NOT NULL, "
            + DESCRIPTION + " TEXT NOT NULL, "
            + DATE + " DATE NOT NULL" +
            ");";

    public static final String RDV_TABLE_DROP = "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    public RdvvDAO(Context c) {
        super(c);
    }
    public void add(Rdv r) {


    }

    public void delete(long id) {

    }

    public void update(Rdv r) {

    }

    public Rdv get(long id) {
        //temporaire pour pas d'erreur
        return new Rdv(1, "titre", "description", new Date());
    }
}
