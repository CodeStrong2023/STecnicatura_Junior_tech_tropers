// <<<||·Yamil·||>>> //

package CicloWhile;

/// *** CICLO WHILE - DO WHILE - FOR *** ///

public class EjercicioWhile01 {
    public static void main(String[] args) {
        
/// *** CICLO WHILE ***///

    System.out.println("*** Contando con While: ");
        var conteo = 0; // Inferencia de tipos
        while (conteo <= 7){
            System.out.println("conteo = " + conteo);
            conteo++; // Vamos aumentando en uno la variable   
        }

/// *** CICLO DO WHILE  *** ///

    System.out.println("*** Contando con DoWhile: ");

        var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
            
        } while (contador <= 7);
        
/// *** CICLO FOR *** ///
        
    System.out.println("*** Contando con For: ");
    
        for(var contando = 0; contando <= 7; contando++){
            System.out.println("contando = " + contando);                  
        }  
        
/// *** CICLO FOR con BREAK *** ///
        
    System.out.println("*** Contando con For y Break: ");
        
        for(var contando = 0; contando <= 7; contando++){
            if(contando % 2 == 0){
                System.out.println("contando = " + contando);      
                break;  // Al cumplirse la condicion if, que se da con el 0, se rompee el ciclo
            }
        }
        
/// *** CICLO FOR con CONTINUE *** ///
        
    System.out.println("*** Contando con For y Continue: ");
    
        for(var contando = 0; contando <= 7; contando++){
            if(contando % 2 != 0){
                continue; // Vamos a la siguiente iteración 
            }
                System.out.println("contando = " + contando);    
            // Cuando el condicional se encuentra con un numero impar, continua con el proceso for
        }

/// *** USO DE ETIQUETAS - LABELS *** ///
        
    /// *** Etiquetas FOR con BREAK *** ///
        
    System.out.println("*** Etiquetas: Contando con For y Break: ");
    inicio:
        for(var contando = 0; contando <= 7; contando++){
            if(contando % 2 == 0){
                System.out.println("contando = " + contando);      
                break inicio;  
            }
        }
        
    /// *** Etiquetas FOR con CONTINUE *** ///
        
    System.out.println("*** Etiquetas: Contando con For y Continue: ");
    iniciar:
        for(var contando = 0; contando <= 7; contando++){
            if(contando % 2 != 0){
                continue iniciar; 
            }
                System.out.println("contando = " + contando);    
        }
    
    // Sucede exactamente lo mismo. Las etiquetas no funcionan sin las palabras 
    // break y continue
    }
}
