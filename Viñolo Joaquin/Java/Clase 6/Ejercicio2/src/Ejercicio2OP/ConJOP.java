
package Ejercicio2OP;

import javax.swing.JOptionPane;


public class ConJOP {
    
    public void suma(){
        System.out.println("Esto es el ejercicio con JOptionPane");
        int i = 1, suma = 0, num;
        
        while (i <= 10){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            System.out.println("Usted digito el numero: " + num);
            suma += num;
            i ++;
        }
        System.out.println("El resultado de la suma es: " + suma);
    }
}
