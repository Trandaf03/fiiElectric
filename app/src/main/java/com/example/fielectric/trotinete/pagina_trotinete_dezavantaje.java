package com.example.fielectric.trotinete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.fielectric.R;

public class pagina_trotinete_dezavantaje extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_trotinete_dezavantaje);

        text = (TextView) findViewById(R.id.trotinete_dezavantaje);

        text.setText(Html.fromHtml(text_dezavantaje));
    }

    String text_dezavantaje = "<h1>✦Prețul</h1>" +
            "Prețul este principalul obstacol pentru cei mai multi dintre noi. Aceste trotinete sunt destul de scumpe, în special cele de înaltă calitate. " +
            "Motivul din spatele prețilui ridicat este bateria, controllerul și motorul. Bateriile sunt scumpe și greu de produs, așa că trotinetle care au o autonomie mare vor fi destul de scumpe." +
            "Dacă nu dețineți încă o mașină, ideea unei trotinete electrice pare mult mai logică. Dacă aveți deja o mașină și plătiți taxe și întreținerea " +
            "acesteia, costul unei trotinete este posibil să vi se pară mare. Dar, într-un final veți fi eco-friendly dacă alegeți un vehicul electric." +
            "Există multe variabile în funcție de situația dvs, cum ar fi unde lucrați și banii pe care sunteți dispuși să ii cheltuiți pentru o trotinetă. " +
            "<h1>✦Distanța mica</h1>" +
            "Dacă aveți mai puțin de 1-2 km de parcurs până la locul de muncă, puteți merge intotdeauna pe jos, astfel încât costul unei trotinete electrice nu " +
            "mai pare sa aibă sens. Dacă totuși vreți neapărat o trotinetă, puteți alege una cu autonomie mică, astfel încât nu veți plăti un preț foarte mare." +
            "<h1>✦Distanța mare</h1>" +
            "Dacă aveți mai mult de 10-15 km de parcurs până la locul de muncă, atunci o mașina ar putea fi o alternativă mai fiabilă și mai rapidă. Cel mai " +
            "probabil veți face mai mult timp cu trotineta decât cu mașina, asta dacă nu lucrați într-o zonă foarte aglomerată, unde varianta ultimul kilometru ar fi mai indicată." +
            "<h1>✦Mișcare</h1>" +
            "Așa cum am amintit anterior, nu veți depunde aproape niciun efort atunci când folosiți o trotinetă. Dacă aveți o distanță mică până la serviciu, " +
            "atunci o bicicletă este o soluție mai ieftina." +
            "<h1>✦Autonomia</h1>" +
            "Dacă vă decideți să cumpărați o trotinetă electrică, acordați o atenție sporită autonomiei. Este recomandat să cumpărați una cu o autonomie mai mare" +
            " decat aveți nevoie, pentru că pentru a atinge distanțele specificate trebuie să îndepliniți niște condiții ideale, aproape imposibil în lumea reală." +
            " În acest fel, veți ajunge întotdeauna la destinație, chiar dacă temperatura exterioară nu este favorabilă.";
}