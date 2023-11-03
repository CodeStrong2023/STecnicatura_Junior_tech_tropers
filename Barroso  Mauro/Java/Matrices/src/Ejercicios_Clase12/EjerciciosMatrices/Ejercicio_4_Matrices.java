/*
Ejercicio 4: crear una matriz de tamañop 7 x 7 y rellenarla de forma que los elementos de la diagonal sean 1 y el resto 0
*/

package Ejercicios_Clase12.newpackage;

import java.util.Scanner;

public class Ejercicio_4_Matrices {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][] = new int[7][7];
        
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
