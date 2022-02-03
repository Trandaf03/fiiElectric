package com.example.fielectric.informatii;

public class biciclete {

    public String nume;
    public String autonomie;
    public String pret;
    public String diametruRoata;
    public String motor;
    public String vitezaMax;
    public String culori;
    public int imagine;

    public biciclete(String nume, String autonomie, String motor, String diametruRoata, String vitezaMax, String culori, String pret, int imagine) {
        this.nume = nume;
        this.autonomie = autonomie;
        this.pret = pret;
        this.vitezaMax = vitezaMax;
        this.imagine = imagine;
        this.diametruRoata = diametruRoata;
        this.motor = motor;
        this.culori = culori;
    }

}
