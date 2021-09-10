package com.softka.ejercicios;

public class Serie implements Entregable {

    private String titulo = "";
    private int numeroTemporadas = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "\nSerie: " + "\ntitulo=" + titulo + " \nnumeroTemporadas=" + numeroTemporadas +
                " \nentregado=" + entregado + " \ngenero=" + genero + " \ncreador=" + creador;
    }

    @Override
    public boolean entregar() {
        return Entregable.super.entregar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean devolver() {
        return Entregable.super.devolver(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEntregado(Object a) {
        return ((Serie) a).entregado;
    }

    @Override
    public int compareTo(Object a, int mayor) {

        if (((Serie) a).getNumeroTemporadas() > mayor) {
            mayor = ((Serie) a).getNumeroTemporadas();
        }
        return mayor;
    }

}

