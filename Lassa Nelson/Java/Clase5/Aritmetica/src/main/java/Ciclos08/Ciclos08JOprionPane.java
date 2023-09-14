package Ciclos08;


import javax.swing.*;

/*
Ejercicio 8: Pedir un número N, y mostrar todos los números
del 1 al N.
 */
public class Ciclos08JOprionPane {
    public static void main(String[] args) {

        int numero, contador = 1;
        System.out.println();
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número a contar: "));
        while (contador <= numero) {
            JOptionPane.showMessageDialog(null,contador);
            contador++;
        }
    }
}
