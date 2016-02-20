package com.example.austin.hw1_cs407;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
    }

    public void Question1(View view) {
    }

    public void question2start(View buttonQ2) {
        EditText animal = (EditText) findViewById(R.id.animalguess);
        Intent startquiz = new Intent(getApplicationContext(), Question2.class);
        Bundle bundle = new Bundle();
        String guess;
        guess = animal.getText().toString();
        animal.setText("");
        bundle.putString("animal", guess);
        startquiz.putExtras(bundle);
        startActivity(startquiz);
    }
}
