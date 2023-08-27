
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        
        // CICLO WHILE 
        System.out.println("*** Ciclo While ***");
        var conteo = 0; //inferencia de tipos
        while(conteo < 3){
            System.out.println("conteo = " + conteo);
            conteo++; //vamos aumentando en uno la variable
        }
        
       // CICLO DO - WHILE
       System.out.println("*** Ciclo Do-While ***");

       var contador = 0;
       do{
           System.out.println("contador = " + contador); 
           contador++;
       }while(contador <= 7);
       
       
       
       // CICLO FOR
       System.out.println("*** Ciclo For ***");

       // Numeros pares
       
       System.out.println("* Pares *");
       inicio:
       for(var contando = 0; contando < 7; contando++){
           if(contando % 2 == 0){
                System.out.println("contando = " + contando);
                break inicio;
           }
       }
       // Numeros impares

       System.out.println("* Impares *");
       inicio:
       for(var contando = 0; contando < 7; contando++){
           if(contando % 2 != 0){
               continue inicio; //Vamos a la siguiente iteración
           }
                System.out.println("contando = " + contando);
           }
       
    }
}