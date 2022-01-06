package com.example.fielectric.masini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fielectric.R;

public class pagina_masini extends AppCompatActivity {

    private Button rabla;
    private Button electricVS;
    private Button scoateBanii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_masini);

        rabla = findViewById(R.id.buton_masini_rabla);
        electricVS = findViewById(R.id.buton_masini_electricVScombustibil);
        scoateBanii = findViewById(R.id.buton_masini_returnRatioMasini);


        rabla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRabla();
            }
        });
        electricVS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openElectricVS();
            }
        });
        scoateBanii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReturnRatio();
            }
        });

    }

    private void openRabla(){
        Intent intent = new Intent(this, pagina_masini_rabla.class);
        startActivity(intent);
    }
    private void openElectricVS(){
        Intent intent = new Intent(this, pagina_masini_AvantajeVsDezavantaje.class);
        startActivity(intent);
    }
    private void openReturnRatio(){
        Intent intent = new Intent(this, pagina_masini_scoateBanii.class);
        startActivity(intent);
    }


}