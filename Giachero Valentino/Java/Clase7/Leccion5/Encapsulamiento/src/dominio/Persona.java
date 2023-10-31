package dominio;

public class Persona {

    //Atributos:
    //creamos con modificador de acceso tipo "PRIVATE"
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    //constructor: debe llevar mismo nombre que la clase
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre; 
        this.sueldo = sueldo;
        this.eliminado = eliminado;
          
    }
    /* definimos los métodos que necesitamos: get y set: 
                    *clik derecho 
                    *insert code 
                    *getter and setter
                    *seleccionamos los que queremos crear
    */

    public String getNombre() { //get va a retornar el método del atributo
        return nombre;
    }

    public void setNombre(String nombre) { //set es el que modifica
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() { //esta en inglés por eso usa "is"(esta) en el boolean y no "get"
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
}
