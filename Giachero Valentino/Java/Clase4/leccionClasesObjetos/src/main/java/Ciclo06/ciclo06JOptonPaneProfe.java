package Ciclo06;


import javax.swing.*;

/*
Ejercicio 6: Pedir números hasta que se teclee un cero, mostrar
la suma de todos los números introducidos.
 */
public class ciclo06JOptonPaneProfe {
    public static void main(String[] args) {

        int numero, suma = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma += numero;
        } while (numero != 0);
        System.out.println();
        JOptionPane.showMessageDialog(null,"La suma de todos los numeros ingresados es: "+suma);
    }
}
