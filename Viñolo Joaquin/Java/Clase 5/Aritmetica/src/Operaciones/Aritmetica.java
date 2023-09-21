
package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Metodos
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("El resultado es: " + resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        return a + b;
    }
    //Argumentos dentro de un metodo, información que le pasamos
    public int sumarConArgumentos(int arg1, int arg2){
        
        this.a = arg1; //El argumento a se asigna al atributo this.a
        this.b = arg2;
        //return a + b;
        return this.sumarConRetorno();
    }
}
