package com.example.fielectric.app_related;

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
import com.example.fielectric.biciclete.pagina_biciclete;
import com.example.fielectric.masini.pagina_masini;
import com.example.fielectric.motociclete.pagina_motociclete;
import com.example.fielectric.trotinete.pagina_trotinete;
import com.google.android.material.navigation.NavigationView;

public class pagina_principala extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.naw_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.nav_drawer_open,R.string.nav_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.meniu_contact:
                openContact();
                break;
            case R.id.meniu_setari:
                openSettings();
                break;
            case R.id.meniu_despre:
                openDespre();
                break;
            case R.id.meniu_masini:
                openMasini();
                break;
            case R.id.meniu_motociclete:
                openMotociclete();
                break;
            case R.id.meniu_biciclete:
                openBiciclete();
                break;
            case R.id.meniu_trotinete:
                openTrotinete();
                break;
        }
        return true;
    }
    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        super.onBackPressed();
    }

    private void openDespre(){
        Intent intent = new Intent(this, pagina_despre.class);
        startActivity(intent);
    }
    private void openSettings(){
        Intent intent = new Intent(this, pagina_setari.class);
        startActivity(intent);
    }
    private void openContact(){
        Intent intent = new Intent(this, pagina_contact.class);
        startActivity(intent);
    }
    private void openMasini(){
        Intent intent = new Intent(this, pagina_masini.class);
        startActivity(intent);
    }
    private void openBiciclete(){
        Intent intent = new Intent(this, pagina_biciclete.class);
        startActivity(intent);
    }
    private void openMotociclete(){
        Intent intent = new Intent(this, pagina_motociclete.class);
        startActivity(intent);
    }
    private void openTrotinete(){
        Intent intent = new Intent(this, pagina_trotinete.class);
        startActivity(intent);
    }


}