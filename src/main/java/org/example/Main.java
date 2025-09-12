package org.example;
public class Main {
    public static void main(String[] args) {
        Figura f1 = new Cuadrado(4.3);
        Figura f2 = new Circulo(3);
        System.out.println("Area del cuadrado es: " + f1.calcularArea());
        System.out.println("Perimetro del cuadrado es: " + f1.calcularPerimetro());
        System.out.println("Area del circulo es: " + f2.calcularArea());
        System.out.println("Perimetro del circulo es: " + f2.calcularPerimetro());


    }
}