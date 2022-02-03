package com.example.fielectric.biciclete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.fielectric.R;

public final class pagina_biciclete_avantaje extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_biciclete_avantaje);

        TextView text = (TextView) findViewById(R.id.biciclete_avantaje);
        text.setText(Html.fromHtml(text_avantaje));
    }
    private final String text_avantaje = "<b>Bicicletele electrice sunt destinate în special persoanelor practice care vor să se deplaseze mult mai rapid " +
            "de acasă până la servici, dar pentru pasionații de adrenalină există și biciclete MTB cu motor electric care respectă toată caracteristicile unui MTB clasic." +
            "<br><b><br><b>Bicicleta electrică te asistă în momentul pedalării, deoarece motorul preia în mare parte eforul picioarelor, mai ales atunci când ai " +
            "de urcat pante sau în lipsa unei condiții fizice adecvate." +
            "<br><b><br><b>Costurile de întreținere ale unui astfel de mijloc de transport sunt foarte mici, acestea rezumându-se la costurile pentru energia " +
            "electrică sau la schimbarea anvelopelor bicicletei atunci când acestea s-au uzat. Singurul cost lunar al bicicletei rămâne încărcare" +
            " acumulatorului, iar dacă îl încarci complet în fiecare seară, pe factură se vor adăuga în plus doar 15 lei lunar. Un cost infim putem " +
            "spune, în comparație cu costurile de întreținere a unui autovehicul fără sa mai ținem seama și de reducerea poluării." +
            "<br><b><br><b>Lipsa reglementărilor. Nu există nicio diferență între conducerea unei biciclete electrice și conducerea celei clasice, în afară de " +
            "faptul că nu mai obosești pedalând. Nu trebuie nici să o înmatriculezi, nici să plătești taxe și impozite, trebuie doar să respecți Codul Rutier.<br>";

}