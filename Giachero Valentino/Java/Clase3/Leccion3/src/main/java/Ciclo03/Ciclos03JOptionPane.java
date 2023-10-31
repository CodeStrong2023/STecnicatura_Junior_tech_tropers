package Ciclo03;

/*
Ejercicio 3: Leer números hasta que se introduzca un cero
Para cada undicar si es par o impar.
Primero lo haremnos con clase Scanner
Luego con la clase JOptionPane
*/


import javax.swing.*;

public class Ciclos03JOptionPane {
    public static void main(String[] args) {
        int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número en el ciclo do-while"));
            if (numero != 0) {
                // Expresión ternaria ? valor verdadero: valor falso
                String resultado = (numero % 2 == 0) ? "Par" : "Impar";
                JOptionPane.showMessageDialog(null,"El número " + numero + " es " + resultado);

            }

        } while (numero != 0);
        JOptionPane.showMessageDialog(null,"El número " + numero + " finaliza el programa de do-while");



        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número en ciclo while"));

        while (numero != 0) {
            if (numero % 2 == 0){
                JOptionPane.showMessageDialog(null,"El número ingresado "+numero+" es Par");

            }
            else {
                JOptionPane.showMessageDialog(null,"El número ingresado "+numero+" es Impar");

            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número ciclo while"));
        }
        JOptionPane.showMessageDialog(null,"El número " + numero + " finaliza el programa de while");
    }
}
