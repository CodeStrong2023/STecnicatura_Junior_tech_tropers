package Ejercicio2;

import java.util.Scanner;

public class ConScanner {

    public void suma() {
        
        System.out.println("Esto es el ejercicio con Scanner");
        int i = 1, num ,suma = 0;
        
        Scanner entrada = new Scanner(System.in);

        

        while (i <= 10) {
            System.out.println("Digite un número: ");
            num = Integer.parseInt(entrada.nextLine());
            suma += num;
            i ++;
            System.out.println("Usted digito el número: " + num);
        }
        System.out.println("El resultado es: " + suma);
        i = 0;
    }
}
