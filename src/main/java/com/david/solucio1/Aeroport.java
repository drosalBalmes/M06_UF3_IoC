package com.david.solucio1;

/*
fruta -> DarPoder
 */

public class Aeroport {
    private String nom;
    private Avio avio;

    public Aeroport(String nom,Avio avio) {
        this.nom = nom;
        this.avio=avio;
    }

    public Double subir(double alt){
        double altura = avio.subir(alt);
        return altura;
    }
}
