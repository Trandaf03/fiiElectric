package com.example.fielectric.motociclete;

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
import com.example.fielectric.informatii.motociclete;
import com.example.fielectric.masini.pagina_masini_rabla_v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class pagina_motociclete_rabla extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<object_presenting_item_data> listData;

    private enum moto_sorting {
        by_name_crescator,
        by_name_descrescator,
        by_price_crescator,
        by_price_descrescator,
        by_autonomy_crescator,
        by_autonomy_descrescator,
        random
    }

    moto_sorting sortChoice = moto_sorting.random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_motociclete_rabla);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_pagina_moto_rabla);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listData = new ArrayList<>();

        addRandom();


        Spinner spinner = (Spinner) findViewById(R.id.sortare_motociclete);
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
            case "Sortare după":
                sortChoice = moto_sorting.random;
                break;
            case "Nume crescător":
                sortChoice = moto_sorting.by_name_crescator;
                break;
            case "Nume descrescător":
                sortChoice = moto_sorting.by_name_descrescator;
                break;
            case "Autonomie crescător":
                sortChoice = moto_sorting.by_autonomy_crescator;
                break;
            case "Autonomie descrescător":
                sortChoice = moto_sorting.by_autonomy_descrescator;
                break;
            case "Preț crescător":
                sortChoice = moto_sorting.by_price_crescator;
                break;
            case "Preț descrescător":
                sortChoice = moto_sorting.by_price_descrescator;
                break;
        }
        actualizeaza();
    }

    private void actualizeaza() {
        listData.clear();
        switch (sortChoice) {

            case random:
                addRandom();
                break;
            case by_name_crescator:
                addNumeCrescator();
                break;
            case by_name_descrescator:
                addNumeDescrescator();
                break;
            case by_autonomy_crescator:
                addAutonomieCrescator();
                break;
            case by_autonomy_descrescator:
                addAutonomieDescrescator();
                break;
            case by_price_crescator:
                addPretCrescator();
                break;
            case by_price_descrescator:
                addPretDescrescator();
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

    public String getName(motociclete moto) {
        return moto.nume;
    }

    public int getImage(motociclete moto) {
        return moto.imagine;
    }

    public String getText(motociclete moto) {
        return "<b>⋆Autonomie:</b><br>" + moto.autonomie + "<br>\n" +
                "<b>⋆Baterie:</b><br>" + moto.baterie + "<br>\n" +
                "<b>⋆Putere:</b><br> " + moto.putere + " <br>\n" +
                "<b>⋆Încarcare:</b><br>" + moto.durataIncarcare + "<br>\n" +
                "<b>⋆Pret:</b><br> " + moto.pret + " <br>\n";
    }

    private void addRandom() {
        object_presenting_item_data data1 = new object_presenting_item_data(getName(ZeroSRF), getText(ZeroSRF), getImage(ZeroSRF));
        object_presenting_item_data data2 = new object_presenting_item_data(getName(ZeroSRS), getText(ZeroSRS), getImage(ZeroSRS));
        object_presenting_item_data data3 = new object_presenting_item_data(getName(ZeroDSR), getText(ZeroDSR), getImage(ZeroDSR));
        object_presenting_item_data data4 = new object_presenting_item_data(getName(ZeroS), getText(ZeroS), getImage(ZeroS));
        object_presenting_item_data data5 = new object_presenting_item_data(getName(ZeroFX), getText(ZeroFX), getImage(ZeroFX));
        object_presenting_item_data data6 = new object_presenting_item_data(getName(ZeroSR), getText(ZeroSR), getImage(ZeroSR));
        object_presenting_item_data data7 = new object_presenting_item_data(getName(HorwinCR6PRO), getText(HorwinCR6PRO), getImage(HorwinCR6PRO));
        object_presenting_item_data data8 = new object_presenting_item_data(getName(HorwinCR6), getText(HorwinCR6), getImage(HorwinCR6));
        object_presenting_item_data data9 = new object_presenting_item_data(getName(SuperSocoTCmax), getText(SuperSocoTCmax), getImage(SuperSocoTCmax));
        object_presenting_item_data data10 = new object_presenting_item_data(getName(HorwinEK32baterii), getText(HorwinEK32baterii), getImage(HorwinEK32baterii));
        object_presenting_item_data data11 = new object_presenting_item_data(getName(HorwinEK3), getText(HorwinEK3), getImage(HorwinEK3));
        object_presenting_item_data data12 = new object_presenting_item_data(getName(SuperSocoCPx), getText(SuperSocoCPx), getImage(SuperSocoCPx));

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
    }
    private void addNumeCrescator() {
        object_presenting_item_data data1 = new object_presenting_item_data(getName(ZeroSRF), getText(ZeroSRF), getImage(ZeroSRF));
        object_presenting_item_data data2 = new object_presenting_item_data(getName(ZeroSRS), getText(ZeroSRS), getImage(ZeroSRS));
        object_presenting_item_data data3 = new object_presenting_item_data(getName(ZeroDSR), getText(ZeroDSR), getImage(ZeroDSR));
        object_presenting_item_data data4 = new object_presenting_item_data(getName(ZeroS), getText(ZeroS), getImage(ZeroS));
        object_presenting_item_data data5 = new object_presenting_item_data(getName(ZeroFX), getText(ZeroFX), getImage(ZeroFX));
        object_presenting_item_data data6 = new object_presenting_item_data(getName(ZeroSR), getText(ZeroSR), getImage(ZeroSR));
        object_presenting_item_data data7 = new object_presenting_item_data(getName(HorwinCR6PRO), getText(HorwinCR6PRO), getImage(HorwinCR6PRO));
        object_presenting_item_data data8 = new object_presenting_item_data(getName(HorwinCR6), getText(HorwinCR6), getImage(HorwinCR6));
        object_presenting_item_data data9 = new object_presenting_item_data(getName(SuperSocoTCmax), getText(SuperSocoTCmax), getImage(SuperSocoTCmax));
        object_presenting_item_data data10 = new object_presenting_item_data(getName(HorwinEK32baterii), getText(HorwinEK32baterii), getImage(HorwinEK32baterii));
        object_presenting_item_data data11 = new object_presenting_item_data(getName(HorwinEK3), getText(HorwinEK3), getImage(HorwinEK3));
        object_presenting_item_data data12 = new object_presenting_item_data(getName(SuperSocoCPx), getText(SuperSocoCPx), getImage(SuperSocoCPx));

        listData.add(data8);
        listData.add(data7);
        listData.add(data11);
        listData.add(data10);
        listData.add(data12);
        listData.add(data9);
        listData.add(data3);
        listData.add(data5);
        listData.add(data4);
        listData.add(data6);
        listData.add(data1);
        listData.add(data2);
    }
    private void addNumeDescrescator() {
        object_presenting_item_data data1 = new object_presenting_item_data(getName(ZeroSRF), getText(ZeroSRF), getImage(ZeroSRF));
        object_presenting_item_data data2 = new object_presenting_item_data(getName(ZeroSRS), getText(ZeroSRS), getImage(ZeroSRS));
        object_presenting_item_data data3 = new object_presenting_item_data(getName(ZeroDSR), getText(ZeroDSR), getImage(ZeroDSR));
        object_presenting_item_data data4 = new object_presenting_item_data(getName(ZeroS), getText(ZeroS), getImage(ZeroS));
        object_presenting_item_data data5 = new object_presenting_item_data(getName(ZeroFX), getText(ZeroFX), getImage(ZeroFX));
        object_presenting_item_data data6 = new object_presenting_item_data(getName(ZeroSR), getText(ZeroSR), getImage(ZeroSR));
        object_presenting_item_data data7 = new object_presenting_item_data(getName(HorwinCR6PRO), getText(HorwinCR6PRO), getImage(HorwinCR6PRO));
        object_presenting_item_data data8 = new object_presenting_item_data(getName(HorwinCR6), getText(HorwinCR6), getImage(HorwinCR6));
        object_presenting_item_data data9 = new object_presenting_item_data(getName(SuperSocoTCmax), getText(SuperSocoTCmax), getImage(SuperSocoTCmax));
        object_presenting_item_data data10 = new object_presenting_item_data(getName(HorwinEK32baterii), getText(HorwinEK32baterii), getImage(HorwinEK32baterii));
        object_presenting_item_data data11 = new object_presenting_item_data(getName(HorwinEK3), getText(HorwinEK3), getImage(HorwinEK3));
        object_presenting_item_data data12 = new object_presenting_item_data(getName(SuperSocoCPx), getText(SuperSocoCPx), getImage(SuperSocoCPx));

        listData.add(data2);
        listData.add(data1);
        listData.add(data6);
        listData.add(data4);
        listData.add(data5);
        listData.add(data3);
        listData.add(data9);
        listData.add(data12);
        listData.add(data10);
        listData.add(data11);
        listData.add(data7);
        listData.add(data8);
    }
    private void addAutonomieCrescator() {
        object_presenting_item_data data1 = new object_presenting_item_data(getName(ZeroSRF), getText(ZeroSRF), getImage(ZeroSRF));
        object_presenting_item_data data2 = new object_presenting_item_data(getName(ZeroSRS), getText(ZeroSRS), getImage(ZeroSRS));
        object_presenting_item_data data3 = new object_presenting_item_data(getName(ZeroDSR), getText(ZeroDSR), getImage(ZeroDSR));
        object_presenting_item_data data4 = new object_presenting_item_data(getName(ZeroS), getText(ZeroS), getImage(ZeroS));
        object_presenting_item_data data5 = new object_presenting_item_data(getName(ZeroFX), getText(ZeroFX), getImage(ZeroFX));
        object_presenting_item_data data6 = new object_presenting_item_data(getName(ZeroSR), getText(ZeroSR), getImage(ZeroSR));
        object_presenting_item_data data7 = new object_presenting_item_data(getName(HorwinCR6PRO), getText(HorwinCR6PRO), getImage(HorwinCR6PRO));
        object_presenting_item_data data8 = new object_presenting_item_data(getName(HorwinCR6), getText(HorwinCR6), getImage(HorwinCR6));
        object_presenting_item_data data9 = new object_presenting_item_data(getName(SuperSocoTCmax), getText(SuperSocoTCmax), getImage(SuperSocoTCmax));
        object_presenting_item_data data10 = new object_presenting_item_data(getName(HorwinEK32baterii), getText(HorwinEK32baterii), getImage(HorwinEK32baterii));
        object_presenting_item_data data11 = new object_presenting_item_data(getName(HorwinEK3), getText(HorwinEK3), getImage(HorwinEK3));
        object_presenting_item_data data12 = new object_presenting_item_data(getName(SuperSocoCPx), getText(SuperSocoCPx), getImage(SuperSocoCPx));


        listData.add(data5);
        listData.add(data9);
        listData.add(data11);
        listData.add(data8);
        listData.add(data12);
        listData.add(data7);
        listData.add(data3);
        listData.add(data1);
        listData.add(data2);
        listData.add(data10);
        listData.add(data4);
        listData.add(data6);
    }
    private void addAutonomieDescrescator() {
        object_presenting_item_data data1 = new object_presenting_item_data(getName(ZeroSRF), getText(ZeroSRF), getImage(ZeroSRF));
        object_presenting_item_data data2 = new object_presenting_item_data(getName(ZeroSRS), getText(ZeroSRS), getImage(ZeroSRS));
        object_presenting_item_data data3 = new object_presenting_item_data(getName(ZeroDSR), getText(ZeroDSR), getImage(ZeroDSR));
        object_presenting_item_data data4 = new object_presenting_item_data(getName(ZeroS), getText(ZeroS), getImage(ZeroS));
        object_presenting_item_data data5 = new object_presenting_item_data(getName(ZeroFX), getText(ZeroFX), getImage(ZeroFX));
        object_presenting_item_data data6 = new object_presenting_item_data(getName(ZeroSR), getText(ZeroSR), getImage(ZeroSR));
        object_presenting_item_data data7 = new object_presenting_item_data(getName(HorwinCR6PRO), getText(HorwinCR6PRO), getImage(HorwinCR6PRO));
        object_presenting_item_data data8 = new object_presenting_item_data(getName(HorwinCR6), getText(HorwinCR6), getImage(HorwinCR6));
        object_presenting_item_data data9 = new object_presenting_item_data(getName(SuperSocoTCmax), getText(SuperSocoTCmax), getImage(SuperSocoTCmax));
        object_presenting_item_data data10 = new object_presenting_item_data(getName(HorwinEK32baterii), getText(HorwinEK32baterii), getImage(HorwinEK32baterii));
        object_presenting_item_data data11 = new object_presenting_item_data(getName(HorwinEK3), getText(HorwinEK3), getImage(HorwinEK3));
        object_presenting_item_data data12 = new object_presenting_item_data(getName(SuperSocoCPx), getText(SuperSocoCPx), getImage(SuperSocoCPx));

        listData.add(data6);
        listData.add(data4);
        listData.add(data10);
        listData.add(data2);
        listData.add(data1);
        listData.add(data3);
        listData.add(data7);
        listData.add(data12);
        listData.add(data8);
        listData.add(data11);
        listData.add(data9);
        listData.add(data5);

    }
    private void addPretCrescator() {
        object_presenting_item_data data1 = new object_presenting_item_data(getName(ZeroSRF), getText(ZeroSRF), getImage(ZeroSRF));
        object_presenting_item_data data2 = new object_presenting_item_data(getName(ZeroSRS), getText(ZeroSRS), getImage(ZeroSRS));
        object_presenting_item_data data3 = new object_presenting_item_data(getName(ZeroDSR), getText(ZeroDSR), getImage(ZeroDSR));
        object_presenting_item_data data4 = new object_presenting_item_data(getName(ZeroS), getText(ZeroS), getImage(ZeroS));
        object_presenting_item_data data5 = new object_presenting_item_data(getName(ZeroFX), getText(ZeroFX), getImage(ZeroFX));
        object_presenting_item_data data6 = new object_presenting_item_data(getName(ZeroSR), getText(ZeroSR), getImage(ZeroSR));
        object_presenting_item_data data7 = new object_presenting_item_data(getName(HorwinCR6PRO), getText(HorwinCR6PRO), getImage(HorwinCR6PRO));
        object_presenting_item_data data8 = new object_presenting_item_data(getName(HorwinCR6), getText(HorwinCR6), getImage(HorwinCR6));
        object_presenting_item_data data9 = new object_presenting_item_data(getName(SuperSocoTCmax), getText(SuperSocoTCmax), getImage(SuperSocoTCmax));
        object_presenting_item_data data10 = new object_presenting_item_data(getName(HorwinEK32baterii), getText(HorwinEK32baterii), getImage(HorwinEK32baterii));
        object_presenting_item_data data11 = new object_presenting_item_data(getName(HorwinEK3), getText(HorwinEK3), getImage(HorwinEK3));
        object_presenting_item_data data12 = new object_presenting_item_data(getName(SuperSocoCPx), getText(SuperSocoCPx), getImage(SuperSocoCPx));

        listData.add(data11);
        listData.add(data9);
        listData.add(data12);
        listData.add(data10);
        listData.add(data8);
        listData.add(data7);
        listData.add(data5);
        listData.add(data4);
        listData.add(data6);
        listData.add(data3);
        listData.add(data1);
        listData.add(data2);

    }
    private void addPretDescrescator() {
        object_presenting_item_data data1 = new object_presenting_item_data(getName(ZeroSRF), getText(ZeroSRF), getImage(ZeroSRF));
        object_presenting_item_data data2 = new object_presenting_item_data(getName(ZeroSRS), getText(ZeroSRS), getImage(ZeroSRS));
        object_presenting_item_data data3 = new object_presenting_item_data(getName(ZeroDSR), getText(ZeroDSR), getImage(ZeroDSR));
        object_presenting_item_data data4 = new object_presenting_item_data(getName(ZeroS), getText(ZeroS), getImage(ZeroS));
        object_presenting_item_data data5 = new object_presenting_item_data(getName(ZeroFX), getText(ZeroFX), getImage(ZeroFX));
        object_presenting_item_data data6 = new object_presenting_item_data(getName(ZeroSR), getText(ZeroSR), getImage(ZeroSR));
        object_presenting_item_data data7 = new object_presenting_item_data(getName(HorwinCR6PRO), getText(HorwinCR6PRO), getImage(HorwinCR6PRO));
        object_presenting_item_data data8 = new object_presenting_item_data(getName(HorwinCR6), getText(HorwinCR6), getImage(HorwinCR6));
        object_presenting_item_data data9 = new object_presenting_item_data(getName(SuperSocoTCmax), getText(SuperSocoTCmax), getImage(SuperSocoTCmax));
        object_presenting_item_data data10 = new object_presenting_item_data(getName(HorwinEK32baterii), getText(HorwinEK32baterii), getImage(HorwinEK32baterii));
        object_presenting_item_data data11 = new object_presenting_item_data(getName(HorwinEK3), getText(HorwinEK3), getImage(HorwinEK3));
        object_presenting_item_data data12 = new object_presenting_item_data(getName(SuperSocoCPx), getText(SuperSocoCPx), getImage(SuperSocoCPx));

        listData.add(data2);
        listData.add(data1);
        listData.add(data3);
        listData.add(data6);
        listData.add(data4);
        listData.add(data5);
        listData.add(data7);
        listData.add(data8);
        listData.add(data10);
        listData.add(data12);
        listData.add(data9);
        listData.add(data11);

    }


    private motociclete ZeroSRF = new motociclete("Zero SR/F", "14,4 kWh", "4h", "175KM", "82 kW", "€23.636", R.drawable.motociclete_zerosrf);
    private motociclete ZeroSRS = new motociclete("Zero SR/S", "14,4 kWh", "4h", "175KM", "81 kW", "€24.792", R.drawable.motociclete_zerosrs);
    private motociclete ZeroDSR = new motociclete("Zero DSR", "14,4 kWh", "4h", "169KM", "52 kW", "€18.640", R.drawable.motociclete_zerodsr);
    private motociclete ZeroS = new motociclete("Zero S", "11 kWh", "6h", "217KM", "44 kW", "€17.140", R.drawable.motociclete_zeros);
    private motociclete ZeroFX = new motociclete("Zero FX", "7.2 kWh", "10h", "87KM", "33 kW", "€13.515", R.drawable.motociclete_zerofx);
    private motociclete ZeroSR = new motociclete("Zero SR", "14,4 kWh", "3h", "230KM", "52 kW", "€18.640", R.drawable.motociclete_zerosr);
    private motociclete HorwinCR6PRO = new motociclete("Horwin CR6 PRO", "4.32 kWh", "3h", "142KM", "11 kW", "€7.590", R.drawable.motociclete_horwincr6pro);
    private motociclete HorwinCR6 = new motociclete("Horwin CR6", "3.96 kWh", "3h", "120KM", "7.2 kW", "€6.390", R.drawable.motociclete_horwincr6);
    private motociclete SuperSocoTCmax = new motociclete("Super Soco TCmax", "3.24 kWh", "3h", "100KM", "5 kW", "€4.890", R.drawable.motociclete_supertcmax);
    private motociclete HorwinEK32baterii = new motociclete("Horwin EK3 (două baterii)", "5.76 kW", "5h", "200KM", "7,2 kW", "€5.990", R.drawable.motociclete_horwinscuter);
    private motociclete HorwinEK3 = new motociclete("Horwin EK3", "2.88 kWh", "4h", "100KM", "5.76 kW", "€4.890", R.drawable.motociclete_horwinscuter);
    private motociclete SuperSocoCPx = new motociclete("Super Soco CPx", "2.7 kWh", "4h", "140KM", "5 kW", "€4.990", R.drawable.motociclete_supersococpx);

}