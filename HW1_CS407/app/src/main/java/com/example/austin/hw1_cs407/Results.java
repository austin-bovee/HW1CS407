package com.example.austin.hw1_cs407;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intentExtras = getIntent();
        Bundle gatherAnswers = intentExtras.getExtras();

        CharSequence animal = gatherAnswers.getCharSequence("animal");
        CharSequence color = gatherAnswers.getCharSequence("color");
        TextView answer1 = (TextView) findViewById(R.id.useranimalguess);
        TextView answer2 = (TextView) findViewById(R.id.usercolorguess);
        answer1.setText(animal);
        answer2.setText(color);




    }

    public void backtohome(View buttonHome) {
        Intent startquiz = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(startquiz);
    }
    public void restartquiz(View restart){
        Intent restartquiz = new Intent(getApplicationContext(), Question1.class);
        startActivity(restartquiz);
    }
}
