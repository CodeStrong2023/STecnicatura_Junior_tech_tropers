/*
Ejercicio 4: crear una matriz de tamañop 7x7 y rellenarla de forma que los
elementos de la digonal sean 1 y el resto 0
*/
package Ejercicios_Arreglos_Matrices;

import java.util.Scanner;

public class Matriz_Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[7][7];
        
        //Llenamos la matriz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(i==j){
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
            
        }
        
        System.out.println("\nMatriz: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
    }
}
