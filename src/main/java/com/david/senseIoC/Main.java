package com.david.senseIoC;

public class Main {
    public static void main(String[] args) {


        Aeroport aeroport = new Aeroport("Aeropuerto Josep Tarradellas Barcelona-El Prat");
        System.out.println("Altura actual: " + aeroport.subir(23.3));
        System.out.println("Altura actual: " + aeroport.subir(23.4));
    }
}