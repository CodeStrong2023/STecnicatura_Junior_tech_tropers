/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y 
luego ir pidiendo numeros indicando "es mayor" o "es
menor" segun sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostramos
el numero de intentos hechos. 
 */
package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int numero, contador = 0, aleatorio;
       aleatorio = (int)(Math.random()*100); //Esto genera un numero aleatorio
       System.out.println("Ingrese un numero: "); 
       do{
            numero = Integer.parseInt(entrada.nextLine());
            if (numero < aleatorio) {
                    System.out.println("Ingrese un numero mayor: ");
            } 
            else if(numero > aleatorio){
                System.out.println("Ingrese un numero menor: ");
            } 
            else{
                System.out.println("TENEMOS UN GANADOR");
            }
            contador ++;
           } while(numero != aleatorio);
           System.out.println("Adivinaste el numero en: "+ contador+" intentos");
       }
    }
