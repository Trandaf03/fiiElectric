package com.example.fielectric.informatii;

public class trotinete {

    public String nume;
    public String baterie;
    public String autonomie;
    public String putere;
    public String pret;
    public int imagine;

    public trotinete(String nume, String autonomie, String baterie, String putere, String pret, int imagine) {
        this.nume = nume;
        this.baterie = baterie;
        this.autonomie = autonomie;
        this.pret = pret;
        this.putere = putere;
        this.imagine = imagine;
    }
}
