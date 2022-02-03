package com.example.fielectric.biciclete;

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
import com.example.fielectric.informatii.biciclete;

import java.util.ArrayList;
import java.util.List;

public final class pagina_biciclete_prezentare extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<object_presenting_item_data> listData;

    private enum bici_sorting {
        by_name_crescator,
        by_name_descrescator,
        by_price_crescator,
        by_price_descrescator,
        by_autonomy_crescator,
        by_autonomy_descrescator,
        random
    }

    bici_sorting sortChoice = bici_sorting.random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_biciclete_prezentare);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_pagina_biciclete_electrice);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listData = new ArrayList<>();
        addRandom();

        Spinner spinner = (Spinner) findViewById(R.id.sortare_biciclete);
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
                sortChoice = bici_sorting.random;
                break;
            case "Nume crescător":
                sortChoice = bici_sorting.by_name_crescator;
                break;
            case "Nume descrescător":
                sortChoice = bici_sorting.by_name_descrescator;
                break;
            case "Autonomie crescător":
                sortChoice = bici_sorting.by_autonomy_crescator;
                break;
            case "Autonomie descrescător":
                sortChoice = bici_sorting.by_autonomy_descrescator;
                break;
            case "Preț crescător":
                sortChoice = bici_sorting.by_price_crescator;
                break;
            case "Preț descrescător":
                sortChoice = bici_sorting.by_price_descrescator;
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
        object_presenting_item_data vreiObiectulTau = new object_presenting_item_data("Vrei și alte vehicule electrice?", "" +
                "<b>Vrei ca vehiculul tău electric să apară în aplicația noastră? Atunci așteptăm un mesaj pe " +
                "Facebook-ul sau Instragramul nostru, regăsite pe pagina de contact" +
                "<br><b><br><b> Nu uita! Încă suntem la început, deci aplicația o să fie actualizată foarte des", R.drawable.ic_baseline_help_24);
        listData.add(vreiObiectulTau);

        adapter = new object_presenting_adapter(listData, this);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    private void addRandom() {
        object_presenting_item_data psuprem = new object_presenting_item_data(getName(pegassuprem), getText(pegassuprem), getImage(pegassuprem));
        object_presenting_item_data pcamp = new object_presenting_item_data(getName(pegascamping), getText(pegascamping), getImage(pegascamping));
        object_presenting_item_data pcomod = new object_presenting_item_data(getName(pegascomoda), getText(pegascomoda), getImage(pegascomoda));

        listData.add(psuprem);
        listData.add(pcamp);
        listData.add(pcomod);
    }

    private void addNumeCrescator() {
        object_presenting_item_data psuprem = new object_presenting_item_data(getName(pegassuprem), getText(pegassuprem), getImage(pegassuprem));
        object_presenting_item_data pcamp = new object_presenting_item_data(getName(pegascamping), getText(pegascamping), getImage(pegascamping));
        object_presenting_item_data pcomod = new object_presenting_item_data(getName(pegascomoda), getText(pegascomoda), getImage(pegascomoda));

        listData.add(pcamp);
        listData.add(pcomod);
        listData.add(psuprem);
    }

    private void addNumeDescrescator() {
        object_presenting_item_data psuprem = new object_presenting_item_data(getName(pegassuprem), getText(pegassuprem), getImage(pegassuprem));
        object_presenting_item_data pcamp = new object_presenting_item_data(getName(pegascamping), getText(pegascamping), getImage(pegascamping));
        object_presenting_item_data pcomod = new object_presenting_item_data(getName(pegascomoda), getText(pegascomoda), getImage(pegascomoda));

        listData.add(psuprem);
        listData.add(pcomod);
        listData.add(pcamp);
    }

    private void addAutonomieCrescator() {
        object_presenting_item_data psuprem = new object_presenting_item_data(getName(pegassuprem), getText(pegassuprem), getImage(pegassuprem));
        object_presenting_item_data pcamp = new object_presenting_item_data(getName(pegascamping), getText(pegascamping), getImage(pegascamping));
        object_presenting_item_data pcomod = new object_presenting_item_data(getName(pegascomoda), getText(pegascomoda), getImage(pegascomoda));

        listData.add(pcamp);
        listData.add(pcomod);
        listData.add(psuprem);
    }

    private void addAutonomieDescrescator() {
        object_presenting_item_data psuprem = new object_presenting_item_data(getName(pegassuprem), getText(pegassuprem), getImage(pegassuprem));
        object_presenting_item_data pcamp = new object_presenting_item_data(getName(pegascamping), getText(pegascamping), getImage(pegascamping));
        object_presenting_item_data pcomod = new object_presenting_item_data(getName(pegascomoda), getText(pegascomoda), getImage(pegascomoda));

        listData.add(psuprem);
        listData.add(pcomod);
        listData.add(pcamp);
    }

    private void addPretCrescator() {
        object_presenting_item_data psuprem = new object_presenting_item_data(getName(pegassuprem), getText(pegassuprem), getImage(pegassuprem));
        object_presenting_item_data pcamp = new object_presenting_item_data(getName(pegascamping), getText(pegascamping), getImage(pegascamping));
        object_presenting_item_data pcomod = new object_presenting_item_data(getName(pegascomoda), getText(pegascomoda), getImage(pegascomoda));

        listData.add(pcamp);
        listData.add(pcomod);
        listData.add(psuprem);

    }

    private void addPretDescrescator() {
        object_presenting_item_data psuprem = new object_presenting_item_data(getName(pegassuprem), getText(pegassuprem), getImage(pegassuprem));
        object_presenting_item_data pcamp = new object_presenting_item_data(getName(pegascamping), getText(pegascamping), getImage(pegascamping));
        object_presenting_item_data pcomod = new object_presenting_item_data(getName(pegascomoda), getText(pegascomoda), getImage(pegascomoda));


        listData.add(psuprem);
        listData.add(pcomod);
        listData.add(pcamp);
    }




    public String getName(biciclete bicicleta) {
        return bicicleta.nume;
    }

    public int getImage(biciclete bicicleta) {
        return bicicleta.imagine;
    }

    public String getText(biciclete bicicleta) {
        return "<b>⋆Autonomie:</b><br>" + bicicleta.autonomie + "<br>\n" +
                "<b>⋆Motor:</b><br>" + bicicleta.motor + "<br>\n" +
                "<b>⋆Diametru Roata:</b><br> " + bicicleta.diametruRoata + " <br>\n" +
                "<b>⋆Viteza maximă:</b><br> " + bicicleta.vitezaMax + " <br>\n" +
                "<b>⋆Culori disponibile:</b><br> " + bicicleta.culori + " <br>\n" +
                "<b>⋆Pret:</b><br> " + bicicleta.pret + " <br>\n";
    }

    private biciclete pegassuprem = new biciclete("Bicicleta Pegas Suprem", "70km", "Bafang RM G06.500.D48V500W brushless reprogramat la 250W", "26\"", "25km/h", "Roșu mat/Negru mat", "6900lei",R.drawable.biciclete_pegas_suprem);
    private biciclete pegascamping = new biciclete("Bicicleta Pegas Camping", "40km", "Bafang 220W 36V", "20\"", "?25km/h", "Negru stelar/Roșu/Alb perlat/Albastru calator", "3999lei",R.drawable.biciclete_pegas_camping);
    private biciclete pegascomoda = new biciclete("Bicicleta Pegas Comoda", "60km", "Bafang 250W 36V", "26\"", "25km/h", "Alb perlat/Galben stup", "5399lei",R.drawable.biciclete_pegas_comoda);
}