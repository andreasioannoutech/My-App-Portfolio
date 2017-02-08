package com.kikkos.myappportfolio;

import android.content.Intent;
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
        // Configure the intent and a pop up message for each button when is clicked.
        // If the package manager does not find the app then an error popup message will display.
        btnShowPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.kikkos.myMovieNews");
                if (launchIntent != null) {
                    Toast.makeText(getApplicationContext(), getString(R.string.msgBtnShowPopularMovies), Toast.LENGTH_SHORT).show();
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(getApplicationContext(), getString(R.string.errorMsgAppNotFound), Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnShowStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.sam_chordas.android.stockhawk");
                if (launchIntent != null) {
                    Toast.makeText(getApplicationContext(), getString(R.string.msgBtnShowStockHawk), Toast.LENGTH_SHORT).show();
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(getApplicationContext(), getString(R.string.errorMsgAppNotFound), Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnShowBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.udacity.gradle.builditbigger");
                if (launchIntent != null) {
                    Toast.makeText(getApplicationContext(), getString(R.string.msgBtnShowBuildItBigger), Toast.LENGTH_SHORT).show();
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(getApplicationContext(), getString(R.string.errorMsgAppNotFound), Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnShowMakeYourAppMat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.xyzreader");
                if (launchIntent != null) {
                    Toast.makeText(getApplicationContext(), getString(R.string.msgBtnShowMakeYourAppMat), Toast.LENGTH_SHORT).show();
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(getApplicationContext(), getString(R.string.errorMsgAppNotFound), Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnShowGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.android.sunshine");
                if (launchIntent != null) {
                    Toast.makeText(getApplicationContext(), getString(R.string.msgBtnShowGoUbiquitous), Toast.LENGTH_SHORT).show();
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(getApplicationContext(), getString(R.string.errorMsgAppNotFound), Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnShowCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.gcna.dinevenues");
                if (launchIntent != null) {
                    Toast.makeText(getApplicationContext(), getString(R.string.msgBtnShowCapstone), Toast.LENGTH_SHORT).show();
                    startActivity(launchIntent);
                } else {
                    Toast.makeText(getApplicationContext(), getString(R.string.errorMsgAppNotFound), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
