package ciclos12;

import java.util.Scanner;

/*
 Ejercicio 12: Pedir un numero y calcular su factorial
 Hacerlo con las 2 clases, Scanner y JOptionPane
 */
public class Ciclos12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, i = 1;
        long factorial = 1;
        System.out.println("Ingresa un Número para encontrar su factorial");
        numero = Integer.parseInt(entrada.nextLine());
        //numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Número para encontrar su factorial"));
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        System.out.println("\nEl factorial de "+numero+ " es: " + factorial);
        //JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}
