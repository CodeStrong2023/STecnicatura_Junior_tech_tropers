package Ciclo06;


import javax.swing.*;

/*
Ejercicio 6: Pedir números hasta que se teclee un cero, mostrar
la suma de todos los números introducidos.
 */
public class ciclo06JOptionPane {
    public static void main(String[] args) {
        int numero, total = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número: "));
        while (numero != 0) {
            total = numero + total;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro número:"));
        }
        JOptionPane.showMessageDialog(null,"La sumatoria de los numeros ingresados es: " + total);

    }

}
