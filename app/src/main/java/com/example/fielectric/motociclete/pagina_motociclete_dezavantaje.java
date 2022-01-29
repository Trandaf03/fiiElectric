package com.example.fielectric.motociclete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.fielectric.R;

public class pagina_motociclete_dezavantaje extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_motociclete_dezavantaje);

        text = (TextView) findViewById(R.id.motociclete_rabla_dezavantaje);

        text.setText(Html.fromHtml(textDezavantaje));

    }

    private String textDezavantaje = "<b>✦Costul de achiziție poate fi mai mare în Europa decât un scuter pe benzină cu performanțe egale sau superioare," +
            " dar multe modele sunt deja disponibile la costuri chiar mai mici decât modelele pe benzină." +"<br><b>" +
            "<br><b>✦Autonomia în general limitată la 50-80 km, dar există modele care permit autonomie până la peste 200 km." +"<br><b>" +
            "<br><b>✦Încărcarea durează câteva ore, comparativ cu câteva minute necesare pentru a umple un rezervor, " +
            "chiar dacă modelele cu un timp de încărcare de doar o oră sunt deja pe piață. În unele modele problema a " +
            "fost rezolvată drastic cu bateria detașabilă și înlocuibilă în câteva secunde. Deci, acesta este acum un dezavantaj umplut de tehnologiile actuale." +"<br><b>" +
            "<br><b>✦Viteza maximă și ridicarea sunt mai mici decât un scuter pe benzină la un preț similar." +"<br><b>" +
            "<br><b>✦Punctele de reîncărcare a drumurilor sunt limitate în câteva centre urbane, în comparație cu" +
            " capilaritatea stațiilor de benzină, dar sistemele de reîncărcare pe scară largă sunt acum implementate în toate orașele mari." + "<br><b>" +
            "<br><b>✦Ca și în cazul tuturor vehiculelor electrice, guvernele occidentale se confruntă cu problema " +
            "unei posibile prăbușiri a veniturilor colectate în mod normal cu accize la combustibili, mai ales dacă se creează mult căutatul program general de dezvoltare pe scară largă a energiei solare sau eoliene." +
            "<br>";
}