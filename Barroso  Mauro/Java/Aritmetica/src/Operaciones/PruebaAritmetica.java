
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10; //variable local
        int b = 7; //memoria stack
        miMetodo(); //llamamos el metodo nuevo
    Aritmetica aritmetica1 = new Aritmetica();
    aritmetica1.a = 3;
    aritmetica1.b = 7;
    aritmetica1.sumarNumeros();
    
    //Para almacenar un objeto o los atributos se uitlizia una memoria heap
    int resultado = aritmetica1.sumaConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando Argumentos = "+resultado);
        System.out.println("aritmrtica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        
        
    }
    public static void miMetodo(){
        // a = 10;
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
