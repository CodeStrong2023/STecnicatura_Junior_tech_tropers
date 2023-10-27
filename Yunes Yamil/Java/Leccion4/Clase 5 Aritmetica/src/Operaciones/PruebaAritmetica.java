package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10; //Variables locales
        int b = 7; //Memoria stack
        miMetodo(); //Llamamos al metodo nuevo
        
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;

        aritmetica1.sumarNumeros();
    //Para almacenar un objeto o los atributos se utiliza la memoria HEAP
        
    // 2 Creamos una variable para recibir el metodo
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
    // 3 reutilizamos la variable resultado
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: "+resultado);
        
    // hasta aqui se ejecuta el constructor 1
    // vamos a ejecutar el constructor 2
    
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 a: "+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        //aritmetica1 = numm; Nunca itilizar esto, nose debe hacer
        //System.gc(); metodo para limpiar residuos, es pesado, no utilizar
        Persona persona = new Persona("Yamil Jesus","Yunes");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: "+persona.nombre);
        System.out.println("Persona nombre: "+persona.apellido);
    }
    
    //Modularidad creamos un nuevo metodo
    public static void miMetodo(){
        int a = 10; //una variable esta limitada
        System.out.println("Aqui hay otro metodo");
        
    }
}

//Creamos una nueva clase
class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){ //constructor
         super(); //LLamada al constructor de la clase Padre object
        // Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido; 
        System.out.println("Objeto persona usando this: "+this);
    }
}

class Imprimir{
    public Imprimir(){
        super(); //el constructor de la clase padre, para reservar memoria
    }
    
    public void imprimir(Persona persona){
        
        System.out.println("Persona desde la clase imprimir: "+persona);
        System.out.println("Impresión del objeto actual (this) "+this);
    }
}