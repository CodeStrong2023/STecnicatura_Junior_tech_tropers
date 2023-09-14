package Ciclos08;

import java.util.Scanner;

/*
Ejercicio 8: Pedir un número N, y mostrar todos los números
del 1 al N.
 */
public class Ciclos08Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contador = 1;
        System.out.println("Ingrese un Número a contar: ");
        numero = Integer.parseInt(entrada.nextLine());
        for (; contador <= numero; contador++) {
            System.out.print(contador);
            if (contador<numero){
                System.out.print("; ");
            }
        }
    }
}
