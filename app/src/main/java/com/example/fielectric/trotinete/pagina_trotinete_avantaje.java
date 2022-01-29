package com.example.fielectric.trotinete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.fielectric.R;

public class pagina_trotinete_avantaje extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_trotinete_avantaje);


        text = (TextView) findViewById(R.id.trotinete_avantaje);

        text.setText(Html.fromHtml(text_avantaje));
    }

    private String text_avantaje = "<h1>✦Ușoare și practice</h1>" +
            "Trotinetele sunt făcute pentru a fi ușoare și practice. Puteți găsi trotinete ce cântăresc 12 kilograme, dar și modele care ajung până la 25 de kilograme," +
            " totul depinde de motor și capacitatea bateriilor. Dacă aveți o trotinetă pliabilă atunci știți deja că este foarte practică, în numai 5 secunde o puteți " +
            "strânge și băga sub birou. O puteți lua la serviciu, la școală, fără să o lăsați în exteriorul clădirilor. Acesta este principalul avantaj al trotinetelor" +
            " în comparație cu bicicletele obișnuite sau cele electrice." +
            "<h1>✦Nu aveți nevoie de multa întreținere</h1>" +
            "O trotinetă electrică nu are nevoie de multă întreținere, de fapt, aproape deloc. Trebuie să vă asigurați că șuruburile sunt strânse corect măcar o data pe" +
            " luna și cam atât. Din experiența noastră, dacă investiți într-o trotinetă de înaltă calitate, piesele sunt fiabile și nu veți avea probleme. Și chiar dacă" +
            " aveți nevoie să schimbați o roată, o lumină sau o anvelopă, costurile nu se compară cu cele necesare întreținerii unei mașini." +
            "<h1>✦Costul per kilometru</h1>" +
            "Cu excepția prețului de achiziție, care poate fi ridicat, mai ales dacă dețineți deja o mașină, costurile pentru fiecare kilometru sunt mult mai mici în " +
            "cazurile trotinetei, așa cum am mai spus, întretinerea este minimă și costurile la fel în comparație cu o mașina.Cu până la 5 lei poți să faci un \"plin\" full, cu care poți să mergi și 50km" +
            "<h1>✦Viteza</h1>" +
            "Aceste trotinete sunt destul de rapide. Sunt capabile să atingă aceleași viteze ca și bicicletele electrice sau scuterele pe benzină." +
            "<h1>✦Convenabile</h1>" +
            "Am discutat despre aspectele practice ale unei trotinete electrice, dar există un alt avantaj imens. Poți să ajungi la muncă fără niciun pic de efort, " +
            "fără a transpira. Comparând cu o bicicletă, nu trebuie să pedalați, trebuie doar să stați pe ea și să trageți de accelerație." +
            "<h1>✦Prietenoase cu mediul</h1>" +
            "Poate considerați că nu vă afectează în mod direct, dar, dacă am folosi toți mijloace de transport nepoluante, atunci vom avea în câțiva ani un aer și un mediu mult mai curat." +
            "<h1>✦Distractive</h1>" +
            "Încă nu am întalnit o persoană care să nu se bucure de plimbarea pe o trotineta electrică, însă cu siguranță există cazuri. Desigur, o plimbare scurtă nu înseamnă automat că vă" +
            " veți simți confortabil să vă deplasați zi de zi, dar este un început.";


}