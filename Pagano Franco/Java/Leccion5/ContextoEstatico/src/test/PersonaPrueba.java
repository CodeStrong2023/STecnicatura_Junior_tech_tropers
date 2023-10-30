
package test;

import domain.Persona;


public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Franco");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Julieta");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
    }
    
    static public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
 