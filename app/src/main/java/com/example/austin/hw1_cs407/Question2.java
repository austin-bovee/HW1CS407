package com.example.austin.hw1_cs407;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question2 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }

    public void getResults(View buttonQ2) {
        Intent startquiz = new Intent(getApplicationContext(), Results.class);
        Intent extras = getIntent();
        Bundle bundle = new Bundle();
        bundle = extras.getExtras();
        String guess;

        radioGroup = (RadioGroup) findViewById(R.id.colorbuttongroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(selectedId);
        guess = radioButton.getText().toString();

        bundle.putString("color", guess);
        startquiz.putExtras(bundle);
        startActivity(startquiz);
    }
}
