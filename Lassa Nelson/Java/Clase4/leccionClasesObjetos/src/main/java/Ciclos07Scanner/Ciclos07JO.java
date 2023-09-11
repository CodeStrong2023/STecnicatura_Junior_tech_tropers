package Ciclos07Scanner;
/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo
y calmar la media
 */
import javax.swing.*;

public class Ciclos07JO {
    public static void main(String[] args) {

        int numero, contador = 0, suma = 0;
        float media = 0F;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero: "));
        while (numero >= 0) {
            suma += numero;
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número, si quiere salir negativo!!!!"));
        }
        media = (suma) / (float)contador;
        JOptionPane.showMessageDialog(null,"La media de los números ingresados es = " + media);
    }
}

