package com.example.fielectric.app_related;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.fielectric.R;

public class pagina_contact extends AppCompatActivity {

    private TextView text;
    private TextView imagineInsta;
    private TextView imagineFacebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_contact);

        text = (TextView) findViewById(R.id.textDescriere);
        imagineInsta = (TextView) findViewById(R.id.instaText);
        imagineFacebook = (TextView) findViewById(R.id.textFb);

        text.setText("Echipa fiiElectric! momentan se rezumă doar la un membru, eu. Mă numesc Andrei" +
                " și sunt un mare pasionat de mașini electrice, mai bine zis deorice ce este electric" +
                " precum biciclete sau trotinete electrice. Vreau un viitor verde, așa că m-am decis " +
                "să ajut lumea în a-și alege un autovehicul electric, fie el mașină, bicicletă, trotinetă " +
                "sau motocicletă.");
        String facebook = "<a href=\"https://www.facebook.com/trandaf10\">Trandfir Andrei</a>";
        String insta = "<a href=\"https://www.instagram.com/trandaf10/\">Trandf10</a>";

        imagineInsta.setMovementMethod(LinkMovementMethod.getInstance());
        imagineFacebook.setMovementMethod(LinkMovementMethod.getInstance());


        imagineInsta.setText(Html.fromHtml(insta));
        imagineFacebook.setText(Html.fromHtml(facebook));

    }

}