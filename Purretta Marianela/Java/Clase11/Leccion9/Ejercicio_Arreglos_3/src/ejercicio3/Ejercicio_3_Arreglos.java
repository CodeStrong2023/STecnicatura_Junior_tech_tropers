package ejercicio3;

import java.util.Scanner;

/*Leer los números por teclado, almcenarlos en un arregloy realizar:
    _la media de los números positivos
    _La media de los números negativos
    _Contar el número de ceros*/
/**
 *
 * @author marianela
 */
public class Ejercicio_3_Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
        int contar0 = 0, contarNegativos = 0, contarPositivos = 0;

        System.out.println("Cargamos los numeros en el arreglo: ");
        for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) +". Ingrese un numero: ");
                numeros[i] = entrada.nextFloat();
                if (numeros[i] > 0) {
                        positivos += numeros[i];
                        contarPositivos++;
                } 
                else if (numeros[i] < 0) {
                         negativos += numeros[i];
                         contarNegativos++;
                } 
                else {
                      contar0++;
                }
        }
        
        if (contarPositivos == 0) {
                System.out.println("\nNo se puede sacar media de los numeros positivos");
        } 
        else {
                mediaPositivos = positivos / contarPositivos;
                System.out.println("\nLa media de los numeros positivos es: " + mediaPositivos);
        }
        if (contarNegativos == 0) {
                System.out.println("\nNo se puede sacar media de los numeros negativos");
        } 
        else {
                mediaNegativos = negativos / contarNegativos;
                System.out.println("\nLa media de los numeros negativos es: " + mediaNegativos);
        }
        
        System.out.println("Hay " + contar0 + " ceros");
        }
    
}


