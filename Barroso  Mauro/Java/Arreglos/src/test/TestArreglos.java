package test;


public class TestArreglos {
    public static void main(String[] args) { //El lado derecho instanciamos un objeto del tipo object
        int edades[] = new int [3]; //El lado izquierdo declaramos la variable
        System.out.println("edades = " + edades);
        
        //Para modificar elementos del arreglo de a uno:
        
        edades[0] = 17;
        
        //Tarea
        edades[1] = 22; 
        edades[2] = 18;
        //edades[3] = 7; //fuera de rango, error en tiempo de ejecución
        System.out.println("edades 0 = " + edades[0]);
        //Tarea
        System.out.println("edades 1 = " + edades[1]); 
        System.out.println("edades 2 = " + edades[2]);
        //Recorremos todo el arreglo con un ciclo for de índice 0 a índice 2
        for(int i = 0; i < edades.length; i++){
            System.out.println("Edades y sus elementos "+i+": "+edades[i]);
                                     
        }        

    }
}