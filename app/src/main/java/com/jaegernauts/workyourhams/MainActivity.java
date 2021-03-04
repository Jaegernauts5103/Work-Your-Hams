package com.workyourhams.startingscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button WE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void OpenWE(View view) {
        Intent intent = new Intent(MainActivity.this, WorkoutsWE.class);
        startActivity(intent);
    }

    public void OpenWOE(View view) {
        Intent intent = new Intent(MainActivity.this, WorkoutsWOE.class);
        startActivity(intent);
    }
    public void OpenSettings(View view) {
        Intent intent = new Intent(MainActivity.this, Settings.class);
        startActivity(intent);
    }
    public void OpenHamster(View view) {
        Intent intent = new Intent(MainActivity.this, Hamster.class);
        startActivity(intent);
    }
}