package ejercicio1;

import java.util.Scanner;

/*
EJERCICIO 1: Leer 5 números, 
guardarlos en un arreglo 
y mostrarlos en el orden introducidos*/
public class Ejercicio1Arreglos {
    public static void main(String[] args) {
        //Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        //Definimos el arreglo
        float[] arreglos = new float[5];
        
        System.out.println("Cargando los números en el arreglo");
        //Recorremos el arreglo
        for (int i = 0; i < 5; i++) {
            //Solicitamos los datos al usuario
            System.out.print((i + 1) + "*Ingrese un numero: ");
            arreglos[i] = entrada.nextFloat();

        }
        //Mostramos por pantalla los resultados
        System.out.println("\nImprimiendo los numeros en el arreglo");
        for (float i : arreglos) {
            System.out.println(i + " ");

        }
    }

}
