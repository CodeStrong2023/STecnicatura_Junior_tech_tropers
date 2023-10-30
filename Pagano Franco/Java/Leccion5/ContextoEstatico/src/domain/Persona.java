
package domain;

public class Persona {
    private int idPersona; 
    private static int contadorPersona; 
    private String nombre; 
    
    //constructor 
    public Persona(String nombre){
        this.nombre = nombre; 
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; //No utilizar el operador this
        //Vamos a asignar un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override //Informacion extra
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
}
