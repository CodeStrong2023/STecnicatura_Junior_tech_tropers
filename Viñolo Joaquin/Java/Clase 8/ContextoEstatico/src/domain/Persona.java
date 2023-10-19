
package domain;

public class Persona {
    //Cargamos los atributos
    private int idPersona;
    private static int contadorPersona;
    private String nombre;
    
    //Constructor
    public Persona(String nombre){
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; //No utilizamos el contador this porque es un atriburo estático
        //Asignamos un nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersona;
    }
    
    //Creamos los getter and setter
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

    @Override //Anotación, indica que sobreescribimos el método
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
}
