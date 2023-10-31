
package domain;

public class Persona {
    public final static int CONSTANTE_AQUI = 15;//Ls constantes simpre van en mayúsculas
    //no se puede modificar
    
    //creamos otro atributo
    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void imprimir(){
        System.out.println("Método para imprimir");
    } 
}
