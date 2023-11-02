
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TesteHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Franco", 45000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Date fecha1 = new Date();
        
        //Cremos el objeto de la clase cliente
        Cliente cliente1 = new Cliente(fecha1, true, "Julieta", 'F', 27, "Av. Julio Roca 1801");
        System.out.println("cliente1 = " + cliente1);
        //RECORDATORIO EL CHAR VA CON COMILLAS SIMPLES
    }
}
