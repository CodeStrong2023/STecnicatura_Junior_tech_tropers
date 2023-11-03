/*
 Ejercicio 5: crear y cargar una matriz de tamaño nxm, mostrar la suma
de cada fila y de cada columna
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author marianela
 */
public class matriz_ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][];
        int col = Integer.parseInt(entrada.nextLine());
        int fila = Integer.parseInt(entrada.nextLine());

        matriz = new int[fila][col];
        int filas[] = new int[fila];
        int columnas[] = new int[col];

        System.out.println("Llenar la matriz: ");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                if(i==j){
                    matriz[i][j] = Integer.parseInt(entrada.nextLine());
                }
            }
        }
    }
}
