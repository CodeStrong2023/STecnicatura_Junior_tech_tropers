
package domain;


public class Persona {
    public final static int CONSTANTE_AQUI = 15;
    private String nombre;
    
    //Getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public void impirmir(){
        System.out.println("Método imprimir desde la clase padre");
    }
}
