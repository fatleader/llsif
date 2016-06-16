package com.example.hotz.llsif;

import android.content.Context;
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
import android.widget.Toast;

/**
 * @author Alena Calma
 * @version 1.2
 */

public class MainActivity extends AppCompatActivity {

    DatabaseHelper songDb;

    public int difficulty = -1;
    public int attribute = -1;
    public String result = null;

    // we define 2 flags, difficulty and attribute

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"LISTFCEI.TTF");
        TextView myTextview = (TextView)findViewById(R.id.title);
        myTextview.setTypeface(myTypeface);

        Typeface myTypeface2 = Typeface.createFromAsset(getAssets(),"FF Magda Clean Mono OT Regular.ttf");
        TextView myTextview2 = (TextView)findViewById(R.id.cattribute);
        TextView myTextview3 = (TextView)findViewById(R.id.textView3) ;
        myTextview2.setTypeface(myTypeface2);
        myTextview3.setTypeface(myTypeface2);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // initialize difficulty


                if (difficulty != -1 && attribute != -1){
                    // This is where we are going to send our query.
                    Bundle packet = new Bundle();
                    result = selectQuery(v, difficulty, attribute);
                    packet.putString("query", result);
                    packet.putInt("difficulty", difficulty);
                    Intent i = new Intent(MainActivity.this, ResultActivity.class);
                    i.putExtras(packet);
                    //startActivity(i);



                    //Context context = getApplicationContext();

                    //Toast toast = Toast.makeText(context, result, Toast.LENGTH_LONG);
                    //toast.show();

                } else{
                    // do nothing.
                }
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
        switch(view.getId()){
            case R.id.cool:
                if (check) {
                    // match query where attribute = cool
                    attribute= 0;
                    break;
                }
            case R.id.pure:
                if (check){
                    // match query where attribute = pure
                    attribute = 1;
                    break;
                }
            case R.id.smile:
                if (check){
                    // match query where attribute = smile
                    attribute = 2;
                    break;
                }
        }
    }

    public void onDifficultyButtonClicked (View view){

        boolean check = ((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.easy:
                if (check){
                    difficulty = 0;
                    break;
                }
            case R.id.medium:
                if (check){
                    difficulty = 1;
                    break;
                }
            case R.id.hard:
                if (check){
                    difficulty = 2;
                    break;
                }
            case R.id.expert:
                if (check){
                    difficulty = 3;
                    break;
                }
        }
    }

    public String selectQuery (View view, int difficulty, int attribute){

        String selected = null;

        // if by now no difficulty is chosen
        if (difficulty == -1 || attribute == -1){
            // show an error!
            Context context = getApplicationContext();

            Toast toast = Toast.makeText(context, "None selected!", Toast.LENGTH_SHORT);
            toast.show();

        }
        // for easy
        if (difficulty == 0){

            if (attribute == 0){
                selected = "SELECT _id, name, attribute, easy, easybondlp FROM LLSIF WHERE attribute = 'Cool'";
            }

            if (attribute == 1){
                selected = "SELECT _id, name, attribute, easy, easybondlp FROM LLSIF WHERE attribute = 'Pure'";
            }

            if (attribute == 2){
                selected = "SELECT _id, name, attribute, easy, easybondlp FROM LLSIF WHERE attribute = 'Smile'";
            }

        }
        // for medium
        if (difficulty == 1){

            if (attribute == 0){
                selected = "SELECT _id, name, attribute, medium, mediumbondlp FROM LLSIF WHERE attribute = 'Cool'";
            }

            if (attribute == 1){
                selected = "SELECT _id, name, attribute, medium, mediumbondlp FROM LLSIF WHERE attribute = 'Pure'";
            }

            if (attribute == 2){
                selected = "SELECT _id, name, attribute, medium, mediumbondlp FROM LLSIF WHERE attribute = 'Smile'";
            }

        }
        // for difficult
        if (difficulty == 2){

            if (attribute == 0){
                selected = "SELECT _id, name, attribute, hard, hardbondlp FROM LLSIF WHERE attribute = 'Cool'";
            }

            if (attribute == 1){
                selected = "SELECT _id, name, attribute, hard, hardbondlp FROM LLSIF WHERE attribute = 'Pure'";
            }

            if (attribute == 2){
                selected = "SELECT _id, name, attribute, hard, hardbondlp FROM LLSIF WHERE attribute = 'Smile'";
            }


        }
        // for 2hard
        if (difficulty == 3){

            if (attribute == 0){
                selected = "SELECT _id, name, attribute, expert, expertbondlp FROM LLSIF WHERE attribute = 'Cool'";
            }

            if (attribute == 1){
                selected = "SELECT _id, name, attribute, expert, expertbondlp FROM LLSIF WHERE attribute = 'Pure'";
            }

            if (attribute == 2){
                selected = "SELECT _id, name, attribute, expert, expertbondlp FROM LLSIF WHERE attribute = 'Smile'";
            }

        }

        return selected;
    }

}

