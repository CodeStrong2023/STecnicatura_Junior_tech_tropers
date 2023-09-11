
package Persona;


public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); //Llamamos al constructor
        
        persona1.nombre = "Joaquín"; //El valor hexadecimal normalmente comienza con 0x
        persona1.apellido = "Viñolo";
        persona1.obtenerInformacion();
        
        Persona persona2;
        persona2 = new Persona();
        persona2.nombre = "Roberto";
        persona2.apellido = "Castañas";
        persona2.obtenerInformacion();
    }
    
}
