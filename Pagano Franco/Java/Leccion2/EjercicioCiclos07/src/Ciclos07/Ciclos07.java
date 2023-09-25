/*
Ejericio 7: Pedir numeros hasta que se introduzca uno negativo
y calcular la media
*/
package Ciclos07;

import java.util.Scanner;

public class Ciclos07 {
    public static void main(String[] args) {
        int numero, suma = 0, contador = 0;
        float promedio = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >=0){
            suma += numero;
            contador ++;
            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if(contador != 0){
            promedio = (float) suma/contador;
            System.out.println("El promedio de los numeros ingresados es: "+promedio);
    
        } else{
                System.out.println("Ingreso primero un numero negativo");
            }
    }
}
