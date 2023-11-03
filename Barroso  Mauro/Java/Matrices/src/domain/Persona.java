package domain;


public class Persona {
    
    //Atributo de la clase
    private String nombre;

    //Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter 
    public String getNombre() {
        return this.nombre;
    }
    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Agregamos método toString por la herencia de la clase Object y vemos el espacio de memoria
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}'+", "+super.toString();
    }

}