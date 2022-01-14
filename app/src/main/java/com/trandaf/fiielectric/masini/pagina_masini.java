package com.trandaf.fiielectric.masini;

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
import com.trandaf.fiielectric.app_related.pagina_contact;
import com.trandaf.fiielectric.app_related.pagina_despre;
import com.trandaf.fiielectric.app_related.pagina_principala;
import com.trandaf.fiielectric.app_related.pagina_setari;
import com.google.android.material.navigation.NavigationView;

public class pagina_masini extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_masini);


        Toolbar toolbar = findViewById(R.id.toolbar_masini);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.meniu_masini_drawer);
        NavigationView navigationView = findViewById(R.id.nav_view_masini);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.nav_drawer_open, R.string.nav_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.meniu_program_rabla_masini:
                openRabla();
                break;
            case R.id.meniu_avantaje_masini:
                openAvantaje();
                break;
            case R.id.meniu_dezavantaje_masini:
                openDezavantaje();
                break;
            case R.id.meniu_calculator_masini:
                openReturnRatio();
                break;
            case R.id.go_to_prima_pagina_masini:
                openMeniuPrincipal();
                break;
            case R.id.meniu_contact_masini:
                openContact();
                break;
            case R.id.meniu_setari_masini:
                openSettings();
                break;
            case R.id.meniu_despre_masini:
                openDespre();
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

    private void openRabla() {
        Intent intent = new Intent(this, pagina_masini_rabla.class);
        startActivity(intent);
    }

    private void openAvantaje() {
        Intent intent = new Intent(this, pagina_masini_avantaje.class);
        startActivity(intent);
    }
    private void openDezavantaje(){
        Intent intent = new Intent(this,pagina_masini_dezavantaje.class);
        startActivity(intent);
    }

    private void openReturnRatio() {
        Intent intent = new Intent(this, pagina_masini_scoateBanii.class);
        startActivity(intent);
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