package domain;

public class Persona {
    private int idPersona;
    // tambien permite que no se reinicie
    private static int contadorPersona; // Esta asociado solo a la clase y no al OBJETO
    private String nombre;

    // Constructor

    public Persona(String nombre) {
        this.nombre = nombre;
        // Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; // No utiliza el operdador this
        // Vamos a asignar un nuevo valor a la viable idPersona
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

    @Override
    public String toString() {
        return "Persona{ " +
                " idPersona= " + idPersona +
                ", nombre= '" + nombre + '\'' +
                '}';
    }
}
