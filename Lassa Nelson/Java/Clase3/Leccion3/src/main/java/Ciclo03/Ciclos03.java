/*
Ejercicio 3: Leer números hasta que se introduzca un cero
Para cada undicar si es par o impar.
Primero lo haremnos con clase Scanner
Luego con la clase JOptionPane
*/

package Ciclo03;

import java.util.Scanner;

public class Ciclos03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingrese un número en el ciclo do-while");
            numero = Integer.parseInt(entrada.nextLine());
            if (numero != 0) {
                // Expresión ternaria ? valor verdadero: valor falso
                String resultado = (numero % 2 == 0) ? "Par" : "Impar";
                System.out.println("El número " + numero + " es " + resultado);
            }

        } while (numero != 0);
        System.out.println("El número " + numero + " finaliza el programa de do-while");

        System.out.println("Ingrese un número en ciclo while");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero % 2 == 0){
                System.out.println("El número ingresado "+numero+" es Par");
            }
            else {
                System.out.println("El número ingresado "+numero+" es Impar");
            }
            System.out.println("Digite otro número");
            numero=Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número " + numero + " finaliza el programa de while");

    }

}
