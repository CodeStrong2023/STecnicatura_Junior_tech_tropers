package Ciclos07Scanner;

import java.util.Scanner;

/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo
y calmar la media
 */
public class Ciclos07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contador = 0, suma = 0;
        float media = 0F;
        System.out.println("Ingrese su numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {
            suma += numero;
            contador++;
            System.out.println("Ingrese otro número, si quiere salir negativo!!!!");
            numero = Integer.parseInt(entrada.nextLine());
        }
        media = (suma) / (float)contador;
        System.out.println("La media de los números ingresados es = " + media);
    }
}
