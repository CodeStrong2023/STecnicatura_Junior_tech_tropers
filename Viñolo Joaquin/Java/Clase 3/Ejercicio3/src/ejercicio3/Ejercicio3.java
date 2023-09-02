
package ejercicio3;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio3 {

  /*
    Ejercicio3: Leer números hasta que se introduzca un cero
    Para cada uno indicar si es par o impar
    Primero lo haremos con la clase Scanner
    Luego con la clase JOptionPane
    */
    public static void main(String[] args) {
       
        //Con clase Scanner
        //Inicializamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Declaramos variables
        int numero;
        //Pedimos al usuario un número
        System.out.println("Digite un numero: " );
        
        numero = Integer.parseInt(entrada.nextLine());
        //El ciclo funcionará mientras el número ingresado sea diferente a 0
        while(numero !=0){
            if(numero %2 == 0){
                System.out.println("El numero es par" );
            }else{
                System.out.println("El numero es impar ");
            }
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
         System.out.println("El ciclo finalizo por 0" );  
         
    }
    
}
