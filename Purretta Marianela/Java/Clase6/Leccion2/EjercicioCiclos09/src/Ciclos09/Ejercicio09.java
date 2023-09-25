/*
Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si es correcta
suponiendo que todos los mees son de 30 días JOptionPane
 */
package Ciclos09;

import javax.swing.JOptionPane;

public class Ejercicio09 {

    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un día"));

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes"));

        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año"));
        if ((dia != 0) && (dia <= 30)) {
            if ((mes != 0) && (mes <= 12)) {
                if ((anio != 0) && (anio <= 2023)) {
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es: " + dia + "/" + mes + "/" + anio);

                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, día incorrecto");
        }
    }
}
