/*
Ejercicio 10: Perdir 10 numeros y escribir la suma total
Hacerlo con la clase Scanner y JOptionPane
*/
package Ciclos10;

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numero, i, suma = 0;
        for(i=1; i<=10; i++){
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el "+i+" numero: "));
        suma += numero;
        }
        JOptionPane.showMessageDialog(null,"La suma de los numeros ingresados es = " + suma);
    }
}
