package Ciclo06;

import java.util.Scanner;

/*
Ejercicio 6: Pedir números hasta que se teclee un cero, mostrar
la suma de todos los números introducidos.
 */
public class ciclo06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, total = 0;
        System.out.println("Ingresa un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            total = numero + total;
            System.out.println("Ingresa otro número:");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("La sumatoria de los numeros ingresados es: " + total);
    }
}
