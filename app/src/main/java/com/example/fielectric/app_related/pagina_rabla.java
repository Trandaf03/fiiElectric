package com.example.fielectric.app_related;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.fielectric.R;

public final class pagina_rabla extends AppCompatActivity {

    private TextView rabla_plus_titlu;
    private TextView rabla_plus_text;
    private TextView rabla_clasic_titlu;
    private TextView rabla_clasic_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_rabla);

        rabla_clasic_text = (TextView) findViewById(R.id.rabla_text_clasic);
        rabla_clasic_titlu = (TextView) findViewById(R.id.rabla_titlu_clasic);
        rabla_plus_text = (TextView) findViewById(R.id.rabla_text_plus);
        rabla_plus_titlu = (TextView) findViewById(R.id.rabla_titlu_plus);

        rabla_clasic_text.setText(Html.fromHtml(clasic_text));
        rabla_clasic_titlu.setText(Html.fromHtml(clasic_title));

        rabla_plus_titlu.setText(Html.fromHtml(plus_title));
        rabla_plus_text.setText(Html.fromHtml(plus_text));
    }


    private String clasic_title = "<h1>Rabla Clasic 2022</h1>";
    private String clasic_text = "<p>✦Este valabil pentru achizitionarea de vehicule cu motor pe combustie sau hibrid cu emisii de CO2 sub 140 g CO2/km." +
            "</p><p>✦Se acorda un tichet in valoare de 7500 lei pentru o masina mai veche de 8 ani casata in scopul achizitionarii unei masini noi cu noxe reduse. Se poate folosi un singur de astfel tichet." +
            "</p><p>✦In plus, cumparatorul unei masini noi mai poate beneficia suplimentar de eco-bonusuri, specifice masinii nou achizitionate, astfel:" +
            "</p><b>⋆ecobonus în valoare de 1.500 de lei la achiziţionarea unui autovehicul nou, exceptând motocicletele, echipat cu sistem de propulsie care" +
            " generează o cantitate de emisii de maximum 96 g CO2/km NEDC în regim de funcţionare mixt, conform informaţiilor înscrise în COC, sau echipat cu motorizare GPL/GNC;" +
            "<br><b>⋆ecobonus în valoare de 1.500 de lei în cazul în care în COC este înscrisă şi cantitatea de emisii de CO2 conform standardului WLTP, pentru autovehiculul " +
            "nou exceptând motocicletele, al cărui sistem de propulsie generează maximum 105 g CO_2/km NEDC în regim de funcţionare mixt, sau echipat cu motorizare GPL/GNC;" +
            "<br><b>⋆ecobonus în valoare de 1.500 de lei în cazul în care în COC este înscrisă doar cantitatea de emisii de CO2 conform standardului WLTP, se acordă pentru " +
            "autovehiculul nou, exceptând motocicletele, al cărui sistem de propulsie generează maximum 124 g CO2/km WLTP în regim de funcţionare mixt;" +
            "<br><b>⋆ecobonus în valoare de 3.000 de lei la achiziţionarea unui autovehicul nou, exceptând motocicletele, echipat cu sistem de propulsie hibrid." +
            "<br><p>✦Ecobonusurile se pot cumula în cazul în care mașina nouă îndeplinește ambele condiții, ajungându-se astfel la o reducere de 12.000 de lei din prețul total al autovehiculului nou."
            + "</p>";

    private String plus_title = "<h1>✦Rabla Plus 2022</h1>";
    private String plus_text = "<p>✦Este un program valabil doar pentru vehicule 100% electrice sau hibrid Plug-in si se poate accesa impreuna cu Rabla Clasic." +
            "</p><p>✦Exista doua tipuri de bonusuri care pot fi obtinute impreuna cu tichetul de 7500 lei de la Rabla Clasic:" +
            "</p><b>⋆un eco-tichet de 20.000 de lei pentru masinile hibrid Plug-in cu emisii de CO2 mai mici sau egale cu 50g/km (NEDC)" +
            "<br><b>⋆un eco-tichet de 45.000 de lei pentru achizitia unei masini 100% electrice"
            + "</br>";


}