package arreglos_ejercicio_2;
/*
Ejercicio 2: Leer 5 números, guardarlos en un arreglo y
mostrarlos en el orden inverso al introducidos
 */

import java.util.Scanner;

public class Arreglos_Ejercicios_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float arreglos2[] = new float[5];

        System.out.println("Ingrese los valores para construir el arreglo");

        for (int i = 0; i < arreglos2.length; i++) {
            System.out.println("Ingrese el valor" + i + " = ");
            arreglos2[i] = entrada.nextFloat();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(i + " = "+arreglos2[i]);
        }
        System.out.println("\n");
    }
}
