package matriz_ejercicio_5;
/*
Ejercicio 5: Crear y cargar una matriz de un tamaño n x m, mostrar la suma
de cada fila y de cada columna.
 */

import java.util.Scanner;

public class matriz_ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Variables a utilizar
        int nFilas, nCol, sumaCol = 0, sumaFila = 0;
        int posFila, posCol;
        System.out.println("Ingresa la cantidad de filas");
        nFilas = entrada.nextInt();
        System.out.println("Ingresa la cantidad de colunas");
        nCol = entrada.nextInt();
        int matriz5[][] = new int[nFilas][nCol];
        int filas[] = new int[nFilas];
        int columnas[] = new int[nCol];

        System.out.println("Hora de cargar la Matriz");
        for (int i = 0; i < nFilas; i++) {

            for (int j = 0; j < nCol; j++) {
                System.out.print("Valor " + i + "-" + j + " : ");
                matriz5[i][j] = entrada.nextInt();
            }

        }
        System.out.println("Matriz Original");
        for (int i = 0; i < nFilas; i++) {
            // el for interno recorre la columna de esa fila en esa
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz5[i][j] + " ");
            }
            System.out.println();
        }

        // Sumando las filas
        posFila = 0;
        for (int i = 0; i < nFilas; i++) {
            sumaFila = 0;
            for (int j = 0; j < nCol; j++) {

                sumaFila += matriz5[i][j];
            }
            filas[posFila] = sumaFila;
            posFila++;
        }
        // Sumando columnas
        posCol = 0;
        for (int i = 0; i < nCol; i++) {
            sumaFila = 0;
            for (int j = 0; j < nFilas; j++) {

                sumaCol += matriz5[i][j];
            }
            columnas[posCol] = sumaCol;
            posCol++;
        }
        System.out.println(" la suma de las filas es: ");
        for (int i = 0; i< nFilas;i++){
            System.out.print(filas[i]+"-");
        }
        System.out.println(" ");
        System.out.println(" la suma de las columnas es: ");
        for (int i = 0; i< nCol;i++){
            System.out.print(columnas[i]+"-");
        }
        System.out.println(" ");

    }
}
