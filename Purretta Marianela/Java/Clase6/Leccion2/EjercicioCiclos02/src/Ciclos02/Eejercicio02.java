/*Ej 2: Leer un número e indicar si es positivo o negativo hasta introducir "0"*/
package Ciclos02;

import javax.swing.JOptionPane;

public class Eejercicio02 {

    public static void main(String[] args) {
        //clase JOptionPane  
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El número es POSITIVO");
            } else {
                JOptionPane.showMessageDialog(null, "El número es NEGATIVO");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));
        }
        JOptionPane.showMessageDialog(null, "El número " + numero + " finaliza el programa");

    }
}
//con JOptionPane ahorramos líneas de código, y ejecutamos en ventana emergente 
