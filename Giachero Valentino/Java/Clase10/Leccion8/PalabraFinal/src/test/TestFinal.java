/*PALABRA FINAL:
Tiene distintos significados dependiendo de donde se aplique:
    variables:Evita cambiar el valor que almacena la variable
    métodos: Evita que se modifique la definición o el comportamiento de un método
    desde una subclase -hija-
    clases: Evita qie se creen clases hijas
    Otra caract es que normalmente, cuando trabajamos con variables se combina
    con el modificador de acceso estático para convertir una variable en una constante, 
    es decir, que no se puede modificar su valor, el ejemplo de esto es la clase "Math"
    en la cual todos sus atributos son de tipo -static- y -final-, es por eso que 
    la variable pi* se conoce como una constante*/

package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 32133498;
        System.out.println("miDni = " + miDni);
        //miDni = 32708112;
        //Persona.CONSTANTE_AQUI = 9; //No se modifica
        System.out.println("Mi atributo constante es: " + Persona.CONSTANTE_AQUI );   
        //creamos una variable, objeto de la clase Persona
        final Persona persona1 = new Persona(); // Se crea un constructor por default en el código
        // persona1 = new Persona(); //no se puede asignar una nueva referencia por el final
        persona1.setNombre("Valentino Giachero");
        System.out.println("persona1 nombre: "+persona1.getNombre());
        persona1.setNombre("Ana Giachero");//no se puede hacer una ueva referencia
        //para un nuevo objeto pero si se puede modificar el valor del atributo
        System.out.println("persona1 nombre: "+persona1.getNombre());
    }
}

