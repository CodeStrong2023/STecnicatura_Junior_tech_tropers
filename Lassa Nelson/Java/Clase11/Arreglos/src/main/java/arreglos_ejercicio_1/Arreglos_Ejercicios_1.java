package arreglos_ejercicio_1;
/*
Ejercicio 1: Leer 5 numeros, guardarlos en un arreglo y
mostrarlos en el mismo orden introducidos
*/

import java.util.Scanner;

public class Arreglos_Ejercicios_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglos[] = new int[5];

        for (int i = 0; i < arreglos.length; i++) {
            System.out.println("Ingres el numero " + i + " del arreglo que sea entero: ");
            arreglos[i] = entrada.nextInt();
        }
        System.out.println("El arreglo es:");
        for (int i = 0; i < arreglos.length; i++) {
            System.out.println("Arreglo en pisición "+i+" es "+arreglos[i]);
        }

        for (int i:arreglos) {
            System.out.println(i+" ");
        }
        System.out.println("\n");
    }
}
