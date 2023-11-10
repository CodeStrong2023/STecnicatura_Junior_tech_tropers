package test;

import domain.Persona;

/**
 *
 * @author marianela
 */
public class TestArreglosObject {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        //modificamos los valores de los elem que estan en null
        personas[0] = new Persona("Valentino");
        personas[1] = new Persona("Ana");
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);
        //para iterar arreglos de tipo object
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas "+i+" = "+personas[i]);
        }
        
        //sintáxis resumida(vemos el numero de elem dentro de las{}, e inicializamos los valores
        String frutas[] = {"Banana", "Pera", "Durazno"};
        for(int i = 0; i < frutas.length; i++) {
            System.out.println("frutas "+i+" = " + frutas[i]);
        }
    }
}
