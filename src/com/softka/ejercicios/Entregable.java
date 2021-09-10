package com.softka.ejercicios;

public interface Entregable {
    default boolean entregar() {
        return true;
    }

    default boolean devolver() {
        return false;
    }

    public boolean isEntregado(Object a);

    public int compareTo(Object a, int mayor);

}
