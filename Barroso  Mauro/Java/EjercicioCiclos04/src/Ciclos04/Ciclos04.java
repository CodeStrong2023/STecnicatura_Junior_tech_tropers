//Pedir numeros hasta que se teclee uno negativo
//Mostrar cuantos numeros se han introducido
//Hacerlo con clase scanner y option pane

package Ciclos04;

import java.util.Scanner;


public class Ciclos04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            System.out.println("El numero "+numero+"es POSITIVO");
            conteo++;
            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("A ingresago "+conteo+" numeros que no son negativo");
    }
}
