
package Ciclowhile;

/**
 *
 * @author lopoj
 */
public class Ejercicio1While {
    
    public static void main(String[] args) {
        var conteo = 0; //Inferencia de tipos
        while(conteo < 7){
            System.out.println("conteo = " + conteo);
            conteo++; //Vamos aumentando en 1 la variable
        }
        
        var contador = 7;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador < 0);
        
        //Uso de las palabras break y continue junto a la etiqueta(label)
        inicio:
        for(var i = 0; i < 7; i++){
            if(i % 2 == 0){
                System.out.println("i = " + i);
                break inicio;
            }
            
        }
        
        for(var i = 0; i < 7; i++){
            if(i % 2 != 0){
                continue; //Siguiente iteración
            }
           System.out.println("i = " + i);
   
        }

        
    }
    
}
