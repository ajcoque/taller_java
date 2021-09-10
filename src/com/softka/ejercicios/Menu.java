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
                case 13:
                    System.out.println("\n13.----------------PUNTO 13----------------");
                    String formatoFecha = "yyyy/MM/dd";
                    String formatoHora = "hh:mm:ss";
                    funcionesJava.consultarFecha_Hora(formatoFecha, formatoHora);
                    break;
                case 14:
                    System.out.println("\n14.-----------------PUNTO 14--------------");
                    System.out.println("Ingresar numero inicial del incremento: ");
                    int numeroIncremento = leer.nextInt();
                    funcionesJava.incrementarDe2en2(numeroIncremento);
                    break;
                case 15:
                    System.out.println("\n15.------------PUNTO 15--------------");
                    funcionesJava.mostrarMenu(leer);
                    break;
                case 16:
                    System.out.println("\n16.-------------PUNTO 16---------------");
                    System.out.println("*************** Datos de Persona ******************");
                    System.out.println("Ingrese nombre: ");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese edad: ");
                    int edad = leer.nextInt();
                    System.out.println("Ingrese sexo, H para hombre, M para mujer: ");
                    char sexo = leer.next().charAt(0);
                    System.out.println("Ingrese peso: ");
                    double peso = leer.nextDouble();
                    System.out.println("Ingrese altura: ");
                    double altura = leer.nextDouble();

                    Persona persona_1 = new Persona(nombre, edad, sexo, peso, altura);
                    Persona persona_2 = new Persona(nombre, edad, sexo);
                    Persona persona_3 = new Persona();

                    persona_3.setNombre("Rafael");
                    persona_3.setEdad(15);
                    persona_3.setPeso(61);
                    persona_3.setAltura(1.71);

                    persona_1.calcularIMC();
                    persona_2.calcularIMC();
                    persona_3.calcularIMC();

                    System.out.println((persona_1.isMayorDeEdad()) ? "Es mayor de edad" : "No es mayor de edad");
                    System.out.println((persona_2.isMayorDeEdad()) ? "Es mayor de edad" : "No es mayor de edad");
                    System.out.println((persona_3.isMayorDeEdad()) ? "Es mayor de edad" : "No es mayor de edad");

                    System.out.println(persona_1.toString());
                    System.out.println(persona_2.toString());
                    System.out.println(persona_3.toString());
                    break;
                case 17:
                    System.out.println("\n17.---------------------PUNTO 17-------------------");
                    System.out.println("\n********************Electrodomesticos**************");
                    Electrodomestico electrodomesticos[] = new Electrodomestico[10];

                    Electrodomestico electrodomestico_1 = new Electrodomestico(20, 25);
                    Electrodomestico electrodomestico_2 = new Electrodomestico(550, "blanco", 'A', 50);
                    Electrodomestico electrodomestico_3 = new Electrodomestico(282, 29);

                    Lavadora lavadora_1 = new Lavadora(50, 20);
                    Lavadora lavadora_2 = new Lavadora(450, "GRIS", 'F', 80, 54);
                    Lavadora lavadora_3 = new Lavadora(507, 27);

                    Television televisor_1 = new Television(100, 10);
                    Television televisor_2 = new Television(804, "NEGRO", 'B', 56, 32, true);
                    Television televisor_3 = new Television(1000, 50);
                    Television televisor_4 = new Television(984, "AZUL", 'E', 16, 16, true);

                    electrodomesticos[0] = electrodomestico_1;
                    electrodomesticos[1] = lavadora_1;
                    electrodomesticos[2] = televisor_1;
                    electrodomesticos[3] = electrodomestico_2;
                    electrodomesticos[4] = lavadora_2;
                    electrodomesticos[5] = televisor_2;
                    electrodomesticos[6] = electrodomestico_3;
                    electrodomesticos[7] = lavadora_3;
                    electrodomesticos[8] = televisor_3;
                    electrodomesticos[9] = televisor_4;

                    for (int i = 0; i < electrodomesticos.length; i++) {
                        System.out.println("Electrodomestico " + (i + 1) + " Precio Base: " + electrodomesticos[i].getPrecio_base() +
                                " Peso: " + electrodomesticos[i].getPeso() + " Precio Final: " + electrodomesticos[i].precioFinal());
                    }

                    System.out.println("La suma de precios de televisores es: " + funcionesJava.sumarPreciosTelevision(electrodomesticos));
                    System.out.println("La suma de precios de lavadoras es: " + funcionesJava.sumarPreciosLavadora(electrodomesticos));
                    System.out.println("La suma de precios de electrodomesticos es: " + funcionesJava.sumarPreciosElectrodomesticos(electrodomesticos));
                    break;
                case 18:
                    System.out.println("\n18.-----------------PUNTO 18------------------");
                    Serie series[] = new Serie[5];
                    Videojuego videojuegos[] = new Videojuego[5];

                    Serie serie_1 = new Serie("Serie 1", "Creador 1");
                    Serie serie_2 = new Serie("titulo 2", 5, "terror", "creador 2");
                    Serie serie_3 = new Serie("Serie 3", "Creador 3");
                    Serie serie_4 = new Serie("titulo 4", 4, "suspenso", "creador 4");
                    Serie serie_5 = new Serie("Serie 5", "Creador 5");

                    series[0] = serie_1;
                    series[1] = serie_2;
                    series[2] = serie_3;
                    series[3] = serie_4;
                    series[4] = serie_5;

                    Videojuego videojuego_1 = new Videojuego("videojuego 1", 50);
                    Videojuego videojuego_2 = new Videojuego("videojuego 2", 10, "terror", "compania 1");
                    Videojuego videojuego_3 = new Videojuego("videojuego 3", 50);
                    Videojuego videojuego_4 = new Videojuego("videojuego 4", 10, "suspenso", "compania 4");
                    Videojuego videojuego_5 = new Videojuego("videojuego 5", 50);

                    videojuegos[0] = videojuego_1;
                    videojuegos[1] = videojuego_1;
                    videojuegos[2] = videojuego_1;
                    videojuegos[3] = videojuego_1;
                    videojuegos[4] = videojuego_1;


                    videojuegos[0].entregar(true);
                    videojuegos[1].entregar(true);
                    videojuegos[3].entregar(true);
                    series[1].entregar(true);
                    series[3].entregar(true);

                    System.out.println("Numero videojuegos entregados: "
                            + funcionesJava.contarVideojuegosEntregados(videojuegos));

                    System.out.println("Numero serie entregadas: "
                            + funcionesJava.contarSeriesEntregadas(series));

                    System.out.println("Mayor Horas: " + funcionesJava.obtenerVideojuegoMasHoras(videojuegos));
                    System.out.println("Mayor Temporadas: " + funcionesJava.obtenerSerieMasHoras(series));
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

