
package ejercicio1;
/*
EJERCICIO 1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden introducidos*/
/**
 *
 * @author marianela
 */
import java.util.Scanner;

public class Ejercicio_1_Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] arreglos = new float[5];
        
        System.out.println("Cargando arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+". Ingrese un numero: ");
            arreglos[i] = entrada.nextFloat();
            
        }
        System.out.println("\nImprimir los numeros en el arreglo");
        for (float i:arreglos) {
            System.out.println(i+" ");
            
        }
    }
    
    
    
}
