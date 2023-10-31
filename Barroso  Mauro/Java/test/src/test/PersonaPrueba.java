package test;

// Importamos persona
import dominio.Persona;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        
        // Creamos un objeto de la clase persona
        
        Persona persona1 = new Persona("Mauro", 23.00, false);
        System.out.println("persona1: " + persona1);

        System.out.println("persona1 su nombre es: " + persona1.getNombre());

        // Modificamos a través de los metodos
        
        persona1.setNombre("Mauro Barroso");
        
        //persona1.nombre = ("Mauro Barroso"); // Ya no se puede utilizar porque esta privado
        //System.out.println("Nombre es: "+persona1.nombre); // Error
        
        System.out.println("persona1 su nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: " + persona1.getSueldo());
        System.out.println("person1 para obtener el boolenao: " + persona1.isEliminado());
        System.out.println("persona1: " + persona1);

        // Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial y imprimir, luego modificar sus valores y volver a imprimir
        
        Persona personaN = new Persona("Luci", 21231330.0, false);
        System.out.println("personaN su nombre modificado: " + personaN.getNombre());


        personaN.setNombre("Luci Ponce");
        System.out.println("personaN su nombre modificado: " + personaN.getNombre());
        System.out.println("personaN el resultado para el sueldo: " + personaN.getSueldo());
        System.out.println("personN para obtener el boolenao: " + personaN.isEliminado());
        
        //System.out.println("persona1: " + persona1.toString(persona1));
        System.out.println("personaN: " + personaN);
    }
}
