package com.example.fielectric.biciclete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.fielectric.R;
import com.example.fielectric.appUtil.news_item_stire_data;
import com.example.fielectric.app_related.pagina_contact;
import com.example.fielectric.app_related.pagina_despre;
import com.example.fielectric.app_related.pagina_principala;
import com.example.fielectric.app_related.pagina_setari;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;


public final class pagina_biciclete extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<news_item_stire_data> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_biciclete);

        Toolbar toolbar = findViewById(R.id.toolbar_biciclete);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.meniu_biciclete_drawer);
        NavigationView navigationView = findViewById(R.id.nav_view_biciclete);
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
        recyclerView.setAdapter(adapter);
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.meniu_contact_biciclete:
                openContact();
                break;
            case R.id.meniu_setari_biciclete:
                openSettings();
                break;
            case R.id.meniu_despre_biciclete:
                openDespre();
                break;
            case R.id.go_to_prima_pagina_biciclete:
                openMeniuPrincipal();
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

    private void openMeniuPrincipal() {
        Intent intent = new Intent(this, pagina_principala.class);
        startActivity(intent);
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


}