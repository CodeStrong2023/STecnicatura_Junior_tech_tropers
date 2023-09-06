//Pedir numeros hasta que se teclee uno negativo
//Mostrar cuantos numeros se han introducido
//Hacerlo con clase scanner y option pane

package Ciclos04;

import javax.swing.JOptionPane;

public class Ejercicio04 {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+"es POSITIVO");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "A ingresago "+conteo+" numeros que no son negativo");
    }
}
