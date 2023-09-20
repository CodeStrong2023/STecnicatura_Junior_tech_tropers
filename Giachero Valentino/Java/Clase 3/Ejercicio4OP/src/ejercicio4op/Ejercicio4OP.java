
package ejercicio4op;

import javax.swing.JOptionPane;

public class Ejercicio4OP {

    /*
    Ejercicio 4: Pedir números hasta que se teclee uno negativo,
    y mostrar cuántos números se han introducido
    Lo hacemos primero con la clase Scanner
    Luego lo hacemos con la clase JOptionPane
    */
    public static void main(String[] args) {
     
        int numero, conteo = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero >= 0){
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        System.out.println("La cantidad de numeros ingresados es: " + conteo);
    }
    
}
