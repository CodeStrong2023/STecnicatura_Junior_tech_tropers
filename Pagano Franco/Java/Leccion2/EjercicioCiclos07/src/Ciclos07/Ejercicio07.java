/*
Ejericio 7: Pedir numeros hasta que se introduzca uno negativo
y calcular la media
*/
package Ciclos07;

import javax.swing.JOptionPane;

public class Ejercicio07 {
   public static void main(String[] args) {
        int numero, suma = 0, contador = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        while(numero >=0){
            suma += numero;
            contador ++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        if(contador != 0){
            promedio = (float) suma/contador;
            JOptionPane.showMessageDialog(null, "El promedio de los numeros ingresados es: "+promedio);
    
        } else{
                JOptionPane.showMessageDialog(null,"Ingreso primero un numero negativo");
            }
    } 
}
