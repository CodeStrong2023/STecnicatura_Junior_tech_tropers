/*
Ejercicio 1: Leer un número y mostrar su cuadrado,
repetir el proceso hasta que se introduzca un número negativo
 */
import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {
        // Definimos el scaner para ingresar números
        Scanner entrada = new Scanner(System.in);

        //Definimos como entero numero y cuadrado
        int numero, cuadrado;
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El número " + numero + " elevado al cuadrado es: " + cuadrado);
            System.out.println("Digite otro número: ");
            numero= Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El programa a finalizado");
    }
}
