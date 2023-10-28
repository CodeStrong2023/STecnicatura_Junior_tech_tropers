/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo de
donde se aplique
    Variables: evita cambiar el valor que almacena la variable
    Metodos: evita que se modifique la definicion o el comportamiento de un
                metodo desde una subclase (hija)
    Clases: evita que se creen clases hijas

Otra caracteristica es que normalmente, cuando trabajamos con variables se combina
con el modificador de acceso estatico para convertir una variable en una constante,
es decir que no se puede modificar su valor, el ejemplode esto es la clase Math
en la cual todos sus atributos son de tipo static y final, es por esto que la
variable pi* se conoce como una constante.
*/
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 38416993;
        System.out.println("miDni = " + miDni);
        // miDni = 20123123; //No se puede modificar.
        // Persona.CONSTANTE_AQUI = 9; //No se modifica
        System.out.println("Mi atributo constante es: " +Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
        // persona1 = new Persona();  No se puede asignar una nueva referencia
        persona1.setNombre("Ariel Betancud");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Yamil Jesus");
         System.out.println("persona1 nombre = " + persona1.getNombre());
        // Se modifica el valor del atributo
    }
}
