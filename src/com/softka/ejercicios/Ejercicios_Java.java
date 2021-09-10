package com.softka.ejercicios;

import java.util.Scanner;

public class Ejercicios_Java {

    public String numero_mayor(double numero_1, double numero_2) {
        if (numero_1 == numero_2) return "No hay, ambos son iguales";
        else if (numero_1 > numero_2) return "Numero 1";
        return "Numero 2";
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPrecioFinal(double precioBase, double iva) {
        return precioBase + (precioBase * iva);
    }

    public boolean is_Positivo(double numero) {
        return numero > 0;
    }

    public void imprimirPares_Impares_While() {
        int numero = 1;
        String pares = "";
        String impares = "";
        while (numero <= 100) {
            if (numero % 2 == 0) pares += " " + numero;
            else impares += " " + numero;
            numero++;
        }
        System.out.println("Numeros pares: \n" + pares);
        System.out.println("Numeros impares: \n" + impares);
    }

    public void imprimirPares_Impares_For() {
        int numero;
        String pares = "";
        String impares = "";
        for (numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) pares += " " + numero;
            else impares += " " + numero;
        }
        System.out.println("Numeros pares: \n" + pares);
        System.out.println("Numeros impares: \n" + impares);
    }

    public double comprobarNumero(Scanner leer) {
        double numero;
        do {
            System.out.println("Ingrese un numero mayor o igual a cero");
            numero = leer.nextDouble();
        } while (numero < 0);
        return numero;
    }

    public void comprobarDiaLaboral(String dia) {

        switch (dia.toUpperCase()) {
            case "LUNES":
                System.out.println("Dia laboral");
                break;
            case "MARTES":
                System.out.println("Dia laboral");
                break;
            case "MIERCOLES":
                System.out.println("Dia laboral");
                break;
            case "JUEVES":
                System.out.println("Dia laboral");
                break;
            case "VIERNES":
                System.out.println("Dia laboral");
                break;
            case "SABADO":
                System.out.println("Dia NO laboral");
                break;
            case "DOMINGO":
                System.out.println("Dia NO laboral");
                break;
            default:
                System.out.println("Ingrese un dia de la semana y verifique que ha escrito "
                        + "correctamente el \nnombre del dia de la semana");
                break;
        }
    }
}
