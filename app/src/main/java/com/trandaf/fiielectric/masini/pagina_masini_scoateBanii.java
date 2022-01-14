package com.trandaf.fiielectric.masini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.fielectric.R;

public class pagina_masini_scoateBanii extends AppCompatActivity {

    private ImageButton infoConsumabile;
    private EditText consum;
    private EditText consumabile;
    private EditText combustibil;
    private EditText pretMasinaElectrica;
    private EditText kmAnual;
    private CheckBox tichetRabla;
    private Button calculeaza;
    private CheckBox veziDetalii;

    private double calcul_consum = 6, calcul_consumabil = 300, calcul_combustibil = 6.5, calcul_pretMasinaElectrica, calcul_kmAnual, calcul_rezultat, calcul_consumElectric = 14;
    private boolean tichetRablaDejaPus = false, maiMulteDetalii = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_masini_scoate_banii);


        infoConsumabile = (ImageButton) findViewById(R.id.buton_masini_InfoConsumabile);
        consum = (EditText) findViewById(R.id.text_masini_scoateBanii_consumMasina);
        consumabile = (EditText) findViewById(R.id.text_masini_scoateBanii_consumabileMasina);
        combustibil = (EditText) findViewById(R.id.text_masini_scoateBanii_pretCombustibil);
        pretMasinaElectrica = (EditText) findViewById(R.id.text_masini_scoateBanii_pretMasina);
        kmAnual = (EditText) findViewById(R.id.text_masini_scoateBanii_km_anual);
        tichetRabla = (CheckBox) findViewById(R.id.checkBox_masini_scoateBanii_tichet_rabla);
        calculeaza = (Button) findViewById(R.id.buton_masini_scoateBanii_calculeaza);
        veziDetalii = (CheckBox) findViewById(R.id.checkBox_masini_scoateBanii_maiMulte);

        calculeaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp_calcul_consum, temp_calcul_consumabil, temp_calcul_combustibil;

                temp_calcul_consum = Double.parseDouble(consum.getEditableText().toString());
                temp_calcul_consumabil = Double.parseDouble(consumabile.getEditableText().toString());
                temp_calcul_combustibil = Double.parseDouble(combustibil.getEditableText().toString());
                calcul_kmAnual = Double.parseDouble(kmAnual.getEditableText().toString());
                calcul_pretMasinaElectrica = Double.parseDouble(pretMasinaElectrica.getEditableText().toString());

                if (tichetRabla.isChecked()) {
                    tichetRablaDejaPus = true;
                } else {
                    tichetRablaDejaPus = false;
                }
                if (veziDetalii.isChecked()) {
                    maiMulteDetalii = true;
                } else {
                    maiMulteDetalii = false;
                }

                if (calcul_kmAnual == 0) {
                    afisareRezultat("Completează câți kilometrii mergi anual");
                } else if (calcul_pretMasinaElectrica == 0) {
                    afisareRezultat("Completează prețul mașinii electrice");
                } else {
                    if (temp_calcul_consum != 0) {
                        calcul_consum = temp_calcul_consum;
                    }
                    if (temp_calcul_consumabil != 0) {
                        calcul_consumabil = temp_calcul_consumabil;
                    }
                    if (temp_calcul_combustibil != 0) {
                        calcul_combustibil = temp_calcul_combustibil;
                    }

                    //pret combustibil
                    calcul_rezultat = (calcul_kmAnual / 100) * calcul_consum * calcul_combustibil;
                    calcul_consumElectric = (calcul_kmAnual / 100) * 14;
                    //pret consumabile
                    calcul_rezultat = calcul_rezultat + (calcul_kmAnual / 10000) * calcul_consumabil + calcul_consumElectric;

                    // daca nu am scazut tichetul rabla, il scadem acum;
                    if (tichetRablaDejaPus == false) {
                        if (calcul_pretMasinaElectrica >= 21000) {
                            calcul_pretMasinaElectrica = calcul_pretMasinaElectrica - 10500;
                        } else {
                            calcul_pretMasinaElectrica = calcul_pretMasinaElectrica / 2;
                        }
                    }
                    // conversie pret euro lei
                    calcul_pretMasinaElectrica = calcul_pretMasinaElectrica * 5;
                    calcul_rezultat = calcul_pretMasinaElectrica / calcul_rezultat;
                    if (maiMulteDetalii == false) {
                        afisareRezultat("O să îți recuperezi banii investiți într-o mașină electrică în " + Math.round(calcul_rezultat) + " de ani");
                    } else {
                        double pret_combustibil = (calcul_kmAnual / 100) * calcul_consum * calcul_combustibil;
                        double pret_consumabile = (calcul_kmAnual / 10000) * calcul_consumabil;
                        double cheltuieli_anuale = pret_combustibil + pret_consumabile - calcul_consumElectric;
                        double recuperare_bani = Math.round(calcul_rezultat * 100) / 100;

                        afisareRezultat("Consum: " + calcul_consum + " l/100km " +
                                "\nPreț combustibil: " + calcul_combustibil + " lei" +
                                "\nPreț consumabile: " + calcul_consumabil + " lei" +
                                "\nConsum mașină electrică: 14kWh/100km" +
                                "\n" +
                                "\nPreț electricitate: " + calcul_consumElectric + "lei" +
                                "\nPreț combustibil/an: " + Math.round(pret_combustibil) +
                                "\nPreț consumabile/an: " + Math.round(pret_consumabile) +
                                "\nPreț mașina: " + Math.round(calcul_pretMasinaElectrica) + " lei" +
                                "\nCheltuieli anuale: " + Math.round(cheltuieli_anuale) + " lei" +
                                "\nO să îți recuperezi banii investiți într-o mașină electrică în " + recuperare_bani + " de ani");


                    }
                }
            }
        });

        infoConsumabile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfo();
            }
        });
    }

    private void openInfo() {
        pagina_masini_scoateBanii_dialog_consumabile dialog = new pagina_masini_scoateBanii_dialog_consumabile();
        dialog.show(getSupportFragmentManager(), "exemplu");
    }

    private void afisareRezultat(String text) {
        pagina_masini_scoateBanii_dialog_rezultat dialog = new pagina_masini_scoateBanii_dialog_rezultat();
        dialog.setTextAfisare(text);
        dialog.show(getSupportFragmentManager(), "exemplu");
    }


}