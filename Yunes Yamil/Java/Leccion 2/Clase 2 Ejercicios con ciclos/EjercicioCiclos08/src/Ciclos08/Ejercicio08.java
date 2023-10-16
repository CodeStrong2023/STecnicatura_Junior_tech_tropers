/*
Ejercicio 8: pedir un numero N y mostrar todos los numeros del 1 al N
Realizar con JOptionPane
*/
package Ciclos08;
import javax.swing.JOptionPane;

public class Ejercicio08 {
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int i = 1;
        while(i <= numero){
            System.out.println(i);
            JOptionPane.showMessageDialog(null,i);
            i++;
        }
    }
}
