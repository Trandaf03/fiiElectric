package com.example.fielectric.masini;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.fielectric.R;
import com.example.fielectric.appUtil.object_presenting_adapter;
import com.example.fielectric.appUtil.object_presenting_item_data;
import com.example.fielectric.informatii.masini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class pagina_masini_rabla_v2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<object_presenting_item_data> listData;

    private enum masini_sorting {
        by_name_crescator,
        by_name_descrescator,
        by_price_crescator,
        by_price_descrescator,
        by_autonomy_crescator,
        by_autonomy_descrescator,
        random
    }

    masini_sorting sortChoice = masini_sorting.random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_masini_rabla_v2);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_pagina_masini_rabla);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listData = new ArrayList<>();
        addElementsToList();

        Spinner spinner = (Spinner) findViewById(R.id.sortare_masini);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.sortare_masini_moto, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        adapter = new object_presenting_adapter(listData, this);
        recyclerView.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(@NonNull AdapterView<?> parent, View view, int position, long id) {
        String chestie = parent.getItemAtPosition(position).toString();
        switch (chestie) {
            case "Nume crescător":
                sortChoice = masini_sorting.by_name_crescator;
                break;
            case "Nume descrescător":
                sortChoice = masini_sorting.by_name_descrescator;
                break;
            case "Autonomie crescător":
                sortChoice = masini_sorting.by_autonomy_crescator;
                break;
            case "Autonomie descrescător":
                sortChoice = masini_sorting.by_autonomy_descrescator;
                break;
            case "Preț crescător":
                sortChoice = masini_sorting.by_price_crescator;
                break;
            case "Preț descrescător":
                sortChoice = masini_sorting.by_price_descrescator;
                break;
            default:
                sortChoice = masini_sorting.random;
                break;
        }
        actualizeaza();
    }

    private void actualizeaza() {
        listData.clear();
        addElementsToList();
        switch (sortChoice) {

            case random:
                faNimic();
                break;
            case by_name_crescator:
                Collections.sort(listData, new Comparator<object_presenting_item_data>() {
                    public int compare(object_presenting_item_data o1, object_presenting_item_data o2) {
                        return o1.getTitle().compareTo(o2.getTitle());
                    }
                });
                break;
            case by_name_descrescator:
                Collections.sort(listData, new Comparator<object_presenting_item_data>() {
                    public int compare(object_presenting_item_data o1, object_presenting_item_data o2) {
                        return o2.getTitle().compareTo(o1.getTitle());
                    }
                });
                break;
            case by_autonomy_crescator:
                Collections.sort(listData, new Comparator<object_presenting_item_data>() {
                    public int compare(object_presenting_item_data o1, object_presenting_item_data o2) {
                        return o1.getText().compareTo(o2.getText());
                    }
                });
                break;
            case by_autonomy_descrescator:
                Collections.sort(listData, new Comparator<object_presenting_item_data>() {
                    public int compare(object_presenting_item_data o1, object_presenting_item_data o2) {
                        return o2.getText().compareTo(o1.getText());
                    }
                });
                break;
            case by_price_crescator:
                listData.clear();
                sortPretCrescator();
                break;
            case by_price_descrescator:
                listData.clear();
                sortPretDescrescator();
            default:
                break;
        }

        adapter = new object_presenting_adapter(listData, this);
        recyclerView.setAdapter(adapter);
    }


    private void faNimic() {

    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    private String getName(@NonNull masini masina) {
        return masina.nume;
    }

    private int getImage(@NonNull masini masina) {
        return masina.imagine;
    }

    private String getText(@NonNull masini masina) {
        return "<b>⋆Autonomie reală:</b><br> " + masina.autonomieReala + " <br>\n" +
                "<b>⋆Autonomie WLTP:</b><br> " + masina.autonomieWLTP + " <br>\n" +
                "<b>⋆Baterie:</b><br> " + masina.baterie + " <br>\n" +
                "<b>⋆Viteza maximă:</b><br> " + masina.vitezaMaxima + " <br>\n" +
                "<b>⋆Încarcare acasă:</b><br> " + masina.incarcareAcasa + " (priza 220v) <br>\n" +
                "<b>⋆Încarcare rapidă:</b><br> " + masina.incarcareRapida + " (0 - 80%) <br>\n" +
                "<b>⋆Preț:</b><br> " + masina.pret + " (fără alte dotări)\n";

    }


    private void addElementsToList() {
        object_presenting_item_data data1 = new object_presenting_item_data(getName(teslamodels), getText(teslamodels), getImage(teslamodels));
        object_presenting_item_data data2 = new object_presenting_item_data(getName(teslamodel3), getText(teslamodel3), getImage(teslamodel3));
        object_presenting_item_data data3 = new object_presenting_item_data(getName(teslamodelx), getText(teslamodelx), getImage(teslamodelx));
        object_presenting_item_data data4 = new object_presenting_item_data(getName(teslamodely), getText(teslamodely), getImage(teslamodely));
        object_presenting_item_data data5 = new object_presenting_item_data(getName(daciaspring), getText(daciaspring), getImage(daciaspring));
        object_presenting_item_data data6 = new object_presenting_item_data(getName(egolf), getText(egolf), getImage(egolf));
        object_presenting_item_data data7 = new object_presenting_item_data(getName(eup), getText(eup), getImage(eup));
        object_presenting_item_data data8 = new object_presenting_item_data(getName(id3), getText(id3), getImage(id3));
        object_presenting_item_data data9 = new object_presenting_item_data(getName(id4), getText(id4), getImage(id4));
        object_presenting_item_data data10 = new object_presenting_item_data(getName(e208), getText(e208), getImage(e208));
        object_presenting_item_data data11 = new object_presenting_item_data(getName(e2008), getText(e2008), getImage(e2008));
        object_presenting_item_data data12 = new object_presenting_item_data(getName(bmwi3), getText(bmwi3), getImage(bmwi3));
        object_presenting_item_data data13 = new object_presenting_item_data(getName(zoe), getText(zoe), getImage(zoe));
        object_presenting_item_data data14 = new object_presenting_item_data(getName(konaev), getText(konaev), getImage(konaev));
        object_presenting_item_data data15 = new object_presenting_item_data(getName(ioniq), getText(ioniq), getImage(ioniq));
        object_presenting_item_data data16 = new object_presenting_item_data(getName(cooperev), getText(cooperev), getImage(cooperev));
        object_presenting_item_data data17 = new object_presenting_item_data(getName(mx30), getText(mx30), getImage(mx30));
        object_presenting_item_data data18 = new object_presenting_item_data(getName(leaf), getText(leaf), getImage(leaf));
        object_presenting_item_data data19 = new object_presenting_item_data(getName(corsae), getText(corsae), getImage(corsae));
        object_presenting_item_data data20 = new object_presenting_item_data(getName(mokkae), getText(mokkae), getImage(mokkae));
        object_presenting_item_data data21 = new object_presenting_item_data(getName(smarfofor), getText(smarfofor), getImage(smarfofor));
        object_presenting_item_data data22 = new object_presenting_item_data(getName(hondae), getText(hondae), getImage(hondae));
        object_presenting_item_data data23 = new object_presenting_item_data(getName(fiat500), getText(fiat500), getImage(fiat500));

        listData.add(data1);
        listData.add(data2);
        listData.add(data3);
        listData.add(data4);
        listData.add(data5);
        listData.add(data6);
        listData.add(data7);
        listData.add(data8);
        listData.add(data9);
        listData.add(data10);
        listData.add(data11);
        listData.add(data12);
        listData.add(data13);
        listData.add(data14);
        listData.add(data15);
        listData.add(data16);
        listData.add(data17);
        listData.add(data18);
        listData.add(data19);
        listData.add(data20);
        listData.add(data21);
        listData.add(data22);
        listData.add(data23);

    }

    private void sortPretCrescator() {
        object_presenting_item_data data1 = new object_presenting_item_data(getName(teslamodels), getText(teslamodels), getImage(teslamodels));
        object_presenting_item_data data2 = new object_presenting_item_data(getName(teslamodel3), getText(teslamodel3), getImage(teslamodel3));
        object_presenting_item_data data3 = new object_presenting_item_data(getName(teslamodelx), getText(teslamodelx), getImage(teslamodelx));
        object_presenting_item_data data4 = new object_presenting_item_data(getName(teslamodely), getText(teslamodely), getImage(teslamodely));
        object_presenting_item_data data5 = new object_presenting_item_data(getName(daciaspring), getText(daciaspring), getImage(daciaspring));
        object_presenting_item_data data6 = new object_presenting_item_data(getName(egolf), getText(egolf), getImage(egolf));
        object_presenting_item_data data7 = new object_presenting_item_data(getName(eup), getText(eup), getImage(eup));
        object_presenting_item_data data8 = new object_presenting_item_data(getName(id3), getText(id3), getImage(id3));
        object_presenting_item_data data9 = new object_presenting_item_data(getName(id4), getText(id4), getImage(id4));
        object_presenting_item_data data10 = new object_presenting_item_data(getName(e208), getText(e208), getImage(e208));
        object_presenting_item_data data11 = new object_presenting_item_data(getName(e2008), getText(e2008), getImage(e2008));
        object_presenting_item_data data12 = new object_presenting_item_data(getName(bmwi3), getText(bmwi3), getImage(bmwi3));
        object_presenting_item_data data13 = new object_presenting_item_data(getName(zoe), getText(zoe), getImage(zoe));
        object_presenting_item_data data14 = new object_presenting_item_data(getName(konaev), getText(konaev), getImage(konaev));
        object_presenting_item_data data15 = new object_presenting_item_data(getName(ioniq), getText(ioniq), getImage(ioniq));
        object_presenting_item_data data16 = new object_presenting_item_data(getName(cooperev), getText(cooperev), getImage(cooperev));
        object_presenting_item_data data17 = new object_presenting_item_data(getName(mx30), getText(mx30), getImage(mx30));
        object_presenting_item_data data18 = new object_presenting_item_data(getName(leaf), getText(leaf), getImage(leaf));
        object_presenting_item_data data19 = new object_presenting_item_data(getName(corsae), getText(corsae), getImage(corsae));
        object_presenting_item_data data20 = new object_presenting_item_data(getName(mokkae), getText(mokkae), getImage(mokkae));
        object_presenting_item_data data21 = new object_presenting_item_data(getName(smarfofor), getText(smarfofor), getImage(smarfofor));
        object_presenting_item_data data22 = new object_presenting_item_data(getName(hondae), getText(hondae), getImage(hondae));
        object_presenting_item_data data23 = new object_presenting_item_data(getName(fiat500), getText(fiat500), getImage(fiat500));

        listData.add(data5);
        listData.add(data21);
        listData.add(data7);
        listData.add(data23);
        listData.add(data19);
        listData.add(data18);
        listData.add(data10);
        listData.add(data6);
        listData.add(data16);
        listData.add(data22);
        listData.add(data13);
        listData.add(data8);
        listData.add(data20);
        listData.add(data17);
        listData.add(data14);
        listData.add(data15);
        listData.add(data11);
        listData.add(data9);
        listData.add(data12);
        listData.add(data2);
        listData.add(data4);
        listData.add(data1);
        listData.add(data3);
    }
    private void sortPretDescrescator() {
        object_presenting_item_data data1 = new object_presenting_item_data(getName(teslamodels), getText(teslamodels), getImage(teslamodels));
        object_presenting_item_data data2 = new object_presenting_item_data(getName(teslamodel3), getText(teslamodel3), getImage(teslamodel3));
        object_presenting_item_data data3 = new object_presenting_item_data(getName(teslamodelx), getText(teslamodelx), getImage(teslamodelx));
        object_presenting_item_data data4 = new object_presenting_item_data(getName(teslamodely), getText(teslamodely), getImage(teslamodely));
        object_presenting_item_data data5 = new object_presenting_item_data(getName(daciaspring), getText(daciaspring), getImage(daciaspring));
        object_presenting_item_data data6 = new object_presenting_item_data(getName(egolf), getText(egolf), getImage(egolf));
        object_presenting_item_data data7 = new object_presenting_item_data(getName(eup), getText(eup), getImage(eup));
        object_presenting_item_data data8 = new object_presenting_item_data(getName(id3), getText(id3), getImage(id3));
        object_presenting_item_data data9 = new object_presenting_item_data(getName(id4), getText(id4), getImage(id4));
        object_presenting_item_data data10 = new object_presenting_item_data(getName(e208), getText(e208), getImage(e208));
        object_presenting_item_data data11 = new object_presenting_item_data(getName(e2008), getText(e2008), getImage(e2008));
        object_presenting_item_data data12 = new object_presenting_item_data(getName(bmwi3), getText(bmwi3), getImage(bmwi3));
        object_presenting_item_data data13 = new object_presenting_item_data(getName(zoe), getText(zoe), getImage(zoe));
        object_presenting_item_data data14 = new object_presenting_item_data(getName(konaev), getText(konaev), getImage(konaev));
        object_presenting_item_data data15 = new object_presenting_item_data(getName(ioniq), getText(ioniq), getImage(ioniq));
        object_presenting_item_data data16 = new object_presenting_item_data(getName(cooperev), getText(cooperev), getImage(cooperev));
        object_presenting_item_data data17 = new object_presenting_item_data(getName(mx30), getText(mx30), getImage(mx30));
        object_presenting_item_data data18 = new object_presenting_item_data(getName(leaf), getText(leaf), getImage(leaf));
        object_presenting_item_data data19 = new object_presenting_item_data(getName(corsae), getText(corsae), getImage(corsae));
        object_presenting_item_data data20 = new object_presenting_item_data(getName(mokkae), getText(mokkae), getImage(mokkae));
        object_presenting_item_data data21 = new object_presenting_item_data(getName(smarfofor), getText(smarfofor), getImage(smarfofor));
        object_presenting_item_data data22 = new object_presenting_item_data(getName(hondae), getText(hondae), getImage(hondae));
        object_presenting_item_data data23 = new object_presenting_item_data(getName(fiat500), getText(fiat500), getImage(fiat500));

        listData.add(data3);
        listData.add(data1);
        listData.add(data4);
        listData.add(data2);
        listData.add(data12);
        listData.add(data9);
        listData.add(data11);
        listData.add(data15);
        listData.add(data14);
        listData.add(data17);
        listData.add(data20);
        listData.add(data8);
        listData.add(data13);
        listData.add(data22);
        listData.add(data16);
        listData.add(data6);
        listData.add(data10);
        listData.add(data18);
        listData.add(data19);
        listData.add(data23);
        listData.add(data7);
        listData.add(data21);
        listData.add(data5);
    }
    private final masini teslamodels = new masini("Tesla Model S", "555/535km", "652/637km", "90kWh", "250/322km/h", "46ore", "28-60min", "€99.990/€129.990", R.drawable.masini_rabla_models);
    private final masini teslamodel3 = new masini("Tesla Model 3", "350/455/470km", "448/614/567km", "52.5/70/76kWh", "225/233/261km/h", "27/36/39ore", "20-70min", "€42,990/€51,990/€59,990", R.drawable.masini_rabla_model3);
    private final masini teslamodelx = new masini("Tesla Model X", "475/455km", "580/547km", "90kWh", "250/262km/h", "46ore", "28-60min", "€109,990/€119,990", R.drawable.masini_rabla_modelx);
    private final masini teslamodely = new masini("Tesla Model Y", "410/430km", "507/480km", "70/76kWh", "217/241km/h", "39ore", "20-70min", "€62,990/€69,990", R.drawable.masini_rabla_modely);
    private final masini daciaspring = new masini("Dacia Spring", "210km", "245km", "27.4kWh", "125km/h", "14ore", "60min", "€18.300", R.drawable.masini_rabla_spring);
    private final masini egolf = new masini("Volkswagen eGolf", "190km", "231km", "32kWh", "150km/h", "17ore", "40min", "€31.900", R.drawable.masini_rabla_egolf);
    private final masini eup = new masini("Volkswagen eUp", "205km", "260km", "32.3kWh", "130km/h", "17ore", "50min", "€21.421", R.drawable.masini_rabla_eup);
    private final masini id3 = new masini("Volkswagen ID3", "275/350/450km", "330/430/550km", "45/58/77kWh", "160km/h", "24/30/40ore", "50/64/76min", "€33.490/€36,960/€42,620", R.drawable.masini_rabla_id3);
    private final masini id4 = new masini("Volkswagen ID4", "285/410km", "360/520km", "52/77kWh", "160km/h", "27/40ore", "57/69min", "€38,450/€44,450", R.drawable.masini_rabla_id4);
    private final masini e208 = new masini("Peugeot e-208", "272km", "340km", "45kWh", "150km/h", "24ore", "43min", "€30,450", R.drawable.masini_rabla_e208);
    private final masini e2008 = new masini("Peugeot e-2008", "250km", "320km", "45kWh", "160km/h", "23ore", "43min", "€35,450", R.drawable.masini_rabla_e2008);
    private final masini bmwi3 = new masini("BMW i3", "235km", "280km", "37.9kWh", "150km/h", "19ore", "36min", "€39,000", R.drawable.masini_rabla_i3);
    private final masini zoe = new masini("Renault ZOE", "310km", "400km", "52kWh", "135km/h", "27ore", "56min", "€33,990", R.drawable.masini_rabla_zoe);
    private final masini konaev = new masini("Hyundai Kona EV", "250/395km", "350/484km", "39.2/64kWh", "155km/h", "20/33ore", "50/64min", "€34,850/€41,850", R.drawable.masini_rabla_kona);
    private final masini ioniq = new masini("Hyundai IONIQ", "250km", "311km", "38kWh", "165km/h", "20ore", "50min", "€35,350", R.drawable.masini_rabla_ioniq);
    private final masini cooperev = new masini("Mini Cooper EV", "200km", "300km", "28.9kWh", "150km/h", "15ore", "29min", "€32,500", R.drawable.masini_rabla_mini);
    private final masini mx30 = new masini("Mazda MX-30", "170km", "200km", "30kWh", "140km", "16ore", "39min", "€34,490", R.drawable.masini_rabla_mx30);
    private final masini leaf = new masini("Nissan Leaf", "225km", "378km", "37kWh", "144km/h", "19ore", "41min", "€29,990", R.drawable.masini_rabla_leaf);
    private final masini corsae = new masini("Opel Corsa-e", "275km", "337km", "45kWh", "150km/h", "23ore", "43min", "€29,000", R.drawable.masini_rabla_corsae);
    private final masini mokkae = new masini("Opel Mokka-e", "255km", "322km", "45kWh", "150km/h", "23ore", "43min", "€34,110", R.drawable.masini_rabla_mokka);
    private final masini smarfofor = new masini("Smart EQ forfour", "100km", "130km", "16.7kWh", "130km/h", "9ore", "55min", "€19,120", R.drawable.masini_rabla_smartforfor);
    private final masini hondae = new masini("Honda e", "170km", "220km", "28.5kWh", "145km/h", "15ore", "42min", "€33,850", R.drawable.masini_rabla_hondae);
    private final masini fiat500 = new masini("Fiat500 electric", "165/250km", "350/460km", "23.8/37.3kWh", "135/150km/h", "12/19ore", "26/34min", "€23,560/€27,560", R.drawable.masini_rabla_fiat500);


}