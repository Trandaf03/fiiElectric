package com.example.fiielectric.app_related;

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
import com.example.fiielectric.appUtil.item_adapter;
import com.example.fiielectric.appUtil.item_stire_data;
import com.example.fiielectric.biciclete.pagina_biciclete;
import com.example.fiielectric.masini.pagina_masini;
import com.example.fiielectric.motociclete.pagina_motociclete;
import com.example.fiielectric.trotinete.pagina_trotinete;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class pagina_principala extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<item_stire_data> listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        listData = new ArrayList<>();
        item_stire_data test = new item_stire_data("test", "test", R.drawable.masini_rabla_corsae);
        listData.add(test);

        item_stire_data test2 = new item_stire_data("Noua Dacia Spring","BlaBlaBlahjsdhfsdjffhsdjfhdjfsdhfjsd" +
                "jfdkfjdkfjdkfhjdfkdjfkdjfkdfjdkfjdkfjdfkl;sdjgsiorhjgsruio[trhweirwejrfipwerjfgwer" +
                "df[lskdfgikopsrjtiopw4erj4w3o-irjkwe4pirfhjferwiourtjhweriprjwerijweiropjweriopwejr" +
                "rokgferijfweriojrtwerirftjerifjerifjeriproiftjerwiprjweirjweirejrierjejireirejrie",R.drawable.masini_rabla_spring);
       /* for (int i = 1; i <= 15; i++) {
            item_stire_data data = new item_stire_data("titlu " + i, "descriere");
            listData.add(data);
        }*/
        listData.add(test2);
        adapter = new item_adapter(listData, this);

        recyclerView.setAdapter(adapter);
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


}