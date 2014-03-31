package org.miage.ihm.database.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHandler extends SQLiteOpenHelper {
    public static final String COURSE_TABLE_NAME = "course";
    public static final String COURSE_KEY = "id";
    public static final String COURSE_DATE = "date";
    public static final String COURSE_CREATE_TABLE = "CREATE TABLE " + COURSE_TABLE_NAME + "("
            + COURSE_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COURSE_DATE + " DATE NOT NULL" +
            ");";
    public static final String COURSE_TABLE_DROP = "DROP TABLE IF EXISTS " + COURSE_TABLE_NAME + ";";



    public static final String MENU_TABLE_NAME = "menu";
    public static final String MENU_KEY = "id";
    public static final String MENU_DATE = "date";
    public static final String MENU_CREATE_TABLE = "CREATE TABLE " + MENU_TABLE_NAME + "("
            + MENU_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MENU_DATE + " DATE NOT NULL" +
            ");";
    public static final String MENU_TABLE_DROP = "DROP TABLE IF EXISTS " + MENU_TABLE_NAME + ";";

    public static final String PRODUIT_TABLE_NAME = "menu";
    public static final String PRODUIT_KEY = "id";
    public static final String PRODUIT_DATE = "date";
    public static final String PRODUIT_CREATE_TABLE = "CREATE TABLE " + PRODUIT_TABLE_NAME + "("
            + PRODUIT_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PRODUIT_DATE + " DATE NOT NULL" +
            ");";
    public static final String PRODUIT_TABLE_DROP = "DROP TABLE IF EXISTS " + PRODUIT_TABLE_NAME + ";";


    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(COURSE_CREATE_TABLE);
        //db.execSQL(RDV_CREATE_TABLE);
        db.execSQL(MENU_CREATE_TABLE);
        db.execSQL(PRODUIT_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(COURSE_TABLE_DROP);
        //db.execSQL(RDV_TABLE_DROP);
        db.execSQL(MENU_TABLE_DROP);
        db.execSQL(PRODUIT_TABLE_DROP);
        onCreate(db);
    }
}
