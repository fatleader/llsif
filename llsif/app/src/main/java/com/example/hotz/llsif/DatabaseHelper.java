package com.example.hotz.llsif;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hotz on 2016-05-11.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public final static String DATABASE_NAME = "songs.db";
    public final static String TABLE_NAME = "SONG_TABLE";
    public final static String COL_1 = "ID";
    public final static String COL_2 = "TITLE";
    public final static String COL_3 = "ATTR";
    public final static String COL_4 = "BAFC";
    public final static String COL_5 = "BONDLP";


    // call this for database!
    public DatabaseHelper(Context context) {
        super (context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // create table!
        db.execSQL("CREATE TABLE "+ TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT, ATTR TEXT, BAFC REAL, BONDLP REAL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST" + TABLE_NAME);
        onCreate(db);
    }
}
