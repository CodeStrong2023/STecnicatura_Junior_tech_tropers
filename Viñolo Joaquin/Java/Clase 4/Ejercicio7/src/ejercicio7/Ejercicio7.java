
package ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {

   
    public static void main(String[] args) {
      /*
        Ejercico 7: Pedir números hasta que se introduzaca uno negativo
        y calcular la media
        */
     int num, conteo;
     float media;
     media = 0;
     conteo = 0;
     Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: "  );
        num = Integer.parseInt(entrada.nextLine());
        
        while(num >= 0){
            conteo++;
            media += num;
             System.out.println("Digite otro número: "  );
             num = Integer.parseInt(entrada.nextLine());
        }
        if(conteo == 0){
            System.out.println("Por favor ingrese un número mayor a 0 ");
            
        }else{
            media = media / conteo;
            System.out.println("La media es: " + media);
        }
        
    }
    
}
