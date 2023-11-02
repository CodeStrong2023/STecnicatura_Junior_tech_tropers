
package Clases;


public class PruebaPersona {
    public static void main(String[] args) {
        //creación de un nuevo objeto llamando a la Clase Persona
        Persona persona1; //creamos la variable 'persona1' del tipo 'Persona'
        persona1 = new Persona(); //llamamos desde la variable al constructor y convertimos en objeto
        persona1.nombre = "Valentino"; //valor hexagecimal, comienza normalmente con 0 y x
        persona1.apellido = "Giachero";
        persona1.obtenerInformacion(); //llamamos al método que recibe e imprime los valores
        Persona persona2 = new Persona(); //creamos nuevo objeto en Persona
        System.out.println("persona2 = "+persona2);
        System.out.println("persona1 = "+persona1);
        persona2.obtenerInformacion();//no nos muestra nada porque no tiene crgada información
        //cada objeto tiene su propia información, no comparten, si las características o atributos
        //Ahora si añadimos la información
        persona2.nombre = "Juan";
        persona2.apellido = "Leopoldo";
        persona2.obtenerInformacion();
        /*La Clase Persona es la plantilla en la que definimos las caract y los métodos o acciones
        Los objetos persona1 y persona2 son las instancias que creamos de la clase para
        usar las acciones y caract accediendo al valor
        Cada objeto es distinto y se lo llama Instancia*/
        Persona persona3 = new Persona();
        persona3.nombre = "Mariela";
        persona3.apellido = "Estrella";
        persona3.obtenerInformacion();
        System.out.println("persona3 = "+ persona3);
        Persona persona4 = new Persona();
        persona4.nombre = "Mauro";
        persona4.apellido = "Di Nasso";
        persona4.obtenerInformacion();
        System.out.println("persona4 = "+ persona4);
    }
}
