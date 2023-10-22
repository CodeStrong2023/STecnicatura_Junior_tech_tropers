
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
        //Creamos un objeto de la clase empleado
        Empleado empleado1 = new Empleado("Harry", 200000.0);
        System.out.println("empleado1 = " + empleado1);
        
       Date fecha1 = new Date();
        
       Cliente cliente1 = new Cliente("Harry 2", fecha1, true, 'M', 34, "Falconete 1919"); 
        System.out.println("cliente1 = " + cliente1);
    }
}
