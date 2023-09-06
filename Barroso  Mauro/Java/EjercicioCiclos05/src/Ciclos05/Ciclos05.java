//Ejercicio 5: Realizar un juego para adivinar un numero, para ello generar un numero aleatorio entre 0 a 100
//Luego ir pidiendo numeros indicando " es mayor" o " es menor" segun sea mayor o menor con respecto a N
//El proceso termina cuando el usuario acierta y mostramos numero de intentos hechos.

package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); //Esto genera un numero aleatorio
        do{
            System.out.println("Ingrese un numero; ");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero < aleatorio){
                System.out.println("Ingrese un numero mayor");
                }
            else if(numero > aleatorio){
                System.out.println("Ingrese un numero menor");   
            }
            else{
                System.out.println("Felicidades, encontraste el numero");   
            }
            conteo++;
        }while(numero != aleatorio);
        System.out.println("Adivinaste el numero en: "+conteo+" intentos");
    }
}
