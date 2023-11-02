package test;

import domain.Persona;

public class TestArreglosObjetc {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Nelson");
        personas[1] = new Persona("Ezequiel");
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);

        // Iterar ciclo for
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + " = " + personas[i]);
        }

        // Sintaxis Resumida
        String frutas[] = {"Banana", "Uva", "Tomate"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " + i + " = " + frutas[i]);
        }
    }
}