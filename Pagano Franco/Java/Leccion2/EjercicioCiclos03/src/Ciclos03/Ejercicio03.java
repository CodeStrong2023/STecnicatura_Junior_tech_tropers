/*
Ejercicio 3: Leer numeros hasta que se instroduzca un cero.
para cada uno indicar si es par o impar.
primero lo hacemos con la clase Scanner
luego con la clase JOptionPane
*/
package Ciclos03;

import javax.swing.JOptionPane;


public class Ejercicio03 {
    public static void main(String[] args) {
         int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while (numero != 0){
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null,"El numero ingresado " +numero+" es par");
            } 
            else {
                JOptionPane.showMessageDialog(null, "El numero ingresado "+ numero +" es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "El numero ingresado "+ numero +" finaliza el programa");
    }
}
