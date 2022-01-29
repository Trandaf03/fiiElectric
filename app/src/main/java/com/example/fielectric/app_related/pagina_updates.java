package com.example.fielectric.app_related;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.fielectric.R;

import org.w3c.dom.Text;

//TODO scrie ce ai facut in update
public final class pagina_updates extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_updates);

        text = (TextView) findViewById(R.id.text_update_uri);


        String updateTitle1 = "<h1>✦Versiune Alpha 0.1: </b>";
        String updateTitle2 = "<h1>✦Versiune Alpha 0.2: </b>";
        String updateTitle3 = "<h1>✦Versiune Alpha 0.3: </b>";
        String updateTitle4 = "<h1>✦Versiune Alpha 0.4: </b>";
        String updateTitle5 = "<h1>✦Versiune Alpha 0.5: </b>";
        String updateTitle6 = "<h1>✦Versiune Alpha 0.6: </b>";
        String updateTitle7 = "<h1>✦Versiune Alpha 0.7: </b>";
        String updateTitle8 = "<h1>✦Versiune Alpha 0.8: </b>";
        String updateTitle9 = "<h1>✦Versiune Alpha 0.9: </b>";
        String updateTitle10 = "<h1>✦Versiune Beta 1.0: </b>";
        String updateTitle11 = "<h1>✦Versiune Beta 1.1: </b>";
        String updateTitle12 = "<h1>✦Versiune Beta 1.1.1: </b>";
        String updateTitle13 = "<h1>✦Versiune Beta 1.2: </b>";
        String updateTitle14 = "<h1>✦Versiune Beta 1.3: </b>";

        String totalWorkTime = "<h1>✦Total work time: 78 h</h1>";

        String updateText1 = "<p>⋆Creare aplicație" +
                "<br>⋆Creare interfață meniu principal" +
                "<br>⋆Creare interfață meniu contact" +
                "<br>⋆Creare interfață meniu setari" +
                "<br>⋆Creare interfață meniu actualizări</p>";

        String updateText2 = "<p>⋆Creare interfață pagina principală" +
                "<br>⋆Creare bibliografie" +
                "<br>⋆Adăugare informații despre imagini în bibliografie" +
                "<br>⋆Modificare stil pagină contact și actualizări" +
                "</p>";
        String updateText3 = "<p>⋆Modificare meniu principal" +
                "<br>⋆Modificare stil pagina despre" +
                "</p>";
        String updateText4 = "<p>⋆Creare pagina mașini" +
                "<br>⋆Adăugare pagina mașini rabla" +
                "</p>";
        String updateText5 = "<p>⋆Adăugare diactrice în paginile existente" +
                "<br>⋆Rezolvare probleme afișare pentru popup-urile de la tichetele rabla" +
                "<br>⋆Adăugare mașini noi" +
                "</p>";
        String updateText6 = "<p>⋆Adăugare calculator timp recuperare bani" +
                "<br>⋆Modificare pagină contact" +
                "</p>";
        String updateText7 = "<p>⋆Adăugare pagină avantaje vs dezavantaje mașini electrice" +
                "<br>⋆Înfrumusețare pagini existente" +
                "<br>⋆Modificare aspect pagină aspect mașini rabla" +
                "</p>";
        String updateText8 = "<p>⋆Adăugare interfață meniu principal" +
                "<br>⋆Modificare font aplicație" +
                "<br>⋆Rezolvare mici bug-uri" +
                "</p>";
        String updateText9 = "<p>⋆Adăugare meniuri laterale pentru paginile principale" +
                "<br>⋆Modificare stil stiri" +
                "<br>⋆Rezolvare mici bug-uri" +
                "<br>⋆Modificare stil cod de baza" +
                "</p>";
        String updateText10 = "<p>⋆Ultime finisaje pentru aplicație" +
                "<br>⋆Modificare iconiță aplicație" +
                "<br>⋆Modificare headers pagini" +
                "<br>⋆Rezolvare mici buguri" +
                "</p>";
        String updateText11 = "<p>⋆Adaugare pagină motociclete rabla WIP" +
                "<br>⋆Motociclete WIP" +
                "<br>⋆Sistem afisare nou" +
                "<br>⋆Rezolvare mici buguri" +
                "</p>";
        String updateText12 = "<p>⋆Testare adăugare buton sortare" +
                "<br>⋆Modificare afisare informatii tichete rabla" +
                "</p>";
        String updateText13 = "<p>⋆Modificare stil pagină mașini rabla" +
                "<br>⋆Adăugare buton pentru sortarea mașinilor" +
                "<br>⋆Finalizare structură principală pentru \"Mașini\"" +
                "<br>⋆Rezolvare mici buguri" +
                "</p>";
        String updateText14 = "<p>⋆Adăugare pagină detalii despre program rabla" +
                "<br>⋆Adăugare buton pentru sortarea motocicletelor" +
                "<br>⋆Finalizare structură principală pentru \"Motociclete\"" +
                "<br>⋆Rezolvare mici buguri" +
                "</p>";

        Spanned textPentruAfisat = Html.fromHtml( totalWorkTime +
                updateTitle14 + updateText14 +
                updateTitle13 + updateText13 +
                updateTitle12 + updateText12 +
                updateTitle11 + updateText11 +
                updateTitle10 + updateText10 +
                updateTitle9 + updateText9 +
                updateTitle8 + updateText8 +
                updateTitle7 + updateText7 +
                updateTitle6 + updateText6 +
                updateTitle5 + updateText5 +
                updateTitle4 + updateText4 +
                updateTitle3 + updateText3 +
                updateTitle2 + updateText2 +
                updateTitle1 + updateText1);

        text.setText(textPentruAfisat);
    }

}