
package pasoporreferencia;

import Clases.Persona;


public class PasoPorReferencia {
    public static void main(String[] args) {
        //Creamos un objeto persona de la clase persona
        Persona persona = new Persona();
        
        persona.nombre = "Rogelia";
        persona.apellido = "V";
        persona.edad = 33;
        System.out.println("La persona 1 se llama: " + persona.nombre);
        cambiarValor(persona);
        System.out.println("El cambio que hicimos en el nombre es: " + persona.nombre);
        persona = cambiarElValor(persona);
        Persona persona2 = new Persona();
        persona2 = cambiarElValor(persona2);
        System.out.println("El valor del objeto es: " + persona2.nombre);
    }
    
    public static void cambiarValor(Persona persona){
        persona.nombre = "María";
    }
    
    public static Persona cambiarElValor(Persona persona){
        if(persona == null){
            System.out.println("El valor de persona no es válido");
            return null;
        }else{
             persona.nombre = "Mónica";
        return persona;
        }
       
    }
}
