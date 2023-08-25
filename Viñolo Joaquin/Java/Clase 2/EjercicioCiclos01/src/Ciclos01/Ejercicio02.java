
package Ciclos01;

import javax.swing.JOptionPane;

/*
Ejercicio 2: Leer un número e indicar si es positivo
o negativo. El proceso se repetrá hasta que se introduzca un 0
*/
public class Ejercicio02 {
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero != 0){
            if(numero >= 0){
            System.out.println("El numero es positivo");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }else if(numero < 0){
                System.out.println("El numero es negativo");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        
        }
        System.out.println("El ciclo finalizo por el 0" );
    }
}
