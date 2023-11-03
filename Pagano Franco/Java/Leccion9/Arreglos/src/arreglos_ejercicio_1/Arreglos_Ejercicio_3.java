/*
Ejercicio 3: Leer 5 numeros por teclado, almacenarlos en un arreglo
y a continuacion realizar la media de los numeros positivos, la media
de los negativos y contar el numero de ceros.
*/
package arreglos_ejercicio_1;

import javax.swing.JOptionPane;

public class Arreglos_Ejercicio_3 {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        }
        int sumaPositivo = 0;
        int contadorPositivo = 0;
        int sumarNegativos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0; 
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > 0){
                 sumaPositivo = sumaPositivo + numeros[i];
                 contadorPositivo ++; 
            } else if( numeros[i] < 0){
                sumarNegativos = sumarNegativos + numeros[i];
                contadorNegativos ++;
            } else {
                contadorCeros ++; 
            }
        }
        float resultado = sumaPositivo/contadorPositivo; 
        float resultado2 = (sumarNegativos/contadorNegativos);
        JOptionPane.showConfirmDialog(null,"La media de positivos es = " + resultado );
        JOptionPane.showConfirmDialog(null,"La media de negativos es = " + resultado2);
        JOptionPane.showConfirmDialog(null,"La la cantidad de ceros es = " + contadorCeros);
        
 
    }
}
