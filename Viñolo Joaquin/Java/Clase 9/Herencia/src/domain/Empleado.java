
package domain;

//Utilizamos la palabra extends para heredar los atributos de la clase persona
public class Empleado extends Persona{
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; //Es para incrementar
    
    //Constructor vacío
    public Empleado(){
        
    }
    
    //Constructor 
    public Empleado(String nombre , double sueldo){
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleados;
        this.sueldo = sueldo;
    }
        
    //Getter and setter
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
   
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
