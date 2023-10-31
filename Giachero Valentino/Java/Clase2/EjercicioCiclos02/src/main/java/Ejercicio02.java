/*
Ejercicio 2: Leer un número e indicar si es positivo o
negativo. El proceso se repetira hasta que se introduzca
un cero
 */

import javax.swing.*;

public class Ejercicio02 {
    public static void main(String[] args) {
        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            /*
            Siempre se puede mejorar
            if (numero > 0) {
                System.out.println("El número es positivo");
            } else if (numero < 0) {
                System.out.println("El número es negativo");
            }
            En se puede reducir a menos lineas
             */
            if (numero != 0) {
                String resultado = (numero > 0) ? "Positivo" : "Negativo";
              /* Evitamos la consola fea
               System.out.println("El número " + numero + " es " + resultado);
               */
                JOptionPane.showMessageDialog(null,"El número " + numero + " es " + resultado );
            }
        } while (numero != 0);
/*
Forma larga
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El número es positivo");
            } else if (numero < 0) {
                System.out.println("El número es negativo");
            }
        }
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
 */
        JOptionPane.showMessageDialog(null,"El número " + numero + " finaliza el programa ");

    }
}
