/*Ejercicio7: Pedir números hasta que se introduzca un negativo y 
calcular la media*/
package Ciclos07;

import javax.swing.JOptionPane;

public class Ejercicio07 {

    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        float media = 0;  //inicializamos las var en 0
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (numero >= 0) { //número sea positivo
            suma += numero;
            conteo++; //incrementamos en 1
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        if (conteo == 0) { //mostramos mensje de error al introducir 0
            JOptionPane.showMessageDialog(null, "Error, La división entre cero no existe");
        } else {
            media = (float) suma / conteo;//realizamos la operación
            JOptionPane.showMessageDialog(null, "La media es: " + media);
        }
    }

}
