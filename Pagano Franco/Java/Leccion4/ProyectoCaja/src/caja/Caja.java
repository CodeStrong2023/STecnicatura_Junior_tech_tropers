/*
Proyecto Caja: 
Ejercicio 1: Crear un proyecto segun las espesificaciones
mostradas a constinuacion
La formula de volumen es: ancho * alto * profundidad
 */
package caja;

public class Caja { //Clase publica caja
    //Atributos (caracteristicas)
    int ancho, alto, profundidad;
    // Metodo y constructores (acciones)
    public Caja(){ //Constructor 1 = vacio
    }
    //Constructor con parametros
    public Caja(int ancho, int alto, int profundidad){
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    public int calculoVolumen() { //Metodo para calcular
        return ancho * alto * profundidad; 
    }
}
