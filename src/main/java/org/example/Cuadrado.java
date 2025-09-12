package org.example;

public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }


}
