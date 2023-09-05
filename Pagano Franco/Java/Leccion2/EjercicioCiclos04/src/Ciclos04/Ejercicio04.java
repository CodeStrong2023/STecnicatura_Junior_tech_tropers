/*
Ejercicio 4: Pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido.
Lo hacemos primero con clase Scanner
Luego lo hacemos con la clase JOptionPane
*/
package Ciclos04;

import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args) {
        int numero, contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null,"EL numero "+numero+" es positivo");
        contador ++;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        JOptionPane.showMessageDialog(null,"El numero "+numero+" rompe el programa");
        JOptionPane.showMessageDialog(null,"La cantidad de numeros ingresados es: " + contador);
    }
}
