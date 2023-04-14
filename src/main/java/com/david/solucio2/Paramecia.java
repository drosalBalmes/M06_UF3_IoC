package com.david.solucio2;

public class Paramecia implements Fruta{
    public String nom;

    public Paramecia(String nom) {
        this.nom = nom;
    }

    @Override
    public String darPoder(String poder) {
        return "Fruta " + nom + "da poder: " + poder + ", peculiaridad tipo Paramecia: no afecta al cuerpo";
    }
}
