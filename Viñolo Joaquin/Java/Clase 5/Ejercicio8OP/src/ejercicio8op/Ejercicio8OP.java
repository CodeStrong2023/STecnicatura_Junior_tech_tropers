
package ejercicio8op;

import javax.swing.JOptionPane;


public class Ejercicio8OP {

    public static void main(String[] args) {
       //Ejercicio 8:Pedir un número N, y mostrar todos los números
        //del 1 al N.
        
        int num;
        int i = 1;
        
        //Pedimos un número al usuario
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(i <= num){
              System.out.println(i);
              i++;
        }
    }
    
}
