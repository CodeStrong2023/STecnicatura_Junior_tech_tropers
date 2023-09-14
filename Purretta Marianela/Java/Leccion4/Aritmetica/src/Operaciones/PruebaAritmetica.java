
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica(); //creamos un objeto dentro de la clase Aritmetica
        aritmetica1.a = 3;
        aritmetica1.b = 7; //asignamos los valores a los atributos de la clase que ya teniamos
        //y en el metodo ya esta la operacion para sumar (File Aritmetica.java
        aritmetica1.sumarNumeros();//llamamos al metodo
        
        //cremos otra variable para usar el metodo
        int resultado = aritmetica1.sumarConRetorno();//llamamos al metodo
        System.out.println("resultado = " + resultado);//mostramos
        //llamammos al metodo con sus argumentos
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado usando argumentos = " + resultado);
        
    }
    
}
