package com.david.solucio2;

public class Logia implements Fruta{
    public String nombre;

    public Logia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String darPoder(String poder) {
        return "Fruta " + nombre + "da poder: " + poder + ", peculiaridad tipo Logia: intangibilidad";
    }
}
