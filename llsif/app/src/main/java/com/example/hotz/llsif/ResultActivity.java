package com.example.hotz.llsif;

import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

/**
 * @author Alena Calma
 * @version 1.2
 */

public class ResultActivity extends ListActivity{

    private ArrayList<String> results = new ArrayList<String>();
    private String tableName = DatabaseHelper.TABLE_NAME;
    private SQLiteDatabase db;
    private int difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // get our query string, remember our difficulty should not be null now!
        String query = getBundle();
        // call dbhelper constructor!
        openAndQueryDatabase(query, difficulty);


    }

    public String getBundle(){

        Bundle bundle = getIntent().getExtras();
        String query = bundle.getString("query");
        difficulty = bundle.getInt("difficulty");

        return query;

    }

    private void displayResultList(){

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, results));
        getListView().setTextFilterEnabled(true);

    }

    private void openAndQueryDatabase(String query, int difficulty){

        try{

            DatabaseHelper dbHelper = new DatabaseHelper(this.getApplicationContext());
            db = dbHelper.getWritableDatabase();
            Cursor cursor = db.rawQuery(query,null);

            if (cursor != null){
                if (cursor.moveToFirst()){
                    do{
                        String name = cursor.getString(cursor.getColumnIndex("name"));
                        String attribute = cursor.getString(cursor.getColumnIndex("attribute"));
                        int pts = -1;
                        int bondlp = -1;
                        // switch statement for choosing right difficulty.
                        switch (difficulty){
                            case 0: pts = cursor.getInt(cursor.getColumnIndex("easy"));
                                    bondlp = cursor.getInt(cursor.getColumnIndex("easybondlp"));
                            case 1: pts = cursor.getInt(cursor.getColumnIndex("medium"));
                                    bondlp = cursor.getInt(cursor.getColumnIndex("mediumbondlp"));
                            case 2: pts = cursor.getInt(cursor.getColumnIndex("hard"));
                                    bondlp = cursor.getInt(cursor.getColumnIndex("hardbondlp"));
                            case 3: pts = cursor.getInt(cursor.getColumnIndex("expert"));
                                    bondlp = cursor.getInt(cursor.getColumnIndex("expertbondlp"));
                        }
                        results.add("Title: " + name +", Attribute: " + attribute + ", Pts: "
                                + String.valueOf(pts) + ", maxbondlp: "+ String.valueOf(bondlp));
                    } while (cursor.moveToNext());
                }
            }
        }
        catch (SQLiteException se){
            Log.e(getClass().getSimpleName(), "db read err!");
        } finally{
            if (db!=null)
                db.execSQL("DELETE FROM " + tableName);
            db.close();
        }
    }
}
