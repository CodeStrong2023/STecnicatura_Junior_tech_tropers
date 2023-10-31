/*Ej 1: Leer un número y mostrar su cuadrado, repetir hasta que 
se introduzca un nro negativo*/
package Ciclos01;

import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero, cuadrado;
        System.out.println("Ingrese un número");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){//condición mayor o igual a 0
        cuadrado = (int)Math.pow(numero, 2);//calcular el cuadrado del número
            System.out.println("El número " + numero + " elevado al cuadrado es: " +cuadrado);//mostramos el número y su cuadrado
            System.out.println("Ingrese otro número");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Fin del programa por ingreso de número negativo");
    }
}