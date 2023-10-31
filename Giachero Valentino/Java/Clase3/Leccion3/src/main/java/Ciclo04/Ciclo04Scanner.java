package Ciclo04;

import java.util.Scanner;

/*
Ejercicio 4: Pedir números hasta se teclee uno negativo,
y mostrar cuántos números se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionPane
 */
public class Ciclo04Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Despues de importar scaner, definimos la variable con la que trabajaremos
        int contador;
        int cantidad = 0;
        System.out.println("Ingresar numeros positivos para contarlos y negativos para terminar: ");
        contador = Integer.parseInt(entrada.nextLine());
        while (contador > 0) {
            // cantidad = cantidad + 1; # Forma larga de hacerla
            cantidad++;

            System.out.println("Ingrese Otro número positivo para contar, negativo para terminar");
            contador = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("La cantidad de números positivos son = " + cantidad);

    }
}
