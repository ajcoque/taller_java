package com.softka.ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Ejercicios_Java funcionesJava = new Ejercicios_Java();
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner leer = new Scanner(System.in);

        double numero_1 = 0;
        double numero_2 = 0;
        String frase = "";
        int opcion;


        do {
            System.out.println("----------------- MENU PRINCIPAL -----------------");
            System.out.println("1. PUNTO 1" + "\n2. PUNTO 2" + "\n3. PUNTO 3" + "\n4. PUNTO 4" +
                    "\n5. PUNTO 5" + "\n6. PUNTO 6" + "\n7. PUNTO 7" + "\n8. PUNTO 8" +
                    "\n9. PUNTO 9" + "\n10. PUNTO 10" + "\n11. PUNTO 11" + "\n12. PUNTO 12" +
                    "\n13. PUNTO 13" + "\n14. PUNTO 14" + "\n15. PUNTO 15" +
                    "\n16. PUNTO 16" + "\n17. PUNTO 17" + "\n18. PUNTO 18" +
                    "\n19-SALIR");
            System.out.println("***********************************************");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n1.-----------PUNTO 1---------------");
                    numero_1 = 90;
                    numero_2 = 1;
                    System.out.println("Numero 1: " + numero_1 + " Numero 2: " + numero_2);
                    System.out.println("Numero Mayor: " + funcionesJava.numero_mayor(numero_1, numero_2));
                    break;
                case 2:
                    System.out.println("\n2.------------PUNTO 2---------------");
                    try {
                        System.out.println("Ingrese numero 1: ");
                        numero_1 = leer.nextDouble();
                        System.out.println("Ingrese numero 2: ");
                        numero_2 = leer.nextDouble();
                        System.out.println("Numero Mayor: " + funcionesJava.numero_mayor(numero_1, numero_2));
                    } catch (Exception e) {
                        System.out.println("Si ingresa numeros decimales, asegurese de usar"
                                + " \ncoma y no punto para separar");
                    }
                    break;
                case 3:
                    System.out.println("\n3.---------------PUNTO 3-------------");
                    System.out.println("Ingrese radio del circulo:");
                    double radio = leer.nextDouble();
                    System.out.println("El area del circulo es: " +
                            df.format(funcionesJava.calcularAreaCirculo(radio)));
                    break;
                case 4:
                    System.out.println("\n4.---------------PUNTO 4---------------");
                    double iva = 0.21;
                    double precioBase = 0;
                    System.out.println("Ingrese precio base: ");
                    precioBase = leer.nextDouble();
                    boolean isPositivo = funcionesJava.is_Positivo(precioBase);
                    if (isPositivo) System.out.println("Precio Final: "
                            + df.format(funcionesJava.calcularPrecioFinal(precioBase, iva)));
                    else System.out.println("No se permiten precios base negativos");

                    break;
                case 5:
                    System.out.println("\n5.-----------------PUNTO 5--------------");
                    funcionesJava.imprimirPares_Impares_While();
                    break;
                case 6:
                    System.out.println("\n6.--------------PUNTO 6---------------");
                    funcionesJava.imprimirPares_Impares_For();
                    break;
                case 7:
                    System.out.println("\n7.-------------PUNTO 7----------------");
                    System.out.println("Numero mayor o igual que cero:"
                            + funcionesJava.comprobarNumero(leer));
                    break;
                case 8:
                    System.out.println("\n8.----------------PUNTO 8----------------");
                    System.out.println("Ingrese un dia de la semana: ");
                    String dia = leer.next();
                    funcionesJava.comprobarDiaLaboral(dia);
                    break;
                case 9:
                    System.out.println("\n9.----------------PUNTO 9----------------");
                    String texto = "La sonrisa sera le mejor arma contra la tristeza";
                    String textoModificado = funcionesJava.reemplazarString(texto);
                    System.out.println("Texto reemplazado: " + textoModificado);
                    System.out.println("\nIngrese texto para adicionar:");
                    String textoIngresado = leer.nextLine();
                    System.out.println("Texto final: " +
                            funcionesJava.concatenarTextos(textoModificado, textoIngresado));
                    break;
                case 10:
                    System.out.println("\n10.-----------PUNTO 10---------------");
                    System.out.println("\nIngrese frase: ");
                    frase = leer.nextLine();
                    System.out.println("Frase sin espacios: " + funcionesJava.eliminarEspacios(frase));
                    break;
                case 11:
                    System.out.println("\n11.-------------PUNTO 11--------------");
                    System.out.println("\nIngrese frase: ");
                    frase = leer.nextLine();
                    funcionesJava.contarVocales(frase);
                    break;
                case 12:
                    System.out.println("\n12.-----------PUNTO 12------------------");
                    System.out.println("Ingrese palabra 1: ");
                    String palabra_1 = leer.next();
                    System.out.println("Ingrese palabra 2: ");
                    String palabra_2 = leer.next();
                    funcionesJava.compararPalabras(palabra_1, palabra_2);
                    break;
                case 19:
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;
            }
        } while (opcion != 19);
    }

}

