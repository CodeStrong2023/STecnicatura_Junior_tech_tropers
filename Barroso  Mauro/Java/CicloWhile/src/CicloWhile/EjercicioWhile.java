
package CicloWhile;


public class EjercicioWhile {

    //While
    public static void main(String[] args) {
        var conteo = 0; //Inferencia
        while(conteo < 7){
            System.out.println ("conteo = " + conteo);
            conteo++; 
        }
     //Do While   
        
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
            
        } while (contador <= 7);
        
     //For   y etiquetas
     inicio:
        for (var contando = 0; contando < 7; contando++) {
            if(contando % 2 == 0){
                System.out.println("contando = " + contando);
                break inicio;
            }
        }
            
            
     //Palabras break y continue
         for (var contando = 0; contando < 7; contando++) {
            System.out.println("contando = " + contando);   
        }
        
        for (var contando = 0; contando < 7; contando++) {
           if(contando % 2 != 0){
               continue;
           } 
         System.out.println("contando = " + contando);
        }
    }
  
}
