package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4Matrices {
    /*
    Ejercicio 4: Crear una matriz de tamaño 7x7 y relenarla de forma 
    que los elementos de la diagonal principal sean 1 y el resto 0.
    */

    public static void main(String[] args) {
        //Instanciamos la clase scanner
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[7][7];

            //Completamos la matriz
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (i==j) {
                        matriz[i][j] = 1;
                    }else{
                        matriz[i][j] = 0;
                    }
                }

            }
            //Mostramos por consola la matriz
            System.out.println("\n La Matriz es: ");
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.println(matriz[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
}
