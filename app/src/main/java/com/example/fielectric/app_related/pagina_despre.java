package com.example.fielectric.app_related;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fielectric.R;

public class pagina_despre extends AppCompatActivity {

    private Button veziUpdateuri;
    private Button veziBibliografie;
    private TextView versiune;


    private String versiunePrezent = "alpha 0.6";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_despre);

         veziUpdateuri = (Button) findViewById(R.id.veziUpdates);
         veziBibliografie = (Button) findViewById(R.id.bibliografie);
         versiune = (TextView) findViewById(R.id.versiuneCurenta);
         versiune.setText(versiunePrezent);

        veziBibliografie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBibliografie();
            }
        });
         veziUpdateuri.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openUpdatesActivity();
             }
         });


    }


    private void openUpdatesActivity(){
        Intent intent = new Intent(this, pagina_updates.class);
        startActivity(intent);
    }
    private void openBibliografie(){
        Intent intent = new Intent(this, pagina_bibliografie.class);
        startActivity(intent);
    }

}