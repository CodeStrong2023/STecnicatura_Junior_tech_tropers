
package CicloWhile;

public class EjercicioWhile {
    public static void main(String[] args) {
        // Ciclo While
        var conteo = 0; //Inferencia de tipos
        while(conteo < 7){
            System.out.println("conteo = "+conteo);
            conteo++; //Vamos a aumentar en un uno la variable 
        }
        //Ciclo Do While
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador ++;
        }while(contador < 7);
        //Ciclo For
        for(var contando = 0; contando < 7; contando++){
             System.out.println("contando = " + contando);
            }
        //Rompe Ciclos - BRACK 
        for(var contando = 0; contando < 7; contando++){
            if(contando % 2 ==0 ) {
             System.out.println("contando = " + contando);
             break;
            }
        }
        //Rome Ciclos - BRACK
        for(var contando = 0; contando < 7; contando++){
            if(contando % 2 ==0 ) {
             continue;//Vamos a la siguiente iteracion
            }
            System.out.println("contando = " + contando);
        }
        //Uso de etiquetas (Labels)
        //Uso de las palabras break y continue en las etiquetas (labels)
        inicio:
        for(var contando1 = 0; contando1 < 7; contando1++){
            if(contando1 % 2 ==0 ) {
             System.out.println("contando1 = " + contando1);
             break inicio;
            }
        }
        inicio:
        for(var contando2 = 0; contando2 < 7; contando2++){
            if(contando2 % 2 ==0 ) {
             continue inicio;//Vamos a la siguiente iteracion
            }
            System.out.println("contando2 = " + contando2);
        }
    }
}
