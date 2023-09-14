
package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); //Constructor
        persona1.nombre = "Mauro";
        persona1.apellido = "Barroso";
        persona1.obtenerInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Danilo";
        persona2.apellido = "Muñoz";
        persona2.obtenerInformacion();
        
        
        
    }
}
