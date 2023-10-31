
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(7, 9);
        System.out.println("resultado = " + resultado);
        //llama al método sumar double y sumar int
        var resultado2 = Operaciones.sumar(5.0, 7);
        System.out.println("resultado2 = " + resultado2);
        //ejecuta el método double porque el segundo valor no soporta un long, entonces lo 
        //reemplaza por double
        var resultado3 = Operaciones.sumar(8, 6L);
        System.out.println("resultado3 = " + resultado3);
    }
}
