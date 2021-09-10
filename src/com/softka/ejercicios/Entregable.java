package com.softka.ejercicios;

public interface Entregable {
    public void entregar(boolean entrega);

    default boolean devolver() {
        return false;
    }

    public boolean isEntregado(Object a);

    public int compareTo(Object a, int mayor);

}
