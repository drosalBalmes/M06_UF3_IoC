package com.david.solucio1;


public class Main {
    public static void main(String[] args) {

        Avio avio = new Avio("Boeing747",0);
        Aeroport aeroport = new Aeroport("Aeropuerto Josep Tarradellas Barcelona-El Prat",avio);
        System.out.println("Altura actual: " + aeroport.subir(23.3));
        System.out.println("Altura actual: " + aeroport.subir(23.4));
    }
}