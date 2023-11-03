
package domain;

/**
 *
 * @author marianela
 */
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//agregamos toString por la herencia de la clase Object y vemos el espacio de memoria
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}'+", "+super.toString();
    }
    
    
}
