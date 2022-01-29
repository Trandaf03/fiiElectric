package com.example.fielectric.trotinete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.fielectric.R;

public class pagina_trotinete_merita extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_trotinete_merita);

        text = (TextView) findViewById(R.id.trotinete_merita);

        text.setText(Html.fromHtml(text_merita));
    }

    private String text_merita = "<h1>✦Răspunsul nostru este da, dacă:</h1>" +
            "<b>- veți folosi trotineta ca și vehicul pentru ultimul kilometru deoarece lucrați într-o zona aglomerată;<br>" +
            "<b>- aveți o distanță de maxim 10 km până la locul de muncă;<br>" +
            "<b>- locuiți într-un mediu favorabil (fără luni multe de zapadă);<br>" +
            "<b>- ar trebui să vă gândiți bine dacă deja dețineți o masină sau un scuter;<br>" +
            "<b>- vreți să vă mișcați rapid prin orașele aglomerate;<br>" +

            "<h1>✦Cât de mult se depreciază valoarea trotinetelor electrice în timp?</h1>" +
            "Există două variabile măsurabile atunci când vine vorba de deprecierea acestor vehicule. Le scade valoarea în timp și în funcție de numărul de km de la bord. " +
            "<h1>✦Merită să cumpăram o trotineta second-hand?</h1>" +
            "Nu este recomandat să cumpărați una folosita decât dacă sunteți sigur de originea acesteia, are puțini km parcurși, iar cel care o vinde este demn de încredere. " +
            "Adevărul este ca diferența de preț între o trotineta nouă și una second-hand nu este atât de mare încat sa nu merite sa o cumparați nouă și să profitați și de garanția oferită. " +
            "Bateriile sunt scumpe, iar dacă trotineta are mulți km parcurși, atunci va trebui să schimbați bateria cel mai probabil." +
            "<h1>✦Putem utiliza trotineta electrică în ploaie sau zăpadă?</h1>" +
            "În teorie da, totuși vă sfătuim să mergeți cu trotineta maxim atunci când este o ploaie ușoară, în niciun caz atunci când plouă extrem de tare sau este zăpadă. " +
            "Performanțele oricum vor fi extrem de scăzute în aceste condiții extreme, iar pericolul va fi și el pe măsură." +
            "<h1>✦Concluzie</h1>" +
            "Este clar că trotinetele electrice, la fel ca orice alt vehicul, au avantaje și dezavantaje. În funcție de situația dvs particulară, puteți decide dacă doriți să" +
            " cumpărați sau nu o trotinetă electrică. Noi considerăm că sunt o modalitate de transport extrem de eficientă și mult mai prietenoasă cu mediul înconjurător.";

}