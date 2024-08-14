
package Operaciones;

public class Aritmetica {
    //Atributos
    int a;//por default es a = 0 y b = 0
    int b;
    
    //El constructor es un metodo especial
    public Aritmetica(){
        System.out.println("Se ejecuta el constructor numero uno");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Se ejecuta constructor numero dos");
    }
    
    //Metodo
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
        
    }
public int sumaConRetorno(){
    //int resultado = a+ b;
    return this.a + this.b;
    
}

public int sumarConArgumentos(int a, int b){
    this.a = a;//El arguemnto "a" se asigna al atributo this "a"
    this.b = b;
    //return a + b;
    return this.sumarConRetorno();
    
}

    private int sumarConRetorno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
