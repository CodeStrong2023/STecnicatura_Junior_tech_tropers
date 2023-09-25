package Ciclos03;

/*Leer números hasta introducir 0
Para cada uno indicar si es par o impar. clase JOptionPane*/
import javax.swing.JOptionPane;

public class Ejercicio03 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número ingresado " + numero + " es par");
            } 
            else {
                JOptionPane.showMessageDialog(null, "El número ingresado " + numero + " es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        JOptionPane.showMessageDialog(null, "El número ingresado es " + numero + " termina el programa");
    }

 }

