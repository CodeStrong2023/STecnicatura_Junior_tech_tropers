
package Ejercicio5OP;

import javax.swing.JOptionPane;

public class Ejercicio5OP {
    
    public static void main(String[] args) {
         /*
        Ejercicio 5
        Realizar un juego para adivinar un número, 
        para ello generar un número aleatorio entre 0-100,
        y luego ir pidiendo números indicando "es mayor" o 
        "es menor" según sea mayor o menor con respecto a N 
        El proceso termina cuando el usuario acierta y mostramos
        el número de intentos hechos
        */
        
        int num, aleatorio, conteo = 0;
        
       
        aleatorio = (int)(Math.random()*100); //Esto genera un número aleatorio entre 0 y 100
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            if(num < aleatorio){
                System.out.println("Digite un numero mayor");
            }else if(num > aleatorio){
                System.out.println("Digite un numero menor ");
            }
            else{
                System.out.println("Usted acertó, felicitaciones genio del mundo mundial ");
            }
            conteo++;
        }while(num != aleatorio);
        System.out.println("Adivinaste el número, tus intentos fueron: "+conteo);
        
    }
}
