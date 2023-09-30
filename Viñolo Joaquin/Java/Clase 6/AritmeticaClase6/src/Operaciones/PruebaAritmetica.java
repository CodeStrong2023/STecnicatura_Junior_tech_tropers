
package Operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10; //Variables locales
        int b = 7; //Memoria stack
        miMetodo(); //Llamamos al nuevo método
        //Creamos un objeto 
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 10;
        aritmetica1.b = 8;
        //Llamamos al metodo sumar numeros
        aritmetica1.sumarNumeros();
        
        //Para almacenar un objeto o los atributos, se utiliza la memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("El resultado es: " +resultado );
        
        resultado = aritmetica1.sumarConArgumentos(2, 4);
        System.out.println("El resultado es: " + resultado );
        
        System.out.println("Aritmetica a:"+ aritmetica1.a);
        System.out.println("Aritmetica b:"+ aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2: " + aritmetica2.a);
        System.out.println("aritmetica2: " + aritmetica2.b);
        aritmetica1 = null; //Esto no se utiliza
        System.gc(); //Limpia los archivos no utilizados 
    }
    
    public static void miMetodo(){
        System.out.println("Aquí existe otro método");
    }
}
