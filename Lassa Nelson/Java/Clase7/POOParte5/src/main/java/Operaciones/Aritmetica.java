package Operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;

    // El constructor es un metodo especial
    public Aritmetica() { // Constructor 1 vacio
        System.out.println("Se esta ejecuntdo este constructor número uno");
    }
    // Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b) { //constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando el constructor número dos");
    }

    // Metodo
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        // Int resultado =  a + b;
        return a + b;
    }
    public int sumarConArgumentos(int arg1, int arg2) {
        /* Los argumentos son la información que va a recibir el metodo
        son parte de la firma
        */
        this.a = arg1; // No modifica los valores del atributo del objeto
        this.b = arg2;
        //return a + b;
        return  this.sumarConRetorno();

    }
}
