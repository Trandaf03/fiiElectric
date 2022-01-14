package com.example.fiielectric.app_related;

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

public class pagina_updates extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_updates);

        text = (TextView) findViewById(R.id.text_update_uri);


        String updateTitle1 = "<b>✦Versiune Alpha 0.1: </b>";
        String updateTitle2 = "<b>✦Versiune Alpha 0.2: </b>";
        String updateTitle3 = "<b>✦Versiune Alpha 0.3: </b>";
        String updateTitle4 = "<b>✦Versiune Alpha 0.4: </b>";
        String updateTitle5 = "<b>✦Versiune Alpha 0.5: </b>";
        String updateTitle6 = "<b>✦Versiune Alpha 0.6: </b>";
        String updateTitle7 = "<b>✦Versiune Alpha 0.7: </b>";
        String updateTitle8 = "<b>✦Versiune Alpha 0.8: </b>";
        String updateTitle9 = "<b>✦Versiune Alpha 0.9.1: </b>";

        String totalWorkTime = "<b>✦Total work time: 58 h</b>";

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


        Spanned textPentruAfisat = Html.fromHtml(updateTitle9 + updateText9 +
                updateTitle8 + updateText8 +
                updateTitle7 + updateText7 +
                updateTitle6 + updateText6 +
                updateTitle5 + updateText5 +
                updateTitle4 + updateText4 +
                updateTitle3 + updateText3 +
                updateTitle2 + updateText2 +
                updateTitle1 + updateText1 +
                totalWorkTime);

        text.setText(textPentruAfisat);
    }

}