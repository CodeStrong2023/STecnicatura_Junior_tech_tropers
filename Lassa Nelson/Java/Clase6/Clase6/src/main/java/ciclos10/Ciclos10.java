package ciclos10;

import javax.swing.*;
import java.util.Scanner;

/*
Ejercicio 10: Pedir 10 números y escribir la suma total
hacerlo con la clase Scanner y JOptionPane
 */
public class Ciclos10 {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numero a ingresar");
        int cantidad = Integer.parseInt(entrada.nextLine());
        int numero;
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa el numero: "+(i+1));
            numero = entrada.nextInt();
            suma = numero + suma;

        }
        System.out.println("suma = " + suma);
        */


        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de numero a ingresar"));
        int numero;
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero: " + (i + 1)));

            suma = numero + suma;

        }
        JOptionPane.showMessageDialog(null, suma);
    }
}
