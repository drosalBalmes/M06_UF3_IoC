package com.david.solucio2;


public class Main {
    public static void main(String[] args) {

        Zoan zoan = new Zoan("Nika Nika");
        Paramecia paramecia = new Paramecia("Gura Gura");
        Logia logia = new Logia("Flame Flame");
        System.out.println(zoan.darPoder("Convertirte en humano"));
        System.out.println(paramecia.darPoder("Poder de controlar terremotos"));
        System.out.println(logia.darPoder("Poder del fuego"));
    }
}