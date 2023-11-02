
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Valentino", 45000.0 );
        System.out.println("empleado1 = " + empleado1);
        
        Date fecha1 = new Date();
        
        Cliente cliente1 = new Cliente(fecha1, true, " Carlos", 'M', " Bufano 241", 50);
        System.out.println("cliente1 = " + cliente1);
    }
         
}
