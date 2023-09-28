package Operaciones;

public class Aritmetica {

    /*las clases siempre, a diferencia de los métodos y atributos, comienza con mayuscola*/
    //atributos de la clase:
    int a;
    int b;//valor por default=0 al ni inicializar la variable int

    /*El constructor es un método especial que contruye un objeto, reserva un espacio de memoria e 
    inicializa los atributos de la clase*/
    public Aritmetica() { // el primer constructor se crea por defecto y vacío
        System.out.println("Ejecutando el constructor nro 1");
    }

    /*Constructor 2 para ver la sobrecarga*/
    public Aritmetica(int a, int b) { // en este colocamos parámetros
        this.a = a; //THIS APUNTA AL ATRIBUTO
        this.b = b;
        System.out.println("Ejecutando constructor nro 2");
    }

    //Métodos
    public void sumarNumeros() { //métodos y atributos, escritura pascalcase
        //cuerpo de la clase: todo lo que está dentro del método
        /*variables locales: las que están dentro del cuerpo, se crean y 
        se destuyen al terminar de ejecutar*/
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    //creamos otro metodo, tipo int//nos va aregresar un int
    public int sumarConRetorno() {
        int resultado = a + b;
        return resultado; //o return a + b
    }

    //creamos otro metodo:
    //'public': modificador de acceso- int o void: 'tipo de retorno
    public int sumarConArgumentos(int arg1, int arg2) { //->nombre del metodo y (los argumentos)
        //el argumento es la informacion que va a recibir el metodo
        this.a = arg1;
        /*modificado, agregamos this. y el arg a se asigna al atributo this.a*/
        this.b = arg2;
        /*modificado = */
        //return a + b; /**/
        return this.sumarConRetorno(); //unimos dos metodos siempre que esten dentro de la misma clase

        /*'this':var que se crea automaticamente, en el momento que se esta ejec un objeto
        apunta al espacio de memoria donde esta el objeto para hacer modificaciones
        su uso es opcional, y se crea automaticamente, permite que los atrib y argum tengan el 
        mismo nobre y los diferencia*/
    }

}
