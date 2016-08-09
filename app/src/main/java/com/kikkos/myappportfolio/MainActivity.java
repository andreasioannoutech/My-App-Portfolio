package com.kikkos.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Creating variables
    Button btnP1;
    Button btnP2;
    Button btnP3;
    Button btnP4;
    Button btnP5;
    Button btnP6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // onCreate of the Activity, instantiating button variables with their respective view.
        btnP1 = (Button) findViewById(R.id.btnP1);
        btnP2 = (Button) findViewById(R.id.btnP2);
        btnP3 = (Button) findViewById(R.id.btnP3);
        btnP4 = (Button) findViewById(R.id.btnP4);
        btnP5 = (Button) findViewById(R.id.btnP5);
        btnP6 = (Button) findViewById(R.id.btnP6);

        // Configuring the onClick Listeners for each Button.
        // Configure the pop up message for each button when is clicked.
        btnP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "This button will launch my Popular Movies app!", Toast.LENGTH_LONG).show();
            }
        });

        btnP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "This button will launch my Stock Hawk app!", Toast.LENGTH_LONG).show();
            }
        });

        btnP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "This button will launch my Build It Bigger app!", Toast.LENGTH_LONG).show();
            }
        });

        btnP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "This button will launch my Make Your App Material app!", Toast.LENGTH_LONG).show();
            }
        });

        btnP5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "This button will launch my Go Ubiquitous app!", Toast.LENGTH_LONG).show();
            }
        });

        btnP6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "This button will launch my Capstone app!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
