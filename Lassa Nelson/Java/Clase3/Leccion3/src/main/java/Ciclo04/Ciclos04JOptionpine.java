package Ciclo04;

import javax.swing.*;

/*
Ejercicio 4: Pedir números hasta se teclee uno negativo,
y mostrar cuántos números se han introducido.
Lo hacemos primero con la clase Scanner
Luego lo hacemos con la clase JOptionPane
 */
public class Ciclos04JOptionpine {
    public static void main(String[] args) {
        int numero, contador=0;
        numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        while (numero>=0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es positivo");
            contador++;
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));
        }
        JOptionPane.showMessageDialog(null,"Ingreso "+contador+" números positivos");
    }
}
