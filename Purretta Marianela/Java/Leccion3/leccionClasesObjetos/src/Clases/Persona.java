
package Clases;

public class Persona {
    /*cada clase es una plantilla donde vamos a trabajar, cada clase tiene 
    un nombre, atributos y métodos. A partir de una clase creamos objetos*/
    
    //Atributosde la clase(Características)
    String nombre;
    String apellido;
    
    //Métodos de la clase(Acciones)
    public void obtenerInformacion(){ //La información que puede recibir un método es un ARGUMENTO
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
}
