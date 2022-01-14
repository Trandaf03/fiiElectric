package com.example.fielectric.motociclete;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.fielectric.R;
import com.example.fielectric.app_related.pagina_contact;
import com.example.fielectric.app_related.pagina_despre;
import com.example.fielectric.app_related.pagina_principala;
import com.example.fielectric.app_related.pagina_setari;
import com.google.android.material.navigation.NavigationView;

public class pagina_motociclete extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_motociclete);

        Toolbar toolbar = findViewById(R.id.toolbar_motociclete);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.meniu_motociclete_drawer);
        NavigationView navigationView = findViewById(R.id.nav_view_motociclete);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.nav_drawer_open, R.string.nav_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.meniu_contact_motociclete:
                openContact();
                break;
            case R.id.meniu_setari_motociclete:
                openSettings();
                break;
            case R.id.meniu_despre_motociclete:
                openDespre();
                break;
            case R.id.go_to_prima_pagina_motociclete:
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