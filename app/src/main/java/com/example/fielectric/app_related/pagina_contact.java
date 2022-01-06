package com.example.fielectric.app_related;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.fielectric.R;

public class pagina_contact extends AppCompatActivity {

    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_contact);

        text = (TextView) findViewById(R.id.textDescriere);

        text.setText("Echipa fiiElectric! momentan se rezumă doar la un membru, eu. Mă numesc Andrei" +
                " și sunt un mare pasionat de mașini electrice, mai bine zis deorice ce este electric" +
                " precum biciclete sau trotinete electrice. Vreau un viitor verde, așa că m-am decis " +
                "să ajut lumea în a-și alege un autovehicul electric, fie el mașină, bicicletă, trotinetă " +
                "sau motocicletă.");
    }
}