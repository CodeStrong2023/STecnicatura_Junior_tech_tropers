package domain;

public class Persona {

    //Cargamos los atributos:
    private int idPersona;
    private static int contadorPersona;//contador hará que aumente id por cada variable creada
    private String nombre;

    //Constructor: creamos el constructor con parámetros
    public Persona(String nombre) {
        this.nombre = nombre;
        //Incrementamos el contador por cada objeto nuevo
        Persona.contadorPersona++; // no usamos this usamos la clase. el atributo static
        //Asignamos nuevo valor a la variable idPersona:
        this.idPersona = Persona.contadorPersona;

        //Generamos los getters and setters y encapsulamos    
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }

    public int getIdPersona() {
        return this.idPersona; //agregamos los this.
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//creamos el método toString(igual que los getters y setters)

    @Override //<- agrega información extra al método toString
    public String toString() {
        //aqui sobreescribimos el método heredado de la clase object
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

}
