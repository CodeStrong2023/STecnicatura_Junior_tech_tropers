/*
Ejercicio 8: Pedir un numero N, y mostrar todos los numeros del 1 al N.
 */
package Ciclos08;

import javax.swing.JOptionPane;

public class Ejercicio08 {
    public static void main(String[] args) {
        int numero, i; 
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: "));
        JOptionPane.showMessageDialog(null,"Los numeros son: ");
        for (i = 1; i <= numero; i++){
            JOptionPane.showMessageDialog(null,i);
    }
   }
 }