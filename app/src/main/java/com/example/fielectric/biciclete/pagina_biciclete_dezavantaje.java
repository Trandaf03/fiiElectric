package com.example.fielectric.biciclete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.fielectric.R;

public final class pagina_biciclete_dezavantaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_biciclete_dezavantaje);

        TextView text = (TextView) findViewById(R.id.biciclete_dezavantaje);
        text.setText(Html.fromHtml(text_dezavantaje));
    }

    private final String text_dezavantaje = "<b>Unul dintre cele mai mari inconveniente atunci când vine vorba despre achiziționarea unei biciclete electrice " +
            "este costul destul de ridicat, asta datorându-se motorului electric și a acumulatorului. Prețurile mai pot să difere și în funcție de dotări," +
            " marcă și autonomia acumulatorului.<br><b><br><b>" +
            "Un al doilea dezavantaj ar fi greutatea bicicletei. Motorul împreună cu acumulatorul cântăresc undeva la 10 kg sau chiar mai mult, astfel " +
            "că nu va fi foarte ușor să o transporți, în special dacă stai la bloc și ai de urcat câteva etaje.<br>";
}