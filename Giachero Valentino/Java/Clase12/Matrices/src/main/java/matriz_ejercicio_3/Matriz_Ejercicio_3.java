package matriz_ejercicio_3;
/*
Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla
 */

import java.util.Scanner;

public class Matriz_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][] = new int[3][3];


        for (int i = 0; i < 3; i++) {
            // el for interno recorre la columna de esa fila en esa
            for (int j = 0; j < 3; j++) {
                System.out.println("matiz [" + i + "][" + j + "] : ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        System.out.println();

        System.out.println("Matriz Original");
        for (int i = 0; i < matriz1.length; i++) {
            // el for interno recorre la columna de esa fila en esa
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriz Trasnpuesta");
        for (int i = 0; i < matriz1.length; i++) {
            // el for interno recorre la columna de esa fila en esa
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
