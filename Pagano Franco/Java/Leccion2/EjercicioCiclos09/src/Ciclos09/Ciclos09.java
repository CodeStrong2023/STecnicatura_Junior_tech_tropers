/*
Ejercicio 9: Pedir el dia, mes, año de una fecha e indicar
si la fecha es correcta. Suponiendo que todos los meses
son de 30 dias.
*/
package Ciclos09;

import java.util.Scanner;

public class Ciclos09 {
    public static void main(String[] args) {
        int mes, dia, año;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        dia = Integer.parseInt(entrada.nextLine());
        while(dia != 0 && dia > 30){
            System.out.println("Ingrese un dia correcto: ");
            dia = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Ingrese el mes: ");
        mes = Integer.parseInt(entrada.nextLine());
        while(mes != 0 && mes > 12){
            System.out.println("Ingrese un mes correcto: ");
            mes = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Ingrese el año: ");
        año = Integer.parseInt(entrada.nextLine());
        while(año != 0 && año > 2023){
            System.out.println("Ingrese un año correcto: ");
            año = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("La fecha "+dia+"/"+mes+"/"+año+" es correcta");
    }
}
