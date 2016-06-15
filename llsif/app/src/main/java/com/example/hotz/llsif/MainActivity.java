package com.example.hotz.llsif;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper songDb;
    //" SELECT name, attribute, easy,easybondlp FROM LLSIF WHERE attribute = 'Smile' ORDER BY easybondlp DESC;";

    // we define 2 flags, difficulty and attribute

    public int difficulty  = -1;
    public int attribute = - 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"LISTFCEI.TTF");
        TextView myTextview = (TextView)findViewById(R.id.title);
        myTextview.setTypeface(myTypeface);

        Typeface myTypeface2 = Typeface.createFromAsset(getAssets(),"FF Magda Clean Mono OT Regular.ttf");
        TextView myTextview2 = (TextView)findViewById(R.id.cattribute);
        TextView myTextview3 = (TextView)findViewById(R.id.textView3) ;
        myTextview2.setTypeface(myTypeface2);
        myTextview3.setTypeface(myTypeface2);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // This is where we are going to send our query.

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
                    attribute = 0;
                }
            case R.id.pure:
                if (check){
                    // match query where attribute = pure
                    attribute = 1;
                }
            case R.id.smile:
                if (check){
                    // match query where attribute = smile
                    attribute = 2;
                }
        }
    }

    public void onDifficultyButtonClicked (View view){

        boolean check = ((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.easy:
                if (check){
                    difficulty = 0;
                }
            case R.id.medium:
                if (check){
                    difficulty = 1;
                }
            case R.id.hard:
                if (check){
                    difficulty = 2;
                }
            case R.id.expert:
                if (check){
                    difficulty = 3;
                }
        }
    }

    public String query (View view, int difficulty, int attribute){

        String result = null;

        // if by now no difficulty is chosen
        if (difficulty == -1 || attribute == -1){
            // show an error!
            Snackbar.make(view,"No options selected.", Snackbar.LENGTH_SHORT).show();

        }
        // for easy
        if (difficulty == 0){

            if (attribute == 0){
                result = "SELECT name, attribute, easy, easybondlp FROM LLSIF WHERE attribute = 'Cool' ORDER BY easybondlp DESC ";
            }

            if (attribute == 1){
                result = "SELECT name, attribute, easy, easybondlp FROM LLSIF WHERE attribute = 'Pure' ORDER BY easybondlp DESC ";
            }

            if (attribute == 2){
                result = "SELECT name, attribute, easy, easybondlp FROM LLSIF WHERE attribute = 'Smile' ORDER BY easybondlp DESC ";
            }

        }
        // for medium
        if (difficulty == 1){

            if (attribute == 0){
                result = "SELECT name, attribute, medium, mediumbondlp FROM LLSIF WHERE attribute = 'Cool' ORDER BY mediumbondlp DESC ";
            }

            if (attribute == 1){
                result = "SELECT name, attribute, medium, mediumbondlp FROM LLSIF WHERE attribute = 'Pure' ORDER BY mediumbondlp DESC ";
            }

            if (attribute == 2){
                result = "SELECT name, attribute, medium, mediumbondlp FROM LLSIF WHERE attribute = 'Smile' ORDER BY mediumbondlp DESC ";
            }

        }
        // for difficult
        if (difficulty == 2){

            if (attribute == 0){
                result = "SELECT name, attribute, hard, hardbondlp FROM LLSIF WHERE attribute = 'Cool' ORDER BY hardbondlp DESC ";
            }

            if (attribute == 1){
                result = "SELECT name, attribute, hard, hardbondlp FROM LLSIF WHERE attribute = 'Pure' ORDER BY hardbondlp DESC ";
            }

            if (attribute == 2){
                result = "SELECT name, attribute, hard, hardbondlp FROM LLSIF WHERE attribute = 'Smile' ORDER BY hardbondlp DESC ";
            }


        }
        // for 2hard
        if (difficulty == 3){

            if (attribute == 0){
                result = "SELECT name, attribute, expert, expertbondlp FROM LLSIF WHERE attribute = 'Cool' ORDER BY expertbondlp DESC ";
            }

            if (attribute == 1){
                result = "SELECT name, attribute, expert, expertbondlp FROM LLSIF WHERE attribute = 'Pure' ORDER BY expertbondlp DESC ";
            }

            if (attribute == 2){
                result = "SELECT name, attribute, expert, expertbondlp FROM LLSIF WHERE attribute = 'Smile' ORDER BY expertbondlp DESC ";
            }

        }

        return result;
    }

}

