
package Ciclos01;

import java.util.Scanner;

/*
Ejercicio 1: Leer un numero y comprar su cuadrado, repetir
el proceso hasta que se instrduzca un numero negativo
*/

public class Ciclo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado;
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es: "+ cuadrado);
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El programa a finalizado por numero negativo");
        
    }
}

