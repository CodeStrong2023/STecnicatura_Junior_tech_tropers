
package Ejercicio12;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos12 {
    public static void main(String[] args) {
        /*
        Ejercicio 12: Pedir un número y calcular el factorial
        Hacerlo con las dos clases, Scanner y JOptionPane
        */
        
        //Con clase Scanner
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        */
        
        //Con JOptionPane
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para calcular su factorial: "));
        long factorial = calcularFactorial(numero);
        
        System.out.println("El factorial del " + numero + " es " + factorial);
  
    }
    
    public static long calcularFactorial(int num) {
        //Validamos que el numero sea positivo
        if (num < 0) {
            System.out.println("El número no debe ser negativo");
        }
        if (num <= 1) {
            return 1;
        } else {
            //Realizamos el calculo del factorial
            return num * calcularFactorial(num - 1);
        }
    }
}
