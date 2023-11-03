/*
Ejercicio 3: Crear y cargar una matriz de 3x3, transponerla 
y mostrarla
*/
package Ejercicios_Arreglos_Matrices;

import java.util.Scanner;

public class Matriz_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int [3][3];
        
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println("Matriz ["+fila+"]["+col+"]");
                matriz[fila][col] = entrada.nextInt();
            }

        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
