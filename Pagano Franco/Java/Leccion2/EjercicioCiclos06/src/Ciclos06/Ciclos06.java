/*
Ejercicio 6: Pedir numeros hasta que se teclee un 0, mostrar
la suma de todos los numeros introducidos
*/
package Ciclos06;

import java.util.Scanner;

public class Ciclos06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese un numero: ");
        var numero = Integer.parseInt(entrada.nextLine());
        var suma = 0;
        while(numero != 0){
            suma += numero;
            System.out.println(" Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El sistema se detuvo porque ingreso un 0");
        System.out.println("La suma de los numeros ingresado es: " + suma);
    
        /*
        do[
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        ]while(numero != 0);
        System.out.println("/n La suma de todos los numeros ingresados es: " + suma);
        */
    }
}

