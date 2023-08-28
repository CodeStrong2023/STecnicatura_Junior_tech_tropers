/*
Ejercicio 2: Leer un numero e indicar si es positivo o negativo.
El proceso se repetira hasta que se intrudizca un cero.
Hacer este ejercicio con la clase Scanner.
Luego hacerlo nuevamente con la clase JOptionPane.
*/
package Ciclos02;

import javax.swing.JOptionPane;


public class Ejercicio02 {
    public static void main(String[] args) {
        int numero; 
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (numero != 0){
            if (numero > 0) {
                System.out.println("El numero "+numero+" es positivo");
            } 
            else{
                System.out.println("El numero "+ numero + " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        System.out.println("Se introdujo un cero");
    }
   }
