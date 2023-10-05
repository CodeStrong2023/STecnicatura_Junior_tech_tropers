package test;

import dominio.Persona; //Colocando * importamos todas las clases que hay dentro del paquete

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Sahir", 40000.00, false);
        //creamos un objeto con los argumentos que necesita el constructor de la clase Persona
        System.out.println("persona1 su nombre es: " + persona1.getNombre());

        //Modificamos a través de los métodos
        persona1.setNombre("Emir"); // a traves de "set" para modificar

        //Con atributos públicos ingresamos así:
        //System.out.println("Nombre es: "+persona1.nombre); /*Asi llamábamos antes cdo los atributos son públicos*/
        //Con atributos privados a través de 'get' e 'is' en caso de boolean
        System.out.println("persona1 su nombre modificado es: " + persona1.getNombre());
        System.out.println("persona1 su sueldo es de: " + persona1.getSueldo());
        System.out.println("persona1 se encuentra eliminad?: " + persona1.isEliminado());
        
        

        /*TAREA: 1:CREAR OTRO OBJETO DE TIPO PERSONA, ASIGNAR VALORES DE MANERA INICIAL E IMPRIMIR, 
                 2:LUEGO MODIFICAR SUS VALORES Y VOLVER A IMPRIMIR*/
        
 /*1:*/
        Persona persona2 = new Persona("Sebastián", 30000.00, false);
        System.out.println("persona2 su nombre es: " + persona2.getNombre());
        System.out.println("persona2 su sueldo es de: " + persona2.getSueldo());
        System.out.println("persona2 se encuentra eliminad?: " + persona2.isEliminado());
 /*2:*/
        persona2.setNombre("Marianela");
        persona2.setSueldo(20000.00);
        persona2.setEliminado(true);

        System.out.println("persona2 su nombre modificado es: " + persona2.getNombre());
        System.out.println("persona2 su sueldo modificado es de: " + persona2.getSueldo());
        System.out.println("persona2 se encuentra modoficado eliminado?: " + persona2.isEliminado());
        /*probanndo "toString":*/
        System.out.println("persona1: "+persona1.toString());
        System.out.println("persona2: "+persona2.toString());
        System.out.println("persona2 = " + persona2);//Lo mismo que *toString*

    }

}
