package ejercicio2;

import java.util.Scanner;

public class Ejercicio2Arreglos {

    public static void main(String[] args) {
        /*
        EJERCICIO 2: Leer 5 números, 
        guardarlos en un arreglo y 
        mostrarlos en el orden inverso
         */

        Scanner entrada = new Scanner(System.in);
        //Definimos el arreglo
        float numeros[] = new float[5];
        //Mostramos por consola 
        System.out.println("Cargamos los números en el arreglo");
        //Recorremos el arreglo y solicitamos al usuario los números
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "*Ingrese un numero: ");
            numeros[i] = entrada.nextFloat();
        }
        //Mostramos por consola los resultados
        System.out.println("\nImprimiendo los numeros en el arreglo");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" " + numeros[i]);
            System.out.println("\n");

        }
    }

}
