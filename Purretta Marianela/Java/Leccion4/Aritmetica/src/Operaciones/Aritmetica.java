
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
}
