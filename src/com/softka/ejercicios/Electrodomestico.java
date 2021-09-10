package com.softka.ejercicios;

public class Electrodomestico {

    private double precio_base = 100;//€
    private String color = "blanco";//Colores disponibles: blanco, negro, rojo, azul y gris
    private char[] letrasConsumoEnergetico = {'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd', 'e', 'f'};
    private char consumo_energetico = 'F';
    private double peso = 5;//Kg

    public Electrodomestico() {
    }

    public Electrodomestico(double precio_base, double peso) {
        this.precio_base = precio_base;
        this.peso = peso;
    }

    public Electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
        this.precio_base = precio_base;
        this.color = comprobarColor(color);
        this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
        this.peso = peso;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra) {

        for (int i = this.letrasConsumoEnergetico.length-1; i >= 0; i--) {
            if (this.letrasConsumoEnergetico[i] == letra) return letra;
        }
        return this.consumo_energetico;

    }

    private String comprobarColor(String color) {
        color = color.toUpperCase();
        switch (color) {
            case "BLANCO":
                return color;
            case "NEGRO":
                return color;
            case "ROJO":
                return color;
            case "AZUL":
                return color;
            case "GRIS":
                return color;
        }
        return this.color;
    }

    public double precioFinal() {
        return this.precio_base + this.aumentoPrecioConsumoEnergetico(this.consumo_energetico)
                + this.aumentoPrecioPeso(this.peso);
    }

    private double aumentoPrecioConsumoEnergetico(char consumoEnergetico) {
        String letra = String.valueOf(consumoEnergetico);
        letra = letra.toUpperCase();
        double aumento = 0;
        switch (letra) {
            case "A":
                aumento += 100;
                break;
            case "B":
                aumento += 80;
                break;
            case "C":
                aumento += 60;
                break;
            case "D":
                aumento += 50;
                break;
            case "E":
                aumento += 30;
                break;
            case "F":
                aumento += 10;
                break;
        }
        return aumento;
    }

    private double aumentoPrecioPeso(double peso) {
        double aumento = 0;

        if (peso > 0 && peso <= 19) aumento += 10;
        else if (peso >= 20 && peso <= 49) aumento += 50;
        else if (peso >= 50 && peso <= 79) aumento += 80;
        else if (peso >= 80) aumento += 100;

        return aumento;
    }
}



