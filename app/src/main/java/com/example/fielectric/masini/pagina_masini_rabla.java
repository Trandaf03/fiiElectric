package com.example.fielectric.masini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fielectric.R;
@Deprecated
public final class pagina_masini_rabla extends AppCompatActivity {


    private ImageButton teslamodelS;
    private ImageButton teslamodel3;
    private ImageButton teslamodelX;
    private ImageButton teslamodelY;
    private ImageButton daciaspring;
    private ImageButton egolf;
    private ImageButton eup;
    private ImageButton id3;
    private ImageButton id4;
    private ImageButton e208;
    private ImageButton e2008;
    private ImageButton bmwi3;
    private ImageButton zoe;
    private ImageButton kona;
    private ImageButton ioniq;
    private ImageButton mini;
    private ImageButton mx30;
    private ImageButton leaf;
    private ImageButton corsae;
    private ImageButton mokkae;
    private ImageButton smart;
    private ImageButton hondae;
    private ImageButton fiat;

    private pagina_masini_popup_texts informatii = new pagina_masini_popup_texts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_masini_rabla);

        teslamodelS = (ImageButton) findViewById(R.id.teslamodels);
        teslamodel3 = (ImageButton) findViewById(R.id.teslamodel3);
        teslamodelX = (ImageButton) findViewById(R.id.teslamodelx);
        teslamodelY = (ImageButton) findViewById(R.id.teslamodely);
        daciaspring = (ImageButton) findViewById(R.id.daciaspring);
        egolf = (ImageButton) findViewById(R.id.egolf);
        eup = (ImageButton) findViewById(R.id.eup);
        id3 = (ImageButton) findViewById(R.id.id3);
        id4 = (ImageButton) findViewById(R.id.id4);
        e208 = (ImageButton) findViewById(R.id.e208);
        e2008 = (ImageButton) findViewById(R.id.e2008);
        bmwi3 = (ImageButton) findViewById(R.id.i3);
        zoe = (ImageButton) findViewById(R.id.zoe);
        kona = (ImageButton) findViewById(R.id.kona);
        ioniq = (ImageButton) findViewById(R.id.ioniq);
        mini = (ImageButton) findViewById(R.id.mini);
        mx30 = (ImageButton) findViewById(R.id.mx30);
        leaf = (ImageButton) findViewById(R.id.leaf);
        corsae = (ImageButton) findViewById(R.id.corsae);
        mokkae = (ImageButton) findViewById(R.id.mokkae);
        smart = (ImageButton) findViewById(R.id.smart);
        hondae = (ImageButton) findViewById(R.id.hondae);
        fiat = (ImageButton) findViewById(R.id.fiat500);

        teslamodelS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.teslamodels_title);
                dialog.setTextAfisare(informatii.teslamodels_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        teslamodel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.teslamodel3_title);
                dialog.setTextAfisare(informatii.teslamodel3_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        teslamodelX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.teslamodelx_title);
                dialog.setTextAfisare(informatii.teslamodelx_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        teslamodelY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.teslamodely_title);
                dialog.setTextAfisare(informatii.teslamodely_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        daciaspring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.daciaspring_title);
                dialog.setTextAfisare(informatii.daciaspring_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        egolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.vwegolf_title);
                dialog.setTextAfisare(informatii.vwegolf_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        eup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.vweup_title);
                dialog.setTextAfisare(informatii.vweup_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.vwid3_title);
                dialog.setTextAfisare(informatii.vwid3_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        id4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.vwid4_title);
                dialog.setTextAfisare(informatii.vwid4_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        e208.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.peugeut208_title);
                dialog.setTextAfisare(informatii.peugeut208_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        e2008.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.peugeut2008_title);
                dialog.setTextAfisare(informatii.peugeut2008_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        bmwi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.BMWi3_title);
                dialog.setTextAfisare(informatii.BMWi3_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        zoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.zoe_title);
                dialog.setTextAfisare(informatii.zoe_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        kona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.kona_title);
                dialog.setTextAfisare(informatii.kona_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        ioniq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.ioniq_title);
                dialog.setTextAfisare(informatii.ioniq_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        mini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.mini_title);
                dialog.setTextAfisare(informatii.mini_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        mx30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.mx30_title);
                dialog.setTextAfisare(informatii.mx30_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        leaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.leaf_title);
                dialog.setTextAfisare(informatii.leaf_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        corsae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.opelcorsae_title);
                dialog.setTextAfisare(informatii.opelcorsae_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        mokkae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.opelmokkae_title);
                dialog.setTextAfisare(informatii.opelmokkae_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        smart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.smart_title);
                dialog.setTextAfisare(informatii.smart_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        hondae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.hondae_title);
                dialog.setTextAfisare(informatii.hondae_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
        fiat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pagina_masini_popup dialog = new pagina_masini_popup();
                dialog.setTextTitlu(informatii.fiat500_title);
                dialog.setTextAfisare(informatii.fiat500_text);
                dialog.show(getSupportFragmentManager(), "exemplu");
            }
        });
    }
}