/*Ej 1: Leer un número y mostrar su cuadrado, repetir hasta que 
se introduzca un nro negativo*/
package Ciclos01;
//copiamos ej anterior sin importar la clase scanner

import javax.swing.JOptionPane;

/*importamos desde https://docs.oracle.com/javase/8/docs/api/ -> JOptionPane ->
 javax.swing.JOptionPane */
public class Ejercicio01 {

    public static void main(String[] args) {
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));/*JOptionPane ejecuta en una mini consola externa 
        y mustra los resultados en la consola de nb*/
        
        while (numero >= 0) {//condición mayor o igual a 0
            cuadrado = (int) Math.pow(numero, 2);//calcular el cuadrado del número
            System.out.println("El número " + numero + " elevado al cuadrado es: " + cuadrado);//mostramos el número y su cuadrado

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        System.out.println("Fin del programa por ingreso de número negativo");
    }
}

