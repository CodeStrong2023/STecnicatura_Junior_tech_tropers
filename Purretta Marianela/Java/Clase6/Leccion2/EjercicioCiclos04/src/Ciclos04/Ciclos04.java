
package Ciclos04;

import java.util.Scanner;

/*Pedir números hasta que se ingrese un negativo, mostrar cuántos se han
ingresado. Clase Scanner*/
public class Ciclos04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Ingrese un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            System.out.println("El número "+numero+" es positivo");
            conteo++;
            System.out.println("Ingrese otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("La cantidad de números positivos que ingresó es: "+conteo);   
        
    }
    
}
