package Ciclo05;

import java.util.Random;
import java.util.Scanner;

/*
Ejercicio 5: Reliazar un juevo para adivinar un número,
para ello generar un número aleatorio entre 0-100 y
luego ir pidiendo número indicando "Es mayor" o
"es menor" según sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos
el número de intentos hechos.
 */
public class Ciclo05Scannner {
    public static void main(String[] args) {
        // Creamos instancia Random
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        /* Generamos el numero ramdon en un intervalo de 0 a 100
        y lo guardamos como variable
         */
        int numeroAleatorio = random.nextInt(101), numero;
        System.out.println("Adivina el numero entre 0 a 100");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != numeroAleatorio) {
            if (numero>numeroAleatorio){
                System.out.println("El número es menor");
            }else {
                System.out.println("El número es mayor");
            }
            System.out.println("Intentalo otra vez");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Felicidades descrubiste el número: "+numeroAleatorio);
    }
}
