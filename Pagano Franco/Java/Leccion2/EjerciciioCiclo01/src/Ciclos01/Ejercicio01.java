/*
Ejercicio 1: Leer un numero y comprar su cuadrado, repetir
el proceso hasta que se instrduzca un numero negativo
*/
package Ciclos01;
 
import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class Ejercicio01 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int numero, cuadrado;
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
      
      while (numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero " + numero + " elevado al cuadrado es: "+ cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
     System.out.println("El programa a finalizado por numero negativo");
        
    }
}
