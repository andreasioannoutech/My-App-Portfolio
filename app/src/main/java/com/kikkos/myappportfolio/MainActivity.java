package com.kikkos.myappportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    // Creating variables with butterknife injection
    @BindView(R.id.btnShowPopularMovies)
    Button btnShowPopularMovies;
    @BindView(R.id.btnShowStockHawk)
    Button btnShowStockHawk;
    @BindView(R.id.btnShowBuildItBigger)
    Button btnShowBuildItBigger;
    @BindView(R.id.btnShowMakeYourAppMat)
    Button btnShowMakeYourAppMat;
    @BindView(R.id.btnShowGoUbiquitous)
    Button btnShowGoUbiquitous;
    @BindView(R.id.btnShowCapstone)
    Button btnShowCapstone;
    @BindView(R.id.btnShowSunshine)
    Button btnShowSunshine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    // Configuring the onClick Listeners for each Button with ButterKnife
    // Configure the intent and a pop up message for each button when is clicked.
    // If the package manager does not find the app then an error popup message will display.
    @OnClick({R.id.btnShowPopularMovies, R.id.btnShowStockHawk, R.id.btnShowBuildItBigger, R.id.btnShowMakeYourAppMat, R.id.btnShowGoUbiquitous, R.id.btnShowCapstone, R.id.btnShowSunshine})
    public void clickShowPopularMovies(Button button){
        Intent launchIntent = null;
        String message = "";
        switch (button.getId()){
            case R.id.btnShowPopularMovies:{
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.kikkos.myMovieNews");
                message = getString(R.string.msgBtnShowPopularMovies);
                break;
            }
            case R.id.btnShowStockHawk:{
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.sam_chordas.android.stockhawk");
                message = getString(R.string.msgBtnShowStockHawk);
                break;
            }
            case R.id.btnShowBuildItBigger:{
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.udacity.gradle.builditbigger");
                message = getString(R.string.msgBtnShowBuildItBigger);
                break;
            }
            case R.id.btnShowMakeYourAppMat:{
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.xyzreader");
                message = getString(R.string.msgBtnShowMakeYourAppMat);
                break;
            }
            case R.id.btnShowGoUbiquitous:{
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.android.sunshine");
                message = getString(R.string.msgBtnShowGoUbiquitous);
                break;
            }
            case R.id.btnShowCapstone:{
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.gcna.dinevenues");
                message = getString(R.string.msgBtnShowCapstone);
                break;
            }
            case R.id.btnShowSunshine:{
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.kikkos.sunshine");
                message = getString(R.string.msgBtnShowSunshine);
                break;
            }
            default:{
                launchIntent = null;
                break;
            }
        }
        if (launchIntent != null) {
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            startActivity(launchIntent);
        } else {
            Toast.makeText(getApplicationContext(), getString(R.string.errorMsgAppNotFound), Toast.LENGTH_SHORT).show();
        }
    }
}
