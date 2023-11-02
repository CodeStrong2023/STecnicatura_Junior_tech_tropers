package arreglos_ejercicio_3;

import java.util.Scanner;

/*
Ejercicio 3 : Leer 5 números por teclados, almacenarlos en
un arreglo y a continuación realizar la media de los
números positivos, la media de los negativos y contar el numeros de ceros
 */
public class Arreglos_Ejercicios_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa 5 números");
        float arreglos3[] = new float[5];
        int cero = 0;
        float cantP = 0;
        float cantN = 0;
        int positivos = 0;
        int negativo = 0;
        for (int i = 0; i < arreglos3.length; i++) {
            System.out.println("Ingrese el valor" + i + " = ");
            arreglos3[i] = entrada.nextFloat();
        }
        for (int i = 0; i < arreglos3.length; i++) {
            if (arreglos3[i] == 0) {
                cero += 1;
            } else if (arreglos3[i] > 0) {
                cantP = cantP + arreglos3[i];
                positivos += 1;
            } else if (arreglos3[i] < 0) {
                cantN = cantN + arreglos3[i];
                negativo += 1;
            }
        }
        float mediap = cantP / positivos;
        float median = cantN / negativo;
        System.out.println("La cantidad de ceros en el arreglo son: " + cero);
        System.out.println("Cantidad positivo: " + positivos +" su media es : "+mediap);
        System.out.println("Cantidad negativos: " + negativo +" su media es : "+median);
    }
}
