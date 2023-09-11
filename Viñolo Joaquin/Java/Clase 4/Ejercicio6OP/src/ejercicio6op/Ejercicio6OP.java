
package ejercicio6op;

import javax.swing.JOptionPane;


public class Ejercicio6OP {


    public static void main(String[] args) {
        /*
        Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar
        la suma de los números introducidos
        */
        
        int num, suma;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        suma = 0;
        while(num !=0){
            suma = suma + num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        System.out.println("Se detuvo la ejecución del programa debido a un 0 ");
        System.out.println("La suma es de: " + suma);
    }
    
}
