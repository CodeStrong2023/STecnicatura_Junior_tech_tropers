
package Clases;

public class PruebaPersonas {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); //Llamamos al constructor (Metodo especial)
        persona1.nombre = "Franco"; //El valor hexadecimal normalmente comieza con 0x
        persona1.apellido = "Pagano";
        persona1.obtenerInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Julieta";
        persona2.apellido = "Quiroga";
        persona2.obtenerInformacion();
    }
}
