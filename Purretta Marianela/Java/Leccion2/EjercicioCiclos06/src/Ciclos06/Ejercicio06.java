/*Ejercicio6 : Pedir números hasta que se ingrese un 0, sumar todos los 
números ingresados*/
package Ciclos06;

import javax.swing.JOptionPane;

public class Ejercicio06 {
    public static void main(String[] args) {
    
        int numero, suma = 0;
        do{
            System.out.println("Digite un número: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            suma += numero;
        }while(numero != 0);
        JOptionPane.showMessageDialog(null, "La Suma de todos los números ingresados es: "+suma);
    }
}
