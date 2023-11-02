package matriz_ejercicio_4;
/*
Ejercicio 4: Crear una matriz de tamaño 7x7 y rellenarla de forma que los
los elementos de la diagonal principal sean 1 y el resto 0
 */

public class Matriz_Ejercici_4 {
    public static void main(String[] args) {
        int diagonal[][]= new int[7][7];

        for (int fila = 0; fila < 7; fila++) {
            // el for interno recorre la columna de esa fila en esa
            for (int col = 0; col < 7; col++) {
                if (fila == col) {
                    diagonal[fila][col] = 1;
                }else {
                    diagonal[fila][col]= 0;
                }
            }
        }
        System.out.println("Matriz Diagonal");
        for (int i = 0; i < 7; i++) {
            // el for interno recorre la columna de esa fila en esa
            for (int j = 0; j < 7; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
