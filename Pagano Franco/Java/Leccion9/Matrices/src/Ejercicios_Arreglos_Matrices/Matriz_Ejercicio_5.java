/*
Ejercicio 5: crear y cargar una matriz de tamaño nxm, mostrar la suma
de cad fila y de cada columna
*/
package Ejercicios_Arreglos_Matrices;

import java.util.Scanner;

public class Matriz_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][];
        int col = Integer.parseInt(entrada.nextLine());
        int fila = Integer.parseInt(entrada.nextLine());
        
        matriz = new int[fila][col];
        int filas[] = new int[fila];
        int columnas[] = new int[col];
        
        System.out.println("Rellenar la matriz: ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                if(i==j){
                    matriz[i][j] = Integer.parseInt(entrada.nextLine());
                }
            }
        }
        
        
    }
}
