
package Ciclos01;

import javax.swing.JOptionPane;


/**
 *
 * @author lopoj
 */

/*Ejercicio 1: Leer un número y mostrar su cradrado, 
repetir el proceso hasta que se introduzca un número negativo
*/
public class Ejercicio01 {
    public static void main(String[] args) {
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero >= 0){//Mientras el número sea igual a cero o positivo
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero = " +numero+" elevado al cuadrado es: "+ cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        System.out.println("El programa a finalizado por número negativo" );
    }
}
