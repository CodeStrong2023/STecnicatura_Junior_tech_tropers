/*Ejercicio11: Diseñar un programa que muestre el producto de los 10 primeros 
números impares-JOptionPane*/
package ciclos11;

import javax.swing.JOptionPane;

public class Ciclos11 {

    public static void main(String[] args) {
        long producto = 1;
        for (int i = 1; i <= 20; i += 2) { //el iterador para la operación pasa solo por los impares
            producto *= i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los números impares es: " + producto);

    }

}
