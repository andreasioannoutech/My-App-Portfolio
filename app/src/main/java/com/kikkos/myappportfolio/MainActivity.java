package com.kikkos.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Creating variables
    Button btnShowPopularMovies;
    Button btnShowStockHawk;
    Button btnShowBuildItBigger;
    Button btnShowMakeYourAppMat;
    Button btnShowGoUbiquitous;
    Button btnShowCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // onCreate of the Activity, instantiating button variables with their respective view.
        btnShowPopularMovies = (Button) findViewById(R.id.btnShowPopularMovies);
        btnShowStockHawk = (Button) findViewById(R.id.btnShowStockHawk);
        btnShowBuildItBigger = (Button) findViewById(R.id.btnShowBuildItBigger);
        btnShowMakeYourAppMat = (Button) findViewById(R.id.btnShowMakeYourAppMat);
        btnShowGoUbiquitous = (Button) findViewById(R.id.btnShowGoUbiquitous);
        btnShowCapstone = (Button) findViewById(R.id.btnShowCapstone);

        // Configuring the onClick Listeners for each Button.
        // Configure the pop up message for each button when is clicked.
        btnShowPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getString(R.string.msgBtnShowPopularMovies), Toast.LENGTH_LONG).show();
            }
        });

        btnShowStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getString(R.string.msgBtnShowStockHawk), Toast.LENGTH_LONG).show();
            }
        });

        btnShowBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getString(R.string.msgBtnShowBuildItBigger), Toast.LENGTH_LONG).show();
            }
        });

        btnShowMakeYourAppMat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getString(R.string.msgBtnShowMakeYourAppMat), Toast.LENGTH_LONG).show();
            }
        });

        btnShowGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getString(R.string.msgBtnShowGoUbiquitous), Toast.LENGTH_LONG).show();
            }
        });

        btnShowCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), getString(R.string.msgBtnShowCapstone), Toast.LENGTH_LONG).show();
            }
        });
    }
}
