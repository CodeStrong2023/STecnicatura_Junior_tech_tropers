package Operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a; // Asignado por valor es igual a 0
    int b;

    // Metodo
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
        // Retorna un mensaje o devuelve un mensaje
    }

    // Metodo2
    public int sumarConRetorno() {
        //int resultado = a + b;
        return a + b;
        // Este retorna un resultado o valor de una expresión
    }

    // Metodo3
    /*
     public = modificador de acceso y luego viene el tipo de retorno
     sumarConArgumento = es el nombre o el IDENTIFICADOR que tendra el Metodo
     () = lo que colocamos en los parentesis son los argumentos, tambien debemos
    mostrar que tipo son
    */
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
