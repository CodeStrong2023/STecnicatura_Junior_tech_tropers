//Ejercicio 6: Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos
package Ciclos06;

import javax.swing.JOptionPane;

public class Ejercicios06 {
    public static void main(String[] args) {
     int numero,suma = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            suma+= numero;
        }while(numero !=0);
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros ingresdos es: "+suma);
    }
}
