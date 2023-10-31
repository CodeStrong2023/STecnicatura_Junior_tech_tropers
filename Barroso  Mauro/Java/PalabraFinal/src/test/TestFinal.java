package test;

/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo de donde
se aplique
variables:
    variables: Evita cambiar el valor que almacena la variable
    métodos: Evita que se modifique la definición o el comportamiento
            de un metodo desde una subclase (hija).
    clase: Evita que se creen clases hijas
Otras caracteristica es que normalmente, cuando trabajamos con variables
se combina con el modificador de acceso estático para convertir una 
variable en una constante, es decir que no se puede modificar su valor,
el ejemplo de esto es la clase Math en la cuál todos sus atributos
son de tipo static y final, es por eso que la variable pi* se conoce
como una constante.
 */

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 41885316;
        System.out.println("miDni = " + miDni);
//        miDni = 1145121452; // no se puede modificar una constante final
//        Persona.CONSTANTE_AQUI = 9; // No se modifica
        System.out.println("Mi atributo constante es = " + Persona.CONSTANTE_AQUI);

        final Persona persona1 = new Persona();
//        persona1 = new Persona(); // No se puede asignar una nueva referencia
        persona1.setNombre("Mauro");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        persona1.setNombre("Barroso");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());

    }
}