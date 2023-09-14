
package Clases;


public class Persona {

    static Persona persona2;
   //Caracteristicas de la clase, atributos
    String nombre;
    String apellido;
    
//Metodo de la clase (acciones)
    public void obtenerInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
}
