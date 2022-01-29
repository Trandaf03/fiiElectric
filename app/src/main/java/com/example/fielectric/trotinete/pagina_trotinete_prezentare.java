package com.example.fielectric.trotinete;

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
import com.example.fielectric.informatii.trotinete;
import com.example.fielectric.motociclete.pagina_motociclete_rabla;

import java.util.ArrayList;
import java.util.List;

public class pagina_trotinete_prezentare extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<object_presenting_item_data> listData;

    private enum troti_sorting {
        by_name_crescator,
        by_name_descrescator,
        by_price_crescator,
        by_price_descrescator,
        by_autonomy_crescator,
        by_autonomy_descrescator,
        random
    }

    troti_sorting sortChoice = troti_sorting.random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_trotinete_prezentare);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_pagina_trotinete);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listData = new ArrayList<>();
        addRandom();

        Spinner spinner = (Spinner) findViewById(R.id.sortare_trotinete);
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.sortare, android.R.layout.simple_spinner_item);
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
                sortChoice = troti_sorting.random;
                break;
            case "Nume crescător":
                sortChoice = troti_sorting.by_name_crescator;
                break;
            case "Nume descrescător":
                sortChoice = troti_sorting.by_name_descrescator;
                break;
            case "Autonomie crescător":
                sortChoice = troti_sorting.by_autonomy_crescator;
                break;
            case "Autonomie descrescător":
                sortChoice = troti_sorting.by_autonomy_descrescator;
                break;
            case "Preț crescător":
                sortChoice = troti_sorting.by_price_crescator;
                break;
            case "Preț descrescător":
                sortChoice = troti_sorting.by_price_descrescator;
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

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public String getName(trotinete trotineta) {
        return trotineta.nume;
    }

    public int getImage(trotinete trotineta) {
        return trotineta.imagine;
    }

    public String getText(trotinete trotineta) {
        return "<b>⋆Autonomie:</b><br>" + trotineta.autonomie + "<br>\n" +
                "<b>⋆Baterie:</b><br>" + trotineta.baterie + "<br>\n" +
                "<b>⋆Putere:</b><br> " + trotineta.putere + " <br>\n" +
                //"<b>⋆Încarcare:</b><br>" + trotineta.durataIncarcare + "<br>\n" +
                "<b>⋆Pret:</b><br> " + trotineta.pret + " <br>\n";
    }

    void addRandom() {
        object_presenting_item_data mi1s = new object_presenting_item_data(getName(xiaomimi1s), getText(xiaomimi1s), getImage(xiaomimi1s));
        object_presenting_item_data mi3 = new object_presenting_item_data(getName(xiaomimi3), getText(xiaomimi3), getImage(xiaomimi3));
        object_presenting_item_data mies = new object_presenting_item_data(getName(xiaomies), getText(xiaomies), getImage(xiaomies));
        object_presenting_item_data mipro3 = new object_presenting_item_data(getName(xiaomipro3), getText(xiaomipro3), getImage(xiaomipro3));

        listData.add(mi1s);
        listData.add(mi3);
        listData.add(mies);
        listData.add(mipro3);
    }

    private void addNumeCrescator() {
        object_presenting_item_data mi1s = new object_presenting_item_data(getName(xiaomimi1s), getText(xiaomimi1s), getImage(xiaomimi1s));
        object_presenting_item_data mi3 = new object_presenting_item_data(getName(xiaomimi3), getText(xiaomimi3), getImage(xiaomimi3));
        object_presenting_item_data mies = new object_presenting_item_data(getName(xiaomies), getText(xiaomies), getImage(xiaomies));
        object_presenting_item_data mipro3 = new object_presenting_item_data(getName(xiaomipro3), getText(xiaomipro3), getImage(xiaomipro3));

        listData.add(mi1s);
        listData.add(mi3);
        listData.add(mies);
        listData.add(mipro3);

    }

    private void addNumeDescrescator() {
        object_presenting_item_data mi1s = new object_presenting_item_data(getName(xiaomimi1s), getText(xiaomimi1s), getImage(xiaomimi1s));
        object_presenting_item_data mi3 = new object_presenting_item_data(getName(xiaomimi3), getText(xiaomimi3), getImage(xiaomimi3));
        object_presenting_item_data mies = new object_presenting_item_data(getName(xiaomies), getText(xiaomies), getImage(xiaomies));
        object_presenting_item_data mipro3 = new object_presenting_item_data(getName(xiaomipro3), getText(xiaomipro3), getImage(xiaomipro3));

        listData.add(mipro3);
        listData.add(mies);
        listData.add(mi3);
        listData.add(mi1s);
    }

    private void addAutonomieCrescator() {
        object_presenting_item_data mi1s = new object_presenting_item_data(getName(xiaomimi1s), getText(xiaomimi1s), getImage(xiaomimi1s));
        object_presenting_item_data mi3 = new object_presenting_item_data(getName(xiaomimi3), getText(xiaomimi3), getImage(xiaomimi3));
        object_presenting_item_data mies = new object_presenting_item_data(getName(xiaomies), getText(xiaomies), getImage(xiaomies));
        object_presenting_item_data mipro3 = new object_presenting_item_data(getName(xiaomipro3), getText(xiaomipro3), getImage(xiaomipro3));

        listData.add(mies);
        listData.add(mi3);
        listData.add(mi1s);
        listData.add(mipro3);
    }

    private void addAutonomieDescrescator() {
        object_presenting_item_data mi1s = new object_presenting_item_data(getName(xiaomimi1s), getText(xiaomimi1s), getImage(xiaomimi1s));
        object_presenting_item_data mi3 = new object_presenting_item_data(getName(xiaomimi3), getText(xiaomimi3), getImage(xiaomimi3));
        object_presenting_item_data mies = new object_presenting_item_data(getName(xiaomies), getText(xiaomies), getImage(xiaomies));
        object_presenting_item_data mipro3 = new object_presenting_item_data(getName(xiaomipro3), getText(xiaomipro3), getImage(xiaomipro3));

        listData.add(mipro3);
        listData.add(mi1s);
        listData.add(mi3);
        listData.add(mies);
    }

    private void addPretCrescator() {
        object_presenting_item_data mi1s = new object_presenting_item_data(getName(xiaomimi1s), getText(xiaomimi1s), getImage(xiaomimi1s));
        object_presenting_item_data mi3 = new object_presenting_item_data(getName(xiaomimi3), getText(xiaomimi3), getImage(xiaomimi3));
        object_presenting_item_data mies = new object_presenting_item_data(getName(xiaomies), getText(xiaomies), getImage(xiaomies));
        object_presenting_item_data mipro3 = new object_presenting_item_data(getName(xiaomipro3), getText(xiaomipro3), getImage(xiaomipro3));

        listData.add(mies);
        listData.add(mi1s);
        listData.add(mipro3);
        listData.add(mi3);
    }

    private void addPretDescrescator() {
        object_presenting_item_data mi1s = new object_presenting_item_data(getName(xiaomimi1s), getText(xiaomimi1s), getImage(xiaomimi1s));
        object_presenting_item_data mi3 = new object_presenting_item_data(getName(xiaomimi3), getText(xiaomimi3), getImage(xiaomimi3));
        object_presenting_item_data mies = new object_presenting_item_data(getName(xiaomies), getText(xiaomies), getImage(xiaomies));
        object_presenting_item_data mipro3 = new object_presenting_item_data(getName(xiaomipro3), getText(xiaomipro3), getImage(xiaomipro3));

        listData.add(mi3);
        listData.add(mipro3);
        listData.add(mi1s);
        listData.add(mies);
    }

    private trotinete xiaomimi1s = new trotinete("XIAOMI Mi 1S", "30km", "7800 mAh", "250W", "1600lei", R.drawable.trotinete_xiaomimi1s);
    private trotinete xiaomimi3 = new trotinete("XIAOMI Mi 3", "30km", "7650 mAh", "600W", "1900lei", R.drawable.trotinete_xiaomimi3);
    private trotinete xiaomies = new trotinete("XIAOMI Mi ESSENTIAL", "30km", "5100 mAh", "250W", "1400lei", R.drawable.trotinete_xiaomimiessential);
    private trotinete xiaomipro3 = new trotinete("XIAOMI MI PRO 2", "45km", "12800 mAh", "300W", "1900lei", R.drawable.trotinete_xiaomimipro2);

}