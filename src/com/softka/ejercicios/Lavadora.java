package com.softka.ejercicios;

public class Lavadora extends Electrodomestico {

    private double carga = 5;//kg

    public Lavadora() {
    }

    public Lavadora(double precio_base, double peso) {
        super(precio_base, peso);
    }

    public Lavadora(double precio_base, String color, char consumo_energetico, double peso, double carga) {
        super(precio_base, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    private double aumentoPorCarga(double carga) {
        double aumento = 0;
        if (carga > 30) aumento += 50;
        return aumento;
    }

    @Override
    public double precioFinal() {
        return this.aumentoPorCarga(this.carga) + super.precioFinal();
    }

}
