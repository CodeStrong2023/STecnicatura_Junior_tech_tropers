
package test;
import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Franco",57.000, false); 
        System.out.println("Persona1 su nombre es: "+persona1.getNombre());
        //Modificar a traves de los metodos
        persona1.setNombre("Oscar");
         //persona1.nombre = "Franco"; //ya no se puede utilizar 
         //System.out.println("Nombre es: = " + persona1.nombre);
         System.out.println("Persona1 con su nombre modificado: "+persona1.getNombre());
         System.out.println("Persona1 el resultado para el sueldo" +persona1.getSueldo());
         System.out.println("Persona1 para obtener el booleano" +persona1.isEliminado());
         
         //Tarea crear otro objeto de tipo Persona, asignar valores de manera inicial 
         // y imprimir, luego modificar sus valores y volver a imprimir. 
         
         //Orifinal
         Persona persona2 = new Persona("Julieta",60.0,true);
         System.out.println("Nombre persona2: "+ persona2.getNombre());
         System.out.println("Sueldo persona2: "+ persona2.getSueldo());
         System.out.println("Booleano persona 2: " +persona2.isEliminado());
         
         //Modificado
         persona2.setNombre("Nahir");
         persona2.setSueldo(62.0);
         persona2.setEliminado(false);
         System.out.println("Nombre modificado persona2: "+ persona2.getNombre());
         System.out.println("Sueldo modificado persona2: "+ persona2.getSueldo());
         System.out.println("Booleano modificado persona 2: " +persona2.isEliminado());
         
         // Llamando al to.String();
         System.out.println("persona1: "+persona1);
    }
}
