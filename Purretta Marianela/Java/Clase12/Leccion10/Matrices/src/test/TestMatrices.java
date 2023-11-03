package test;

import domain.Persona;

/**
 *
 * @author marianela
 */
public class TestMatrices {

    public static void main(String[] args) {
        //creamos la matriz y pasamos el tamaño
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        edades[0][0] = 5; //llenado manual de la matriz
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        //TAREA->>> LLENAR LOS QUE FALTAN
        edades[2][0] = 3;
        edades[2][1] = 6;

        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        //TAREA>>>
        System.out.println("edades 2-0 = " + edades[2][0]);
        System.out.println("edades 2-1 = " + edades[2][1]);
        System.out.println("Recorremos matriz con iterador a través de ciclo for");

        //Iterar filas y columnas:
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades " + fila + "-" + col + ": " + edades[fila][col]);

            }

        }

        //Sintáxis clásica
        //String frutas[][] = new String[3][2];
        //SINTÁXIS SIMPLIFICADA:
        String frutas[][] = {{"Limón", "Pomelo"}, {"Ciruela", "Kiwi"}, {"Banana", "Manzana"}};
        imprimir(frutas);
        
        //Recorremos la matriz
//        for (int i = 0; i < frutas.length; i++) {
//            for (int j = 0; j < frutas[i].length; j++) {
//                System.out.println("frutas " + i + "-" + j + ": " + frutas[i][j]);
//
//            }
//        }
        //Creamos la matriz de objetos
        //Importamos la clas Persona
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Marianela");
        personas[0][1] = new Persona("Sebastián");
        //TAREA>>>
        personas[0][2] = new Persona("Emir");
        personas[1][0] = new Persona("Sahir");
        personas[1][1] = new Persona("Sira");
        personas[1][2] = new Persona("Perla");
        System.out.println("Matriz de Personas: ");
        imprimir(personas);
    }
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                System.out.println("matriz " + i + "-" + j + ": " + matriz[i][j]);

            }
        }
        
    }
}
