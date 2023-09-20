
package ejercicio3jop;

import javax.swing.JOptionPane;


public class Ejercicio3JOP {

   /*
    Ejercicio3: Leer números hasta que se introduzca un cero
    Para cada uno indicar si es par o impar
    Primero lo haremos con la clase Scanner
    Luego con la clase JOptionPane
    */
    public static void main(String[] args) {
       
         //Con JOptionPane
         int num;
         num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
          while(num !=0){
            if(num %2 == 0){
                System.out.println("El numero es par" );
            }else{
                System.out.println("El numero es impar ");
            }
            System.out.println("Digite otro numero: ");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digte otro numero: "));
        }
         System.out.println("El ciclo finalizo por 0" );  
    }   
}
