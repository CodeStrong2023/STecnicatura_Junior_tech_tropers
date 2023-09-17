/* Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso
hasta que se introduzca un número negativo. Hacerlo sin la clase Scanner.
Usamos la clase JOptionPane
*/

package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
        int numero, cuadrado;
        
        numero  = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: ")); /*JOP Trabaja 
con tipo string, lo debemos convertir a variable Int con Integer.parseInt */
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El número " +numero+ " elevado al cuadrado es: "+cuadrado);
            numero =Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        System.out.println("El programa ha finalizado por número negativo");
    }
    
}
