/*
Ejercicio 1: Leer un número y mostrar su cuadrado,
repetir el proceso hasta que se introduzca un número negativo
 */

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Definimos como entero numero y cuadrado
        int numero, cuadrado;
        // Pudimos importar la clase JOptionPane que trabaja como ventana

        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El número " + numero + " elevado al cuadrado es: " + cuadrado);
            System.out.println("Digite otro número: ");
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
        System.out.println("El programa a finalizado");
    }

}
