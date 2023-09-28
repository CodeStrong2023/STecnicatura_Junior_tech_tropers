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

        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
        /*Vemos como el contructor nro 1 asigno valor a los atributos a y b*/

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        //aritmetica1 = null; nunca usar esto, 
        //System.gc(); método para limpiar residuos, es pesado, NO USAR
        Persona persona = new Persona("Marianela", "Purretta");
        /*Creamos un objeto persona de la clase
        Persona de la segunda clase*/
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);

    }

    //MODULARIDAD- creamos un nuevo método
    public static void miMetodo() {
        int a = 10; //Una variable es limitada
        System.out.println("Aquí hay otro método");
    }
}

// Creamos una clase dentro de otra, pero si ya tenemos una pública no podemos crear 
//otra pública. Tiene un modificador de acceso DEFAULT 
/*default o package class Persona*/
class Persona { //segunda clase sin modificador de acceso con el modificador Default

    String nombre;
    String apellido;//creamos los atributos

    Persona(String nombre, String apellido) { //constructor que apunta a los atributos ya creados
        //creamos un objeto 
        new Imprimir().imprimir(this);
        //super();//constructor vacío *Llamada al constructor de la clase Padre object
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
    }
}
//creamos otra clase:

class Imprimir {

    public Imprimir() {
        super(); //constructor de la clase padre para reservar memoria    
    }

    public void imprimir(Persona persona) {
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresión del objeto actual (this): " + this);
    }
}
