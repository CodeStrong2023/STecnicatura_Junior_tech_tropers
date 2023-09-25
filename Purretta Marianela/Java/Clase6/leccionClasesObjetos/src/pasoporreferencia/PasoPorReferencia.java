//PASO POR REFERENCIA
package pasoporreferencia;

import Clases.Persona; //Importamos la clase Persona

public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();//creamos objeto "persona1" y accedemos a los 
        //atributos de "Persona"
        //Todas las clases heredan de la clase object
        persona1.nombre = "Ester"; //accedemos a los atrib publicos y asignamos el nombre Ester
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: " + persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Persona persona2 = new Persona();
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor del objeto es:  = " + persona2.nombre);
    }

    //creamos un nuevo método----PASO POR REFERENCIA
    public static void cambiarValor(Persona persona) {//para acceder al objeto y a la clase es 
        //a travers de la clase Persona y pasamos persona
        persona.nombre = "María"; //Asignamos nuevo valor

    }

    public static Persona cambiarElValor(Persona persona) {
        if (persona == null) {
            System.out.println("Valor de persona es = Null");
            return null;
        } else {
            persona.nombre = "Mónica";
            return persona;
        }
    }

}
