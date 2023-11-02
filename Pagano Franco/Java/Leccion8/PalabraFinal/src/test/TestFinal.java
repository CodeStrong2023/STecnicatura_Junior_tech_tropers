/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo de 
donde se aplique: 
variables: Evita cambiar el valor que almacena la variable
metodos: Evista que se modifica la definicion o el comportamiento
         de un metodo desde una subclase(hija)
clases: Evita que se creen clases hijas
Otras caracteristicas: normalmente, cuando trabajamos con variables se conbina
con el modificador de acceso estatico para convertir una variable en una constante,
es decir, que no se puede modificar su valor, el ejemplo de esto es la clase Math 
en la cual todos sus atributos son de tipo static, final, es por esto que la variable
pi* se conoce como una constante.
*/
package test;

import domain.Persona;


public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 40219256;
        System.out.println("miDni = " + miDni);
        
        //miDni = 40219255; //No se puede utilizar porque es final(constante)
        //Persona.CONSTANTE_AQUI = 9; //No se puede modificar
        System.out.println("Mi atributo constante es = " + Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); //No se puede asignar una nueva referencia
        persona1.setNombre("PAGANO, Franco");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("QUIROGA, Julieta");
        System.out.println("persona1 nombre = " + persona1.getNombre());
    }
}
