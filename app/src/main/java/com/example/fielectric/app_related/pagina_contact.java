package com.example.fielectric.app_related;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.fielectric.R;

public final class pagina_contact extends AppCompatActivity {

    private TextView text;
    private TextView imagineInstaTrandaf;
    private TextView imagineFacebookTrandaf;
    private TextView imagineInstaRares;
    private TextView imagineFacebookRares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_contact);

        text = (TextView) findViewById(R.id.textDescriere);

        imagineInstaTrandaf = (TextView) findViewById(R.id.instaText);
        imagineFacebookTrandaf = (TextView) findViewById(R.id.textFb);
        imagineFacebookRares = (TextView) findViewById(R.id.textFbrares);
        imagineInstaRares = (TextView) findViewById(R.id.instaTextrares);

        text.setText("Echipa fiiElectric! momentan se rezumă doar la doi membri, Trandafir Andrei și Nica Rareș. Mă numesc Andrei" +
                " și suntem mari pasionat de mașini electrice, mai bine zis deorice ce este electric" +
                " precum biciclete sau trotinete electrice. Vrem un viitor verde, așa că ne-am decis " +
                "să ajutăm lumea în a-și alege un autovehicul electric, fie el mașină, bicicletă, trotinetă " +
                "sau motocicletă.");

        String facebook = "<a href=\"https://www.facebook.com/trandaf10\">Trandfir Andrei</a>";
        String insta = "<a href=\"https://www.instagram.com/trandaf10/\">Trandf10</a>";

        String facebookrares = "<a href=\"https://www.facebook.com/daniel.nica.712\">Nica Rareș</a>";
        String instarares = "<a href=\"https://www.instagram.com/raresh.23/\">raresh.23</a>";

        imagineInstaTrandaf.setMovementMethod(LinkMovementMethod.getInstance());
        imagineFacebookTrandaf.setMovementMethod(LinkMovementMethod.getInstance());
        imagineInstaRares.setMovementMethod(LinkMovementMethod.getInstance());
        imagineFacebookRares.setMovementMethod(LinkMovementMethod.getInstance());


        imagineInstaTrandaf.setText(Html.fromHtml(insta));
        imagineFacebookTrandaf.setText(Html.fromHtml(facebook));
        imagineInstaRares.setText(Html.fromHtml(instarares));
        imagineFacebookRares.setText(Html.fromHtml(facebookrares));

    }

}