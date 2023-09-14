
package Operaciones;

public class Aritmetica {
    /*las clases siempre, a diferencia de los métodos y atributos, comienza con mayuscola*/
    //atributos de la clase:
    int a;
    int b;//valor por default=0 al ni inicializar la variable int
    
    //Métodos
    public void sumarNumeros(){ //métodos y atributos, escritura pascalcase
        //cuerpo de la clase: todo lo que está dentro del método
        /*variables locales: las que están dentro del cuerpo, se crean y 
        se destuyen al terminar de ejecutar*/
        int resultado = a + b;
        System.out.println("resultado = "+ resultado);
    }
    //creamos otro metodo, tipo int//nos va aregresar un int
    public int sumarConRetorno(){
        int resultado = a + b;
        return resultado; //o return a + b
    }
    //creamos otro metodo:
    //'public': modificador de acceso- int o void: 'tipo de retorno
    public int sumarConArgumentos(int arg1, int arg2){ //->nombre del metodo y (los argumentos)
    //el argumento es la informacion que va a recibir el metodo
        this.a = arg1; /*modificado, agregamos this. y el arg a se asigna al atributo this.a*/
        this.b = arg2; /*modificado = */
        //return a + b; /**/
        return this.sumarConRetorno();// unimos dos metodos siempre que esten dentro de la misma clase
        
        /*'this':var que se crea automaticamente, en el momento que se esta ejec un objeto
        apunta al espacio de memoria donde esta el objeto para hacer modificaciones
        su uso es opcional, y se crea automaticamente, permite que los atrib y argum tengan el 
        mismo nobre y los diferencia*/
    }
      
}
