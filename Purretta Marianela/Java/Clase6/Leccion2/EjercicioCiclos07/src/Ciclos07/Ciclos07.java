/*Ejercicio7: Pedir números hasta que se introduzca un negativo y 
calcular la media*/
package Ciclos07;

import java.util.Scanner;

public class Ciclos07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float media = 0;  //inicializamos las var en 0
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) { //número sea positivo
            suma += numero;
            conteo++; //incrementamos en 1
            System.out.println("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if (conteo == 0) { //mostramos mensje de error al introducir 0
            System.out.println("\nError, La división entre cero no existe");
        } else {
            media = (float) suma / conteo;//realizamos la operación
            System.out.println("\nLa media es: " + media);
        }
    }

}
