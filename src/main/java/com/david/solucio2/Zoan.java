package com.david.solucio2;

public class Zoan implements Fruta{
    public String nombre;

    public Zoan(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String darPoder(String poder) {
        return "Fruta " + nombre + "da poder: " + poder + ", peculiaridad tipo Zoan: transformación";
    }
}
