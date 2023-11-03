package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);

        edades[0][0] = 5; //LLenado manual
        edades[0][1] = 7; //Es una diferente columna
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 4;
        edades[2][1] = 4;

        System.out.println("edades 0 * 0 = " + edades[0][0]);
        System.out.println("edades 0 * 1 = " + edades[0][1]);
        System.out.println("edades 1 * 0 = " + edades[1][0]);
        System.out.println("edades 1 * 1 = " + edades[1][1]);
        System.out.println("edades 2 * 0 = " + edades[2][0]);
        System.out.println("edades 2 * 1 = " + edades[2][1]);

        System.out.println("Recorremos la matris por medio del ciclo for");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades " + fila + "-" + col + ": " + edades[fila][col]);
            }

        }

        //Sintaxis clasicas
        //String frutas [][] = new String[3][2];
        //Sintaxis simplificada
        String frutas[][] = {{"Limones", "Pomelos"}, {"ciruela", "kiwi"}, {"Banana", "Manzana"}};
        imprimir(frutas);
        /*
        for (int fila = 0; fila < frutas.length; fila++) {
            for (int col = 0; col < frutas[fila].length; col++) {
                System.out.println("edades " + fila + "-" + col + ": " + frutas[fila][col]);
            }

        }
        */

        //Creamos una matriz de objetos
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Franco");
        personas[0][1] = new Persona("Juli");
        personas[0][2] = new Persona("Nelson");
        personas[1][0] = new Persona("Marianela");
        personas[1][1] = new Persona("Joaquin");
        personas[1][2] = new Persona("Yamil");
        imprimir(personas);
        
    }

    public static void imprimir(Object matriz[][]){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println("edades " + fila + "-" + col + ": " + matriz[fila][col]);
            }

        }
    }

}
