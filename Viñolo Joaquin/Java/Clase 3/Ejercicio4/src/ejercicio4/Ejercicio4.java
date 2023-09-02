
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    
    /*
    Ejercicio 4: Pedir números hasta que se teclee uno negativo,
    y mostrar cuántos números se han introducido
    Lo hacemos primero con la clase Scanner
    Luego lo hacemos con la clase JOptionPane
    */
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        
        int numero, conteo = 0;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        
        while(numero >= 0){
            conteo += 1;
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
         System.out.println ("La cantidad de numeros introducidos son: "+conteo);
    }
    
    
}
