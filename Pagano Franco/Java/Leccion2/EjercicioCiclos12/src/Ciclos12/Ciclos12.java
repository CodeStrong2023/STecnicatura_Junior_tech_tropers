/*
Ejercicio 12: Pedir un numero y calcular su factorial
hacerlo con las dos clases Scanner y JOptionPane
*/
package Ciclos12;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos12 {
    public static void main(String[] args) {
        int numero;
        int factorial = 1;
        int i = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(i <= numero){
            factorial *= i;
            i ++;
        }
        System.out.println("El factorial de "+numero+" es: "+factorial);
    }
   
}

class Ciclos12JOptionPane{
    public static void main(String[] args) {
        int numero; 
        int factorial = 1;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero "));
        for (int i = 1; i <= numero; i++){
        factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de "+numero+" es: "+factorial);
    }
}
