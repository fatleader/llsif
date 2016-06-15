package com.example.hotz.llsif;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ResultActivity extends AppCompatActivity {


    DatabaseHelper songDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // call dbhelper constructor!

        String query = getQuery();



        songDb = new DatabaseHelper(this);


    }

    public String getQuery (){

        Bundle p = getIntent().getExtras();
        String query = p.getString("query");

        return query;

    }

}
