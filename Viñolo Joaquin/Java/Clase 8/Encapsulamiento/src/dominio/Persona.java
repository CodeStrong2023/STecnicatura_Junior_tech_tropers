
package dominio;


public class Persona {
    //Atributos de la clase persona
    private String nombre;
    private String apellido;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(){
        
    }
    
    //Constructor de la clase persona
    public Persona(String nombre, String apellido, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    
    //Getter and setter de la clase persona
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    //Convierte en una cadena cada atributo
    public String toString(){
        return "Persona [nombre: " + this.nombre +  
                ", Sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado +
                " ]";
    }
    
}
