package test;

import domain.Cliente;
import domain.Empleado;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Nelson", 145.41);
        System.out.println("empleado1 = " + empleado1);

        Date fecha1= new Date();

        Cliente cliente1 = new Cliente(fecha1, true, "Jorge", 'M', 65, "25 de mayo 314");
        System.out.println("cliente1 = " + cliente1);
    }
}