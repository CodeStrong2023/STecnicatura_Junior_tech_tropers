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

public class TestFinal {
    public static void main(String[] args) {
        final int miDni = 32133498;
        System.out.println("miDni = " + miDni);
        //miDni = 32708112;
    }
}

