/*
Proyecto caja:
Ejercicio 1: crear un proyecto segun als espesificaciones mostradas
a continuacion: 
La formula es: Volumen = ancho * alto * profundidad
*/
package caja;


public class PruebaCaja {
    public static void main(String[] args) { //Metodo main
        //Variables locales
        int medidaAncho = 3; //Valores ingresados en codigo duro
        int medidaAlto = 2;
        int medidaProf = 6;
        
        Caja caja1 = new Caja(); //Instanciamos el objeto, constructor vacio
        caja1.ancho = medidaAncho;
        caja1.alto = medidaAlto;
        caja1.profundidad = medidaProf;
        int resultado = caja1.calculoVolumen(); //Llamamos al metodo
        
        //Primer resultado
        System.out.println("resultado volumen de caja 1= " + resultado);
        
        Caja caja2 = new Caja(2, 4, 6); //Llamamos al constructor 2
        //con nuevos argumentos.
        // Llamamos al nuevo objeto al metodo par aun nuevo calculo        
        System.out.println("resultado volumen de caja 2 = " + caja2.calculoVolumen());
        
    }
}
