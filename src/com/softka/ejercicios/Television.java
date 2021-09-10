package com.softka.ejercicios;

public class Television extends Electrodomestico {

    private double resolucion = 20; //pulgadas
    private boolean sintonizadorTDT = false;

    public Television() {
    }

    public Television(double precio_base, double peso) {
        super(precio_base, peso);
    }

    public Television(double precio_base, String color, char consumo_energetico, double peso,
                      double resolucion, boolean sintonizadorTDT) {
        super(precio_base, color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    private double aumentoPorResolucion(double resolucion, double precioFinal) {
        double aumento = 0;

        if (resolucion > 40) aumento += (precioFinal * 0.3);
        return aumento;
    }

    private double aumentoPorSintonizador(boolean sintonizadorTDT) {
        double aumento = 0;
        if (sintonizadorTDT) aumento += 50;
        return aumento;
    }

    @Override
    public double precioFinal() {
        double precioBase = super.precioFinal();
        return precioBase + this.aumentoPorResolucion(this.resolucion, precioBase) +
                this.aumentoPorSintonizador(this.sintonizadorTDT);
    }


}


