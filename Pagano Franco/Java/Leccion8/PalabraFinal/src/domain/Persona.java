
package domain;

//public final class Persona { //Es una clase constante
public class Persona {
    
    public final static int CONSTANTE_AQUI = 15;
    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void main(String[] args) {
        System.out.println("Metodo para imprimir");
    }
}
