
package Clases;


public class PruebaPersona {
    public static void main(String[] args) {
        //creación de un nuevo objeto llamando a la Clase Persona
        Persona persona1; //creamos la variable 'persona1' del tipo 'Persona'
        persona1 = new Persona(); //llamamos desde la variable al constructor y convertimos en objeto
        persona1.nombre = "Marianela"; //valor hexagecimal, comienza normalmente con 0 y x
        persona1.apellido = "Purretta";
        persona1.obtenerInformacion(); //llamamos al método que recibe e imprime los valores
        Persona persona2 = new Persona(); //creamos nuevo objeto en Persona
        System.out.println("persona2 = "+persona2);
        System.out.println("persona1 = "+persona1);
        persona2.obtenerInformacion();//no nos muestra nada porque no tiene crgada información
        //cada objeto tiene su propia información, no comparten, si las características o atributos
        //Ahora si añadimos la información
        persona2.nombre = "Sebastián";
        persona2.apellido = "Siri";
        persona2.obtenerInformacion();
        /*La Clase Persona es la plantilla en la que definimos las caract y los métodos o acciones
        Los objetos persona1 y persona2 son las instancias que creamos de la clase para
        usar las acciones y caract accediendo al valor
        Cada objeto es distinto y se lo llama Instancia*/
    }
}
