
package test;

import domain.Persona;

public class PersonaPrueba {
    int contador;
    public static void main(String[] args) {
        //Creamos un objeto de la clase persona
        Persona persona1 = new Persona("Joaquín");
        //Mostramos por consola la persona1
        System.out.println("persona1 = " + persona1);
        
        //Creamos otro objeto de la clase persona
        Persona persona2 = new Persona("Viñolo");
        System.out.println("persona2 = " + persona2);
        
        //Llamamos al método imprimir
        imprimir(persona1);
        imprimir(persona2);
        
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }
    
    //Método para impirmir una persona
    public static void imprimir(Persona persona){
        System.out.println("Persona: " + persona);
    }
    
    //Getter para obtener el contador
    public int getContador(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
}
