/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y 
luego ir pidiendo numeros indicando "es mayor" o "es
menor" segun sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostramos
el numero de intentos hechos. 
 */
package Ciclos05;

import javax.swing.JOptionPane;

public class Ejercicio05 {
    public static void main(String[] args) {
       int numero, contador = 0, aleatorio;
       aleatorio = (int)(Math.random()*100); //Esto genera un numero aleatorio
       numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
       do{
            if (numero < aleatorio) {
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero mayor: "));
            } 
            else if(numero > aleatorio){
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero menor: "));
            }
            contador ++;
           } while(numero != aleatorio);
       JOptionPane.showMessageDialog(null,"TENEMOS UN GANADOR");    
       JOptionPane.showMessageDialog(null,"Adivinaste el numero en: "+ contador+" intentos");
       }
}
