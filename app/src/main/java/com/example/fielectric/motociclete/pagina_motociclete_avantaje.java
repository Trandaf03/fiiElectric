package com.example.fielectric.motociclete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.fielectric.R;

public class pagina_motociclete_avantaje extends AppCompatActivity {

    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_motociclete_avantaje);
        text = (TextView) findViewById(R.id.motociclete_rabla_avantaje);

        text.setText(Html.fromHtml(textAvantaje));
    }

    private String textAvantaje = "<b>✦Un \"plin\" costă în medie 1 euro dacă bateria este conectată la rețeaua de domiciliu " +
            "sau complet gratuită în municipalitățile care asigură stații de încărcare pe străzi." +   "<br><b>" +
            "<br><b>✦Emisii zero la locul de utilizare" +  "<br><b>" +
            "<br><b>✦Extrem de tăcut" +  "<br><b>" +
            "<br><b>✦Poate fi folosit și în interior" +  "<br><b>" +
            "<br><b>✦Nu este nevoie să mergeți la o benzinărie, ci doar conectați scuterul la rețeaua dvs. de acasă" +  "<br><b>" +
            "<br><b>✦Simplitatea și fiabilitatea extreme ale unui motor electric reduce drastic întreținerea acestuia" +  "<br><b>" +
            " (nu are cilindri , supape, carburator , nu necesită schimb de ulei etc.) și îi mărește foarte mult durata de viață utilă." +
            "<br>";
}