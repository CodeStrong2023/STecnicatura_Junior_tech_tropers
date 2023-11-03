/*
Ejercicio 2: Leer 5 numeros, guardados en un arreglo y
mostrarlo en el orden inverso al introducido.
*/
package Ejercicios_Arreglos_Matrices;

import javax.swing.JOptionPane;

public class Arreglos_Ejercicios_2 {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        }
        JOptionPane.showConfirmDialog(null,"Los numeros son: ");
        for(int i = 4; i >= 0 ; i--){
            JOptionPane.showConfirmDialog(null, (numeros[i]));
        }
    }
}
