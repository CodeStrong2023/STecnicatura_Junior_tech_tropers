
package test;

//Importamos la clase persona porque se encuentra en otro package
import dominio.Persona;
//Usamos * para importar todas las clases
import dominio.*;


public class PersonaPrueba {
    public static void main(String[] args) {
        //Creamos un objeto persona de la clase Persona
        Persona persona1 = new Persona("Pedro", "Argento", 60000, false);
        //Creamos un segundo objeto llamado persona2
        Persona persona2 = new Persona("Agustín", "Facundo", 200000, false);
        
        //Modificar a través de los métodos
        persona1.setNombre("Juan Roberto");
        persona1.setApellido("Castellanos");
        System.out.println("El nombre modificado es: " + persona1.getNombre()+ " y el apellido: " + persona1.getApellido());
        System.out.println("Su sueldo es: " + persona1.getSueldo());
        
        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //Imprimir, luego modificar sus valores y volver a imprimir
        
        System.out.println("La persona 2 es: " + persona2.getNombre() + persona2.getApellido());
        //Modificamos los valores
        persona2.setNombre("Carlos");
        persona2.setSueldo(250000);
        //Imprimimos los resultados
        System.out.println("Su nombre modificado es: "+ persona2.getNombre());
        System.out.println("Su sueldo modificado es: "+ persona2.getSueldo());
        
        System.out.println("Persona1: " + persona1);
        
    }
}
