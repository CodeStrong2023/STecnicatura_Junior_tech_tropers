package test;

import domain.Persona;

public class PersonaPrueba {

    //podemos crear un atributo dentro de la clase PersonaPrueba
    private int contador;

    public static void main(String[] args) {
        Persona persona1 = new Persona(" Marianela");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona(" Sebastián");
        System.out.println("persona2 = " + persona2);
        Persona persona3 = new Persona(" Emir");
        System.out.println("persona3 = " + persona3);
        Persona persona4 = new Persona(" Sahir");
        System.out.println("persona4 = " + persona4); //el idPersona se va incrementando por no
        //ser static a través de contadorPersona.
        imprimir(persona1);
        imprimir(persona2);
        //this.contador = 10; //no se puede usar, no puede referenciar a través de un contexto static
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }

    //creamos otro método con modificador tipo público
    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }

    public int getContador() {
        imprimir(new Persona(" Sira"));
        return this.contador;
    }
}
