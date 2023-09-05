/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
Lo hacemos primero con clase Scanner
Luego lo hacemos con la clase JOptionPane
*/
package Ciclos04;

import java.util.Scanner;

public class Ciclos04 {
    public static void main(String[] args) {
        int numero, contador = 0;
        System.out.println("Ingrese un numero: ");
        Scanner entrada = new Scanner(System.in);
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
        contador ++;
        System.out.println("Ingrese otro numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero "+numero+" rompe el programa");
        System.out.println("La cantidad de numeros ingresados es: " + contador);
    }
 
}
