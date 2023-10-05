package clase7;

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
        System.out.println("El resultado es: " + resultado);

        resultado = aritmetica1.sumarConArgumentos(2, 4);
        System.out.println("El resultado es: " + resultado);

        System.out.println("Aritmetica a:" + aritmetica1.a);
        System.out.println("Aritmetica b:" + aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2: " + aritmetica2.a);
        System.out.println("aritmetica2: " + aritmetica2.b);
        aritmetica1 = null; //Esto no se utiliza
        System.gc(); //Limpia los archivos no utilizados 
        //Creamos un objeto llamado persona
        Persona persona = new Persona("Joaquín", "Viñolo");
        System.out.println("Nombre de la persona: " +persona.nombre);
        System.out.println("Apellido de la persona: " +persona.apellido);
    }

    public static void miMetodo() {
        System.out.println("Aquí existe otro método");
    }
}


class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        super(); //Llamada al constructor de la clase Padre object
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona: " + this);
    }
}

class Imprimir{
    public Imprimir(){
        super(); //El constructor de la clase padre para reservar memoria
    }
    
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this)" + this);
    }
}
