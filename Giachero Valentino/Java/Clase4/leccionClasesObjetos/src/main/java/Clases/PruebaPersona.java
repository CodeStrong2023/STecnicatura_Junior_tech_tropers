package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); // Llamamos al constructor
        persona1.nombre = "Valentino";
        persona1.apellido = "Giachero";
        persona1.obtenerInformacion();

        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "Mariela";
        persona2.apellido = "Estrella";
        persona2.obtenerInformacion();

    }
}
