/*
Ejercicio 1: Leer 5 numeros, guardarlos en un arreglo y mostrarlos
en el mismo orden introducidos.
*/
package arreglos_ejercicio_1;

import javax.swing.JOptionPane;


public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        }
        JOptionPane.showConfirmDialog(null,"Los numeros son: ");
        for(int i = 0; i < numeros.length; i++){
            JOptionPane.showConfirmDialog(null, (numeros[i]));
        }
    }
    
}
