package com.david.senseIoC;

public class Aeroport {
    private String nom;
    private Avio avio = new Avio("Boeing747",0);

    public Aeroport(String nom) {
        this.nom = nom;
    }

    public Double subir(double alt){
        double altura = avio.subir(alt);
        return altura;
    }
}
