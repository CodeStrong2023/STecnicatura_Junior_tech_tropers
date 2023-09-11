
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {


    public static void main(String[] args) {
        
        /*
        Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar
        la suma de los números introducidos
        */
        
        int num, suma;
        
        suma = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: " );
        num = Integer.parseInt(entrada.nextLine());
        
        while(num != 0){
            suma = suma + num;
            System.out.println("Digite otro número: " );
        num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Terminó la ejecución del programa " );
        System.out.println("La suma de los números es: " + suma);
    }
    
}
