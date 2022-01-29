package com.example.fielectric.informatii;

public final class masini {

    public String nume;
    public String autonomieReala;
    public String autonomieWLTP;
    public String baterie;
    public String vitezaMaxima;
    public String incarcareAcasa;
    public String incarcareRapida;
    public String pret;
    public int imagine;

    public masini(String nume, String autonomieReala, String autonomieWLTP, String baterie, String vitezaMaxima, String incarcareAcasa, String incarcareRapida, String pret, int imagine){
        this.nume = nume;
        this.autonomieReala = autonomieReala;
        this.autonomieWLTP = autonomieWLTP;
        this.baterie  = baterie;
        this.vitezaMaxima = vitezaMaxima;
        this.incarcareAcasa = incarcareAcasa;
        this.incarcareRapida = incarcareRapida;
        this.pret = pret;
        this.imagine = imagine;
    }
}
