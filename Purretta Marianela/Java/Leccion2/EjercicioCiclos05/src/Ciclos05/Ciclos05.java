
package Ciclos05;

import java.util.Scanner;

/*Realizar juego para adivinar un número, generando un aleatorio
entre 0-100, e ir pidiendo númerosindicando "es mayor" o "es menor"
según ocurra con respecto a N El proceso termina cdo el usuario acierta
y mostramos el número de intentos realizados*/

public class Ciclos05 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int numero, aleatorio, conteo = 0;
       aleatorio = (int)(Math.random()*100); //para generar núm aleatorios de 0 a 100
       do{
           System.out.println("Ingrese un número: ");
           numero = Integer.parseInt(entrada.nextLine());
           if(numero < aleatorio){
               System.out.println("Digite un número mayor: ");
           }
           else if(numero > aleatorio){
               System.out.println("Digite un número menor: ");
           }
           else{
               System.out.println("Felicidades, has adivinado el número");
           }
           conteo++;
       }while(numero != aleatorio);
        System.out.println("Adivinaste el número luego de "+conteo+" intentos"); 
    }
    
}
