package Ciclos04;

import javax.swing.JOptionPane;

/*Pedir números hasta que se ingrese un negativo, mostrar cuántos se han
ingresado. Clase JOptionPane*/
public class Ciclos04JOptionPane {

    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (numero >= 0) {
            JOptionPane.showMessageDialog(null, "El número que ingresó es: " + numero + " y es positivo");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        JOptionPane.showMessageDialog(null, "Usted ha ingresado " +conteo+ " números positivos");
    }

}
