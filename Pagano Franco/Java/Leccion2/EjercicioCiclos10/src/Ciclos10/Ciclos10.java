/*
Ejercicio 10: Perdir 10 numeros y escribir la suma total
Hacerlo con la clase Scanner y JOptionPane
*/
package Ciclos10;

import java.util.Scanner;


public class Ciclos10 {
    public static void main(String[] args) {
        int numero, i, suma = 0;
        Scanner entrada = new Scanner(System.in);
        for(i=1; i<=10; i++){
        System.out.println("Ingrese el "+i+" numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        suma += numero;
        }
        System.out.println("La suma de los numeros ingresados es = " + suma);
    }
}
