
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //creamos variables local dentro del main *Memoria stack*
        int a = 10;
        int b = 7;
        miMetodo();  //Lamammos al método nuevo
        Aritmetica aritmetica1 = new Aritmetica(); //creamos un objeto dentro de la clase Aritmetica
        aritmetica1.a = 3;
        aritmetica1.b = 7; //asignamos los valores a los atributos de la clase que ya teniamos
        //y en el metodo ya esta la operacion para sumar (File Aritmetica.java
        
        aritmetica1.sumarNumeros();//llamamos al metodo
        
        //cremos otra variable para usar el metodo
        //Para almacenar un objeto o atributo se usa la memoria heap
        int resultado = aritmetica1.sumarConRetorno();//llamamos al metodo
        System.out.println("resultado = " + resultado);//mostramos
        //llamammos al metodo con sus argumentos
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado usando argumentos = " + resultado);
        
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);
        /*Vemos como el contructor nro 1 asigno valor a los atributos a y b*/
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b); 
        
    }  
    public static void miMetodo(){
         int a = 10; //Una variable es limitada
        System.out.println("Aquí hay otro método");
    }
}
