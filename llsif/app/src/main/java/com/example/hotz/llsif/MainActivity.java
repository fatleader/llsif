package com.example.hotz.llsif;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper songDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // call dbhelper constructor!
        songDb = new DatabaseHelper(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ResultActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate th e menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onAttributeButtonClicked (View view){
        // is button checked?
        boolean check = ((RadioButton) view).isChecked();
        String query;
        switch(view.getId()){
            case R.id.cool:
                if (check) {
                    // match query where attribute = cool
                }
            case R.id.pure:
                if (check){
                    // match query where attribute = pure
                }
            case R.id.smile:
                if (check){
                    // match query where attribute = smile
                }
        }
    }

    public void onDifficultyButtonClicked (View view){

        boolean check = ((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.easy:
                if (check){

                }
            case R.id.medium:
                if (check){

                }
            case R.id.hard:
                if (check){

                }
            case R.id.expert:
                if (check){

                }
        }
    }

    public void query (View view){


        //Intent intent = new Intent(this, ResultActivity.class);

    }

}

