
package Ciclos8;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        //Ejercicio 8:Pedir un número N, y mostrar todos los números
        //del 1 al N.
        
        int num;
        int i = 1;
        Scanner entrada = new Scanner(System.in);
        //Pedimos un número al usuario
        System.out.println("Digite un número: ");
        num = Integer.parseInt(entrada.nextLine());
        
        while(i <= num){
              System.out.println(i);
              i++;
        }
        
    }
}
