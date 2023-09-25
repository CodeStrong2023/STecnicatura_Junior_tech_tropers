/* Proyecto Caja:
Ejercicio1: crear un proyecto según las especificaciones mostradas 
a continuación.
La fórmula es: volumen = ancho*alto*profundidad
 */
package caja;

public class Caja { //Clase publica caja
    //Atributos (CARACTERÍSTICAS)
    int ancho;
    int alto;
    int profundo;
    //Métodos y constructores(acciones)
    public Caja() { //Constructor1: vacío
    }
    //Constructor con parámetros
    public Caja(int ancho, int alto, int profundo) { //Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcularVolumen() { //Método para calcular
        return ancho * alto * profundo;
    }
}
