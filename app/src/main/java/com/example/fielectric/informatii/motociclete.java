package com.example.fielectric.informatii;

public final class motociclete {

    public String nume;
    public String baterie;
    public String autonomie;
    public String putere;
    public String pret;
    public String durataIncarcare;
    public int imagine;

    public motociclete(String nume, String baterie, String durataIncarcare, String autonomie, String putere, String pret, int imagine) {
        this.nume = nume;
        this.baterie = baterie;
        this.autonomie = autonomie;
        this.durataIncarcare = durataIncarcare;
        this.pret = pret;
        this.putere = putere;
        this.imagine = imagine;
    }

}
