/*
  EJERCICIO 2: Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden inverso*/
package ejercicio2;

/**
 *
 * @author maria
 */
import java.util.Scanner;

public class Ejercicio_2_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros []= new float[5];

        System.out.println("Cargando arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Ingrese un numero: ");
            numeros[i] = entrada.nextFloat();
        }
        System.out.println("\nImprimir los numeros en el arreglo");
        for (int i=4; i>=0; i--) {
            System.out.print(" "+ numeros[i]);
            System.out.println("\n");

        }
    }

}
