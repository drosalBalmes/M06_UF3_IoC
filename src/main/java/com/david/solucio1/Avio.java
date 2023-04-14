package com.david.solucio1;

public class Avio {
    private String model;
    private  double altura;

    public Avio(String model, double altura) {
        this.model = model;
        this.altura = altura;
    }

    public Double subir(double alt){
        altura = altura + alt;
        return altura;
    }

    @Override
    public String toString() {
        return "Avio{" +
                "model='" + model + '\'' +
                ", altura=" + altura +
                '}';
    }
}
