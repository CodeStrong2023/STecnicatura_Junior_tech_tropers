
package Ejercicio9;

import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
        /*
        Ejercicio 9: Pedir el día, mes y año de una fecha e
        indicar si la fecha es correcta. Suponiendo que todos
        losmeses son de 30 días.
        */
        Scanner entrada = new Scanner(System.in);
        // Declaramos variables
        int dia, mes, anio;
        //Pedimos un dia
        System.out.println("Digite un dia:");
        dia = Integer.parseInt(entrada.nextLine());
        //Pedimos un mes
        System.out.println("Digite un mes:");
        mes = Integer.parseInt(entrada.nextLine());
        //Pedimos un año
        System.out.println("Digite un año:");
        anio = Integer.parseInt(entrada.nextLine());
        
        if((dia != 0)&&(dia <= 30)){
            if((mes != 0)&&(mes <= 12)){
                if((anio != 0)&&(anio <= 2023)){
                    System.out.println("La fecha es correcta y la fecha es " + dia +"/"+ mes +"/"+anio);
                }else{
                    System.out.println("La fecha ingresada es incorrecta, año incorrecto");
                }
            }else{
                    System.out.println("La fecha ingresada es incorrecta, mes incorrecto");
                }
            
        }else{
                    System.out.println("La fecha ingresada es incorrecta, dia incorrecto");
                }
    }
    
}
