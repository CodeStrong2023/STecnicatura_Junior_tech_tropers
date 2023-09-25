package Ciclos03;

import java.util.Scanner;

public class Ciclos03 {

/*Leer números hasta introducir 0
Para cada uno indicar si es par o impar. clase Scanner*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El número ingresado " + numero + " es par");

            } else {
                System.out.println("El número ingresado " + numero + " es impar");
            }
            System.out.println("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número ingresado es " + numero + " termina el programa");
    }
}
