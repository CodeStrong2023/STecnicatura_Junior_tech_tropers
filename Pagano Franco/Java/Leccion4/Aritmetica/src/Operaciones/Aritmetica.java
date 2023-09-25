
package Operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    
    //El contructor es un metodo especial
    public Aritmetica(){ //Constructor 1 vacio
        System.out.println("Se esta ejecutando este contructor N° 1");
    }
    
    // Estamos vienod lo que se llama sebrecarga de constructores
    public Aritmetica(int a, int b){ //Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando este contructor N° 2");
    }
    
    //Metodo
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        int resultado = a + b;
        return resultado;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b; 
        //return a + b;
        return this.sumarConRetorno();
    }
}

