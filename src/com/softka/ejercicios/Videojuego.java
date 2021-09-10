package com.softka.ejercicios;

public class Videojuego implements Entregable {

    private String titulo = "";
    private int horas_estimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";

    public Videojuego() {
    }

    public Videojuego(String titulo, int horas_estimadas) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
    }

    public Videojuego(String titulo, int horas_estimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "\nVideojuego: " + "\ntitulo=" + titulo + " \nhoras_estimadas=" +
                horas_estimadas + " \nentregado=" + entregado + " \ngenero=" + genero +
                " \ncompania=" + compania;
    }

    @Override
    public void entregar(boolean entrega) {
        this.entregado = entrega;
    }

    @Override
    public boolean devolver() {
        return Entregable.super.devolver();
    }

    @Override
    public boolean isEntregado(Object a) {
        return ((Videojuego) a).entregado;
    }

    @Override
    public int compareTo(Object a, int mayor) {
        if (((Videojuego) a).getHoras_estimadas() > mayor) {
            mayor = ((Videojuego) a).getHoras_estimadas();
        }
        return mayor;
    }


}
