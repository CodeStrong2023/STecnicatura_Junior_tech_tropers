
package Operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a; //El valor por default es 0 si no se inicializa.
    int b;
    
    //Metodo
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " +resultado);
    }
    // 2 Creamos otro metodo
        
    public int sumarConRetorno(){
        int resultado = a + b ;
        return resultado;
    }
    
    //3 Creamos otro metodo
    public int sumarConArgumentos(int arg1, int arg2){   
        this.a = arg1; //El argumento a se aisgna al tributo this.a
        this.b = arg2; 
        // return a + b;
        return this.sumarConRetorno(); //Dentro del metodo retornamos otro metodo
    }
}

//No se recomienda crear el metodo main aqui
