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

    public String reemplazarString(String texto) {
        texto = texto.replace("A", "E");
        return texto.replace("a", "e");
    }

    public String concatenarTextos(String texto, String textoIngresado) {
        return texto.concat(" " + textoIngresado);
    }

    public String eliminarEspacios(String frase) {
        return frase.replaceAll("\\s", "");
    }

    public int mostrarLongitudCadena(String frase) {
        return frase.length();
    }

    public void contarVocales(String frase) {
        frase = frase.toLowerCase();
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        for (int i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
            }
        }
        System.out.println("Numero de la vocal a: " + contadorA +
                "\nNumero de la vocal e: " + contadorE +
                "\nNumero de la vocal i: " + contadorI +
                "\nNumero de la vocal o: " + contadorO +
                "\nNumero de la vocal u: " + contadorU);
    }

    public void compararPalabras(String palabra_1, String palabra_2) {

        if (palabra_1.equalsIgnoreCase(palabra_2)) {
            System.out.println("Las palabras son identicas");
        } else if (palabra_1.length() != palabra_2.length()) {
            System.out.println("Las palabras se diferencian en tamaño");
        } else {
            for (int i = 0; i < palabra_1.length(); i++) {
                if (palabra_1.charAt(i) != palabra_2.charAt(i)) {
                    System.out.println("Las palabras se diferencian en el caracter: " + (i + 1));
                }
            }
        }
    }
}
