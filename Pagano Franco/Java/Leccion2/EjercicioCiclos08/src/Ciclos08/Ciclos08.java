/*
Ejercicio 8: Pedir un numero N, y mostrar todos los numeros del 1 al N.
 */
package Ciclos08;

import java.util.Scanner;


public class Ciclos08 {
    public static void main(String[] args) {
        int numero, i; 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        System.out.println("Los numeros son: ");
        for (i = 1; i <= numero; i++){
            System.out.println(i);
        }
    }
}
