package com.example.fielectric.app_related;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import com.example.fielectric.R;

/**
 * TODO TEXT FONTS HERE
 * titlu: android:fontFamily="@font/firasansextrabolditalic" + android:textSize="20sp" dimensiune
 * text:  android:fontFamily="@font/firasansblack" + android:textSize="15sp" dimensiune
 * butoane: android:fontFamily="@font/firasansmedium" + android:textSize="15sp"
 */
public final class pagina_bibliografie extends AppCompatActivity {

    private TextView biblio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_bibliografie);

        biblio = (TextView) findViewById(R.id.bibliografieScris);

        String titlu = "<b>✦Linkuri: </b>";
        String linkuri = "<p>⋆https://ro.pinterest.com/pin/333970128626576477/" +
                "<br>⋆https://ro.pinterest.com/pin/383017143316451020/" +
                "<br>⋆https://ro.pinterest.com/pin/28217935155022574/" +
                "<br>⋆https://ro.pinterest.com/pin/116460340355609515/" +
                "<br>⋆https://ro.pinterest.com/pin/805933295813528393/" +
                "<br>⋆https://ro.pinterest.com/pin/588916088777566458/" +
                "<br>⋆https://ro.pinterest.com/pin/985231159294916/" +
                "<br>⋆https://www.dacia.ro/detalii-rabla.html" +
                "<br>⋆https://0-100.ro/2020/03/26/masini-electrice-2020-ce-poti-cumpara-prin-rabla-plus/" +
                "<br>⋆https://www.g4media.ro/topul-celor-mai-vandute-masini-electrice-in-romania-volkswagen-peugeot-si-bmw-pe-primele-trei-locuri-autoturismele-ecologice-au-ajuns-la-o-cota-de-116-in-totalul-pietei-auto.html" +
                "<br>⋆https://www.caricos.com" +
                "<br>⋆https://ev-database.org/" +
                "<br>⋆https://www.tesla.com" +
                "<br>⋆https://www.g4media.ro/vrei-o-masina-electrica-top-5-avantaje-si-dezavantaje.html" +
                "<br>⋆https://www.rabla.ro/programul-rabla-2022/" +
                "<br>⋆https://www.smart-products.ro/blog/ar-trebui-sa-cumpar-o-trotineta-electrica-avantaje-dezavantaje" +
                "<br>⋆https://www.altex.ro" +
                "<br>⋆https://bunadimineata.ro/lifestyle/bicicleta-electrica-avantaje-si-dezavantaje/" +
                "<br>⋆https://shopniac.ro/biciclete-electrice-6353/" +
                "<br>⋆" +
                "<br>⋆" +
                "<br>⋆" +
                "<br>⋆" +
                "</p>";

        biblio.setText(Html.fromHtml(titlu + linkuri));

    }
}