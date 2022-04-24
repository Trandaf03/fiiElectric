package com.example.fielectric.app_related;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.fielectric.R;
import com.example.fielectric.appUtil.app_popup;
import com.example.fielectric.appUtil.news_item_adapter;
import com.example.fielectric.appUtil.news_item_stire_data;
import com.example.fielectric.biciclete.pagina_biciclete;
import com.example.fielectric.masini.pagina_masini;
import com.example.fielectric.motociclete.pagina_motociclete;
import com.example.fielectric.trotinete.pagina_trotinete;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public final class pagina_principala extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<news_item_stire_data> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala);

        Toolbar toolbar = findViewById(R.id.toolbar_principal);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.meniu_principal_drawer);
        NavigationView navigationView = findViewById(R.id.naw_view_principal);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.nav_drawer_open, R.string.nav_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_pagina_principala);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // here goes the news
        listData = new ArrayList<>();
        news_item_stire_data test = new news_item_stire_data("test", "test", R.drawable.masini_rabla_corsae);
        listData.add(test);

        news_item_stire_data test2 = new news_item_stire_data("Noua Dacia Spring", "merge :)", R.drawable.masini_rabla_spring);
        listData.add(test2);

        news_item_stire_data test3 = new news_item_stire_data("Aici vine titlul","iar aici vine descrierea, iar acolo vine imaginea", R.drawable.masini_rabla_id3);
        listData.add(test3);

        news_item_stire_data test4 = new news_item_stire_data("Stire fara nume, cu un nume lung defapt","" +
                "poate si o descriere foarte lunga pentru a demonstra cat de lunga poate fi si o descriere, bineineles in anumite " +
                "limite exista si aici , text 100% corect gramatical daca cineva ma intreaba pe mine, sigur, imagine random", R.drawable.trotinete_xiaomimipro2);
        listData.add(test4);

        adapter = new news_item_adapter(listData, this);
        recyclerView.setAdapter(adapter);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if(sharedPreferences.getBoolean("IS_FIRST_TIME", true)) {
            popupStart("Nu uita! Aplicația este încă în dezvoltare. Dacă întâmpini probleme, nu uita să ne contactezi!");
            sharedPreferences.edit().putBoolean("IS_FIRST_TIME", false).apply();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawer.closeDrawers();
        switch (item.getItemId()) {
            case R.id.meniu_contact_principal:
                openContact();
                break;
            case R.id.meniu_setari_principal:
                openSettings();
                break;
            case R.id.meniu_despre_principal:
                openDespre();
                break;
            case R.id.meniu_masini_principal:
                openMasini();
                break;
            case R.id.meniu_motociclete_principal:
                openMotociclete();
                break;
            case R.id.meniu_biciclete_principal:
                openBiciclete();
                break;
            case R.id.meniu_trotinete_principal:
                openTrotinete();
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        super.onBackPressed();
    }

    private void openDespre() {
        Intent intent = new Intent(this, pagina_despre.class);
        startActivity(intent);
    }

    private void openSettings() {
        Intent intent = new Intent(this, pagina_setari.class);
        startActivity(intent);
    }

    private void openContact() {
        Intent intent = new Intent(this, pagina_contact.class);
        startActivity(intent);
    }

    private void openMasini() {
        Intent intent = new Intent(this, pagina_masini.class);
        startActivity(intent);
    }

    private void openBiciclete() {
        Intent intent = new Intent(this, pagina_biciclete.class);
        startActivity(intent);
    }

    private void openMotociclete() {
        Intent intent = new Intent(this, pagina_motociclete.class);
        startActivity(intent);
    }

    private void openTrotinete() {
        Intent intent = new Intent(this, pagina_trotinete.class);
        startActivity(intent);
    }

    private void popupStart(String text) {
        app_popup dialog = new app_popup();
        dialog.setTextAfisare(text);
        dialog.show(getSupportFragmentManager(), "exemplu");
    }
}