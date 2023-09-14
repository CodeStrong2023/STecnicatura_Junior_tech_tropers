package Ciclos08;

import java.util.Scanner;

/*
Ejercicio 8: Pedir un número N, y mostrar todos los números
del 1 al N.
 */
public class Ciclos08ScannerProfe {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int i = 1;
        while (i<=numero){
            System.out.println(i);
            i++;
        }
    }
}
