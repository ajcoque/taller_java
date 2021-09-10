package com.softka.ejercicios;

public class Persona {
    private String nombre = "";
    private int edad = 0;
    private String DNI = "";
    private char sexo = ' ';
    private double peso = 0;
    private double altura = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = this.comprobarSexo(sexo);
        this.peso = 54;
        this.altura = 1.70;
        this.DNI = this.generarDNI();

    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = this.generarDNI();
        this.sexo = this.comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }


    public double calcularIMC() {
        double result = this.peso / (Math.pow(this.altura, 2));
        if (result < 20) {
            System.out.println(this.nombre + " está en su peso ideal");
            return -1;
        } else if (result >= 20 && result <= 25) {
            System.out.println(this.nombre + " se encuentra por debajo de su peso ideal");
            return 0;
        }
        System.out.println(this.nombre + " encuentra con sobrepeso,");
        return 1;
    }

    public boolean isMayorDeEdad() {
        return this.edad >= 18;
    }

    private char comprobarSexo(char sexo) {

        if (sexo == 'H' || sexo == 'M' || sexo == 'h' || sexo == 'm') {
            System.out.println("Identificacion de sexo correcta");
            return sexo;
        }
        System.out.println("El sexo no es correcto, se asignara por defecto H");
        return 'H';
    }

    private String generarDNI() {
        char caracteres[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N',
                'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int numeroDNI = this.generarNumeroRandom();
        char letraDNI = caracteres[numeroDNI % 23];
        return "" + letraDNI + numeroDNI;
    }

    private int generarNumeroRandom() {
        int limite = 99999999;
        int numeroAleatorio = (int) (Math.random() * limite + 1);
        return numeroAleatorio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
}
