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
    public int difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // get our query string, remember our difficulty should not be null now!
        String query = getBundle();
        // call dbhelper constructor!
        System.out.println(query);
        openAndQueryDatabase(query, difficulty);

        displayResultList();
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
            db = dbHelper.getReadableDatabase();
            Cursor cursor = db.rawQuery(query,null);

            if (cursor.moveToFirst()){
                do{
                    String name = cursor.getString(cursor.getColumnIndex("name"));
                    String attribute = cursor.getString(cursor.getColumnIndex("attribute"));
                    float pts = -1;
                    float bondlp = -1;
                    System.out.println("We are in the cursor is moving" + " " + name + " " + attribute);
                    // switch statement for choosing right difficulty.
                    switch (difficulty){
                        case 0:
                            System.out.println("In the case0!");
                            pts = cursor.getFloat(cursor.getColumnIndex("easy"));
                            bondlp = cursor.getFloat(cursor.getColumnIndex("easybondlp"));
                            break;
                        case 1: System.out.println("In the case1!");
                            pts = cursor.getFloat(cursor.getColumnIndex("normal"));
                            bondlp = cursor.getFloat(cursor.getColumnIndex("normalbondlp"));
                            break;
                        case 2: System.out.println("In the case2!");
                            pts = cursor.getFloat(cursor.getColumnIndex("hard"));
                            bondlp = cursor.getFloat(cursor.getColumnIndex("hardbondlp"));
                            break;
                        case 3: System.out.println("In the case3!");
                            pts = cursor.getFloat(cursor.getColumnIndex("expert"));
                            bondlp = cursor.getFloat(cursor.getColumnIndex("expertbondlp"));
                            break;
                    }
                    results.add("Title: " + name +", Attribute: " + attribute + ", Pts: "
                            + String.valueOf(pts) + ", maxbondlp: "+ String.valueOf(bondlp));
                } while (cursor.moveToNext());
            }
        }
        catch (SQLiteException se){
            Log.e(getClass().getSimpleName(), "db read err!");
        } finally{
            if (db!=null)
                //db.execSQL("DELETE FROM " + tableName);
                System.out.println("DB IS NOT NULL!");
                db.close();
        }
    }
}
