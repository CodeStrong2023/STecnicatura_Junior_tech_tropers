
package Operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a; //El valor por default es 0 si no se inicializa.
    int b;
    
    //El constructor es un metodo especial
    public Aritmetica(){ //Constructor 1 vacio
        System.out.println("Se está ejecuntando el constructor N° 1");
    }
    //Estamos viendo lo que se llama SOBRECARGA DE CONSTRUCTORES
    public Aritmetica(int a, int b){ //Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecuntado el constructor N° 2");
    }
    
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
