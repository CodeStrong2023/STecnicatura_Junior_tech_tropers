/*
 Ejercicio 5: Realizar un juego para adivinar un numero, para ello
generar un numero aleatorio entre 0-100 y luego ir pidiendo numeros
indicando "es mayor" o "es menor" segun sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostramos el numero de intentos 
hechos.
 */
package Ciclos05;

import java.util.Scanner;

public class Ciclos05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); // Se genera un num aleatorio
        do {
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            if(numero < aleatorio){
                System.out.println("Digite un numero MAYOR");
            }
            else if (numero > aleatorio){
                System.out.println("Digite un numero MENOR");
            }
            else{
                System.out.println("¡¡FELICIDADES!! Has adivinado el numero");
            }
            conteo++;
        } while (numero != aleatorio);
        
        System.out.println("Adivinaste el numero en: "+conteo+" intentos");
    }
    
}
