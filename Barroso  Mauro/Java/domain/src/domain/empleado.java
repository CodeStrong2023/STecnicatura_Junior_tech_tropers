package domain;

import java.util.StringJoiner;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; // Es para incrementar

    // Constructor
    public Empleado(String nombre, double sueldo) {
        super(nombre); // Esto se utiliza si se necesita llamar a un atributo del padre
        this.idEmpleado = ++Empleado.contadorEmpleados;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }


    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

//    @Override
//    public String toString() {
//        // Esto es lo mas usado y es generico para los lenguajes
//        return String.format("Empleado:{ idEmpleado=%d, sueldo=%f}", this.idEmpleado, this.sueldo);
//    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", =").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}

