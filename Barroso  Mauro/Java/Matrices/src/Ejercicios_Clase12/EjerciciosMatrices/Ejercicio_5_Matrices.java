/*
Ejercicio 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y de cada columna
*/
package Ejercicios_Clase12.newpackage;

import java.util.Scanner;

public class Ejercicio_5_Matrices {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][],nFilas, nCol, sumaFilas, sumaCol;
        int posCol, posFila; 
        
        nFilas = Integer.parseInt(entrada.nextLine());
        nCol = Integer.parseInt(entrada.nextLine());
        int nFila = 0;
        matriz = new int[nFila][nCol];
        int filas[] = new int[nFila];
        int columnas[] = new int[nCol];
        
        System.out.println("Rellenar la matriz: ");
        for (int i = 0; i < nFila; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j]+ " ");
                
                }
            System.out.print(" ");
            }
        }
        
        
    }
