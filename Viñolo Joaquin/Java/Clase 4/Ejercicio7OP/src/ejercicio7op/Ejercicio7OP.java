
package ejercicio7op;

import javax.swing.JOptionPane;


public class Ejercicio7OP {

   
    public static void main(String[] args) {
        /*
        Ejercico 7: Pedir números hasta que se introduzaca uno negativo
        y calcular la media
        */
        int num, conteo;
     float media;
     media = 0;
     conteo = 0;
     
         num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while(num >= 0){
            conteo++;
            media += num;
             num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        if(conteo == 0){
            System.out.println("Por favor ingrese un número mayor a 0 ");
            
        }else{
            media = media / conteo;
            System.out.println("La media es: " + media);
        }
    }
    
}
