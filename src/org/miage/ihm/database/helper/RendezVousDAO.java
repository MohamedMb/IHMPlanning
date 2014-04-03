package org.miage.ihm.database.helper;

import java.util.Date;

import org.miage.ihm.database.model.RendezVous;

import android.content.Context;

/**
 * Created by Mohamed on 09/03/14.
 */
public class RendezVousDAO extends DAOBase {
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

    public RendezVousDAO(Context c) {
        super(c);
    }
    public void add(RendezVous r) {

    }

    public void delete(long id) {

    }

    public void update(RendezVous r) {

    }

    public RendezVous get(long id) {
        //temporaire pour pas d'erreur
        return new RendezVous(1, "titre", "description", new Date());
    }
}
