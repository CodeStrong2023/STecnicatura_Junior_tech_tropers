//Ejercicio 2: Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se introzuca un cero.

package Ciclos02;

import javax.swing.JOptionPane;

public class Ejercicios02 {
    public static void main(String[] args) {
        var numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(numero != 0){
            if(numero > 0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es Positivo");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es Negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));   
        }
        JOptionPane.showMessageDialog(null, "El numero "+numero+" finaliza el programa");
    }
    
}
