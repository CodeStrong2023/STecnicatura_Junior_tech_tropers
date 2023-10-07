package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10;// Variable locales
        int b = 7; // Memoria stack
        miMetodo(); // Llamamos el metodo nuevo
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        // Para almacenar un objeto o los atributos se utiliza la memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado = " + resultado);

        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica2 b: " + aritmetica1.b);

        Aritmetica Aritmetica2 = new Aritmetica(5, 8);
        System.out.println("Aritmetica2.a = " + Aritmetica2.a);
        System.out.println("Aritmetica2.b = " + Aritmetica2.b);
        //aritmetica1 = null;  no se utiliza para hacer formas de recidos
        //System.gc();  Metodo para limpiar residuos, es pesado, no utilizar
        Persona persona = new Persona("Nelson", "Lassa");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);
    }

    // Modularidad creamos un nuevo método
    private static void miMetodo() {
        // int a = 10; // Una variable esta limitada
        System.out.println("Aqui hay otro metodo");
    }
}

// Creamos una nueva clase
class Persona {
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        // Es un constuctor que esta apuntando
        // hacia los atributos creados en esta nueva clase
        super(); // metodo constructor de la clase padre, no necesita argumentos
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
    } // significa que a esta clase solo se podra acceder desde otras
    // clases definidas dentro de este paquete (package Operaciones)
}

class Imprimir {
    public Imprimir() {
        super(); // El constuctor de la clase, para reservar memoria
    }
    // Metodo
    public void imprimir(Persona persona) {
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresión del objeto actual (this): " + this);
    }
}