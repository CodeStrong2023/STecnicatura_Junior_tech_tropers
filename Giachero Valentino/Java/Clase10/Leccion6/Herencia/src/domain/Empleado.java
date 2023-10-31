
package domain;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;
    //constructores
    public Empleado(){
    this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    
    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        this(); //llamamos al constructor vacío, o llamamos al super o al interno
        this.nombre = nombre; //inicializamos el atributo de la clase padre
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }    
    
}
