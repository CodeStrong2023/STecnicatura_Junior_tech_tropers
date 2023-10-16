package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();  //Llamamos al constructor
        persona1.nombre = "Yamil Jesus";
        persona1.apellido = "Yunes";
        persona1.obtenerInformacion();
        
        // Creamos otro objeto
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1); //Nos muestra la direccion de memoria
        
        // Asignamos valores a las variables
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordanini";
        persona2.obtenerInformacion(); 
    }   
}
